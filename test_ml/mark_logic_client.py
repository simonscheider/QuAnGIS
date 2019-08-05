class MarkLogicClient:
    def __init__(self, url, username, password, api_version='LATEST'):
        self.session = start_session(username, password)
        self.url = url
        self.api_version = api_version
    
    def create_document(self, uri, data, content_type):
        self.session.put(
            f'{self.url}/{self.api_version}/documents',
            data=data,
            params={'uri': uri},
            headers={'Content-type': content_type}
        )

    def create_xml(self, uri, data):
        self.create_document(uri, data, 'application/xml')
    
    def create_json(self, uri, data):
        self.create_document(uri, data, 'application/json')
    
    def create_triples_ttl(self, data, graph=None):
        params = {'graph': 'default'}
        if graph is not None:
            params['graph'] = graph
        self.session.post(
            f'{self.url}/{self.api_version}/graphs',
            data=data,
            params=params,
            headers={'Content-type': 'text/turtle'}
        )

def start_session(username, password):
    import requests
    from requests.auth import HTTPDigestAuth
    session = requests.Session()
    session.auth = HTTPDigestAuth(username, password)
    return session