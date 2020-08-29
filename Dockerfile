FROM python:3.6.12-alpine3.12

RUN mkdir /tmp/code

WORKDIR /tmp/code

# install requirements
COPY requirements.txt .
RUN pip3 install -r requirements.txt

RUN pwd
COPY ./wait-for-it.sh .
COPY ./tests/ ./tests
USER nonroot:root
CMD /wait-for-it.sh www.localhost:4444/wd/hub -- echo "localhost is up"
CMD python tests/test1.py
CMD python tests/test1.py > temp2.log
CMD echo tests/test2.log
