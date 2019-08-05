#!/usr/bin/env python

from mark_logic_client import MarkLogicClient

# Enables low-level HTTP logging.
def enable_http_logging():
    import logging
    import http.client as http_client
    http_client.HTTPConnection.debuglevel = 1
    logging.basicConfig()
    logging.getLogger().setLevel(logging.DEBUG)
    requests_log = logging.getLogger("requests.packages.urllib3")
    requests_log.setLevel(logging.DEBUG)
    requests_log.propagate = True

def load_credentials():
    import os
    from dotenv import load_dotenv
    load_dotenv()
    return (os.getenv('MARKLOGIC_URL'), os.getenv('MARKLOGIC_USERNAME'), os.getenv('MARKLOGIC_PASSWORD'))

if __name__ == '__main__':
    ml_url, ml_user, ml_pwd = load_credentials()
    enable_http_logging()

    client = MarkLogicClient(ml_url, ml_user, ml_pwd)

    # Upload some XML
    with open('test_data/test_data.xml') as file_handle:
        client.create_xml('xml/test', file_handle)

    # Upload some JSON
    with open('test_data/test_data.json') as file_handle:
        client.create_json('json/test', file_handle)
    
    # Upload a triple
    with open('test_data/test_data.ttl') as file_handle:
        client.create_triples_ttl(file_handle)