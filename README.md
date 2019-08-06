# QuAnGIS

This repository contains code developed in the research project [*Question-based analysis of Geographic Information with Semantic Queries (QuAnGIS)*](https://questionbasedanalysis.com). This project is funded by the European Research Council (ERC) under the European Union’s Horizon 2020 research and innovation programme (grant agreement No 803498).

## Requirements

* [Python 3.6.x+](https://www.python.org/downloads/)
* [Virtualenv](https://virtualenv.pypa.io/en/latest/)
* (If on Windows) [Git Bash](https://git-scm.com/downloads)

## Set-up

To set it up, you will first have to run the setup script:

```sh
 ./setup.sh
```

This script will make a virtual Python environment and install necessary packages.

### Database credentials

The script above will also create a file, `.env`.
The `.env` file is not checked into the repository for security reasons.
Enter the necessary credentials in the `.env` file:

* Database URL
* Database username
* Database password

Make sure that you don't accidentally enter the credentials in the wrong file and push it to the repository!

## Activating the virtual environment

After this, you can activate the virtual environment:

(in UNIX)
```sh
source ./venv/bin/activate
```

(in Git Bash for Windows)
```sh
source ./venv/Scripts/activate
```

You will have to activate the virtual environment every time you open a new shell.

## Running the tests

Now you can run the tests:
```sh
python -m pytest
```
