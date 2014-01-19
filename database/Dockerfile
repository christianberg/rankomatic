FROM stackbrew/ubuntu:precise
MAINTAINER Christian Berg <berg.christian@gmail.com>

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update
RUN apt-get install -y wget ca-certificates

RUN echo "deb http://apt.postgresql.org/pub/repos/apt/ precise-pgdg main" > /etc/apt/sources.list.d/pgdg.list
RUN wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | apt-key add -

RUN apt-get update
RUN apt-get install -y postgresql-9.3

ADD create_database.sql /tmp/create_database.sql

USER postgres
RUN /usr/lib/postgresql/9.3/bin/postgres --single --config_file=/etc/postgresql/9.3/main/postgresql.conf < /tmp/create_database.sql
CMD ["/usr/lib/postgresql/9.3/bin/postgres", "--config_file=/etc/postgresql/9.3/main/postgresql.conf"]

