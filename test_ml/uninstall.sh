#!/usr/bin/env sh

# This script removes the virtual Python environment and 

read -p "This will remove the virtual Python environment and the database credentials. Are you sure? (y/n) " -n 1 -r
echo
if [[ $REPLY =~ ^[Yy]$ ]]
then
    rm -rf venv
    rm .env
fi
