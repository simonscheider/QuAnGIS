#!/usr/bin/env sh

echo "Setting up new virtual Python environment...";

if [ -d "venv" ]; then
  echo "Virtual Python environment already exists. Run \`uninstall.sh\` if you want to remove it.";
else
    virtualenv venv;
    if [[ "$OSTYPE" == "msys" ]]; then
      # On Windows the virtualenv binaries as in the `Scripts` directory.
      source venv/Scripts/activate;
    else
      # Otherwise, assume we are in a normal UNIX environment.
      source venv/bin/activate;
    fi
    pip install -r requirements.txt;
fi

echo "Setting up config file...";

cp -i .env.template .env;

echo "Done!";
