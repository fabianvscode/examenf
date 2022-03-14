FROM postgres:9.6.1-alpine

COPY database.sh /docker-entrypoint-initdb.d/

RUN chmod +x /docker-entrypoint-initdb.d/*.sh

