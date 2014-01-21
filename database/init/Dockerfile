# Initializes a Postgres database in /data. Requires a data volume
# from another container. After initialization, an application
# database with regular and admin users is created. Intended to be run
# only once on a given volume.

FROM christianberg/postgresql-9.3
MAINTAINER Christian Berg <berg.christian@gmail.com>

ADD create_database.sh /tmp/create_database.sh

ENV PGDATA /data
USER postgres
CMD ["/tmp/create_database.sh"]