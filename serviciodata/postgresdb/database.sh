#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

     CREATE USER admin PASSWORD 'admin';

     CREATE DATABASE user_red OWNER admin;
     GRANT ALL PRIVILEGES ON DATABASE user_red TO admin;

     CREATE DATABASE admin_user OWNER admin;
     GRANT ALL PRIVILEGES ON DATABASE admin_user TO admin;

     CREATE DATABASE chat_red OWNER admin;
     GRANT ALL PRIVILEGES ON DATABASE chat_red TO admin;

     CREATE DATABASE content_red OWNER admin;
     GRANT ALL PRIVILEGES ON DATABASE content_red TO admin;

     CREATE DATABASE notifications OWNER admin;
     GRANT ALL PRIVILEGES ON DATABASE notifications TO admin;

     EOSQL