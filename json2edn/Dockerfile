FROM oraclelinux:8-slim


LABEL maintainer "ajchemist <1694505+aJchemist@users.noreply.github.com>"


COPY json2edn /json2edn
RUN chmod +x /json2edn


ENTRYPOINT ["/json2edn"]
