FROM christianberg/postgresql-9.3
MAINTAINER Christian Berg <berg.christian@gmail.com>

VOLUME ["/data"]

ADD create_database.sh  /tmp/create_database.sh
ADD create_database.sql /tmp/create_database.sql

CMD ["/tmp/create_database.sh"]