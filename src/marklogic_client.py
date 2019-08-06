"""This module has a MarkLogic client that can create various resources on a MarkLogic server."""


class MarkLogicClient:
    """This class can create resources on a MarkLogic server."""

    def __init__(self, url, username, password, api_version='LATEST'):
        self.session = start_session(username, password)
        self.url = url
        self.api_version = api_version

    def create_document(self, uri, data, content_type):
        """Create a document with the given data and content."""
        return self.session.put(
            f'{self.url}/{self.api_version}/documents',
            data=data,
            params={'uri': uri},
            headers={'Content-type': content_type}
        )

    def create_xml(self, uri, data):
        """Create an XML document with the given data."""
        return self.create_document(uri, data, 'application/xml')

    def create_json(self, uri, data):
        """Create JSON document with the given data."""
        return self.create_document(uri, data, 'application/json')

    def create_triples(self, data, content_type, graph=None):
        """Add (merge) the given triples in the given data to the default graph, or when `graph` is
        given, add it to that graph.
        """
        if graph is not None:
            params = {'graph': graph}
        else:
            params = {'default': ''}
        return self.session.post(
            f'{self.url}/{self.api_version}/graphs',
            data=data,
            params=params,
            headers={'Content-type': content_type}
        )

    def create_triples_rdf_xml(self, data, graph=None):
        """Add (merge) the given RDF/XML triples in the given data to the default graph, or when
        `graph` is given, add it to the graph with that name.
        """
        return self.create_triples(data, 'application/rdf+xml', graph=graph)

    def create_triples_ttl(self, data, graph=None):
        """Add (merge) the given Turtle triples in the given data to the default graph, or when
        `graph` is given, add it to the graph with that name.
        """
        return self.create_triples(data, 'text/turtle', graph=graph)


def start_session(username, password):
    """Start a new session using digest authentication and the given credentials."""
    import requests
    from requests.auth import HTTPDigestAuth
    session = requests.Session()
    session.auth = HTTPDigestAuth(username, password)
    return session
