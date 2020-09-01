FROM python:3.6.12-alpine3.12

RUN mkdir /tmp/code && apk update && apk add bash && python --version

WORKDIR /tmp/code

# LABEL selenium_version "$SEL_VER"
COPY requirements.txt .
RUN pip3 install -r requirements.txt && pwd

COPY ./wait-for-it.sh .
RUN chmod +x ./wait-for-it.sh
COPY ./tests/ ./tests
#USER root
#CMD wait-for-it.sh www.localhost:4444 -t 15 -- echo "localhost is up"
#CMD python tests/test1.py
#CMD python tests/test1.py > temp2.log
#CMD echo tests/test2.log
