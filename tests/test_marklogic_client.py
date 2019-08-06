"""Test the MarkLogic client"""

from src.marklogic_client import MarkLogicClient


def enable_http_logging():
    """Enable low-level HTTP logging to stdout."""
    import logging
    import http.client as http_client
    http_client.HTTPConnection.debuglevel = 1
    logging.basicConfig()
    logging.getLogger().setLevel(logging.DEBUG)
    requests_log = logging.getLogger("requests.packages.urllib3")
    requests_log.setLevel(logging.DEBUG)
    requests_log.propagate = True


def load_credentials():
    """Load MarkLogic credentials from the .env file."""
    import os
    from dotenv import load_dotenv
    load_dotenv()
    return (
        os.getenv('MARKLOGIC_URL'),
        os.getenv('MARKLOGIC_USERNAME'),
        os.getenv('MARKLOGIC_PASSWORD')
    )


def make_client():
    """Make a MarkLogic client with credentials from the .env file."""
    ml_url, ml_user, ml_pwd = load_credentials()
    return MarkLogicClient(ml_url, ml_user, ml_pwd)


def test_create_documents():
    """Test creating documents"""
    enable_http_logging()

    client = make_client()

    # Upload some XML
    with open('tests/test_data/test_data.xml', 'r+b') as file_handle:
        response = client.create_xml('tests/xml', file_handle)
        assert response.ok

    # Upload some JSON
    with open('tests/test_data/test_data.json', 'r+b') as file_handle:
        response = client.create_json('tests/json', file_handle)
        assert response.ok


def test_create_triples():
    """Test creating triples"""
    enable_http_logging()

    client = make_client()

    # Upload some triple
    with open('tests/test_data/test_data.ttl', 'r+b') as file_handle:
        response = client.create_triples_ttl(file_handle, graph='tests')
        assert response.ok
