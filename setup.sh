#!/bin/bash

echo "Setting up new virtual Python environment...";

if [ -d "venv" ]; then
  echo "Virtual Python environment already exists! Run \`clean.sh\` if you want to remove it.";
else
    if [[ "$OSTYPE" == "msys" ]]; then
      # Assume that `virtualenv` installs a Python 3 environment.
      virtualenv venv;
      # On Windows the virtualenv binaries as in the `Scripts` directory.
      source venv/Scripts/activate;
    else
      # Otherwise, assume we are in a normal UNIX environment.
      virtualenv venv --python=python3;
      source venv/bin/activate;
    fi
    pip install -r requirements.txt;
fi

echo "Setting up config file...";

cp -i .env.template .env;

echo "Done!";
