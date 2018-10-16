FROM mdillon/postgis:9.6

MAINTAINER maruhachi

# locale settings.
RUN localedef -i ja_JP -c -f UTF-8 -A /usr/share/locale/locale.alias ja_JP.UTF-8
ENV LANG ja_JP.UTF-8

# db intial sql's copy.
ENV POSTGRES_USER doko
ENV POSTGRES_DB dokohome
COPY init_sql/*.sql /docker-entrypoint-initdb.d/
