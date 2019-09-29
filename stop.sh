#!/bin/bash

docker stop $(docker ps -q --filter ancestor="search-opportunity-api")
