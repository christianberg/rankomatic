# This image is for creating data containers, i.e. containers that
# hold on to data volumes, but don't run. It only inherits from
# postgresql-9.3 to make sure the postgres user and group are present
# with the correct IDs.

FROM christianberg/postgresql-9.3
MAINTAINER Christian Berg <berg.christian@gmail.com>

VOLUME ["/data"]

CMD ["chown", "postgres:postgres", "/data"]