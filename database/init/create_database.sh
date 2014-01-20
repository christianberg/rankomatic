#!/bin/bash
chown postgres:postgres $PGDATA
su -c /usr/lib/postgresql/9.3/bin/initdb postgres
su -c "/usr/lib/postgresql/9.3/bin/postgres --single" postgres < /tmp/create_database.sql
