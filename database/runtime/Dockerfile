# Image for runnning a Postgres server. Requires a /data volume from
# another container.

FROM christianberg/postgresql-9.3
MAINTAINER Christian Berg <berg.christian@gmail.com>

ADD config/pg_hba.conf /etc/postgresql/9.3/main/pg_hba.conf
ADD config/postgresql.conf /etc/postgresql/9.3/main/postgresql.conf

ENV PGDATA /data
EXPOSE 5432
USER postgres
CMD ["/usr/lib/postgresql/9.3/bin/postgres", "--config_file=/etc/postgresql/9.3/main/postgresql.conf"]
