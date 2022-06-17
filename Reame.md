docker exec -it postgres-Hp3K psql -U postgres

\l

CREATE DATABASE student;
\du
GRANT ALL PRIVILEGES ON "student" to postgres
GRANT ALL PRIVILEGES ON DATABASE "student" to postgres

\c student
\d

sudo lsof -i -P | grep LISTEN | grep :$PORT
\d student