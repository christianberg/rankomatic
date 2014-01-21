#!/bin/bash
/usr/lib/postgresql/9.3/bin/initdb
/usr/lib/postgresql/9.3/bin/postgres --single <<EOF
CREATE USER rankomatic_admin PASSWORD '${CONF_ADMIN_DB_PASSWORD}';
CREATE USER rankomatic PASSWORD '${CONF_USER_DB_PASSWORD}';
CREATE DATABASE rankomatic OWNER rankomatic_admin;
EOF
