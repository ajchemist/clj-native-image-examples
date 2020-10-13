FROM oraclelinux:8-slim


LABEL maintainer "ajchemist <1694505+aJchemist@users.noreply.github.com>"


COPY jetty.bin /jetty.bin
RUN chmod +x /jetty.bin


ENTRYPOINT ["/jetty.bin"]
