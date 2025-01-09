FROM python:3.14.0a3-alpine3.21

WORKDIR /app

COPY requirements.txt /app

ENV PIP_BREAK_SYSTEM_PACKAGES 1

RUN pip install -r requirements.txt

COPY devops /app

RUN cd devops

ENTRYPOINT ["python3"]
CMD ["manage.py", "runserver", "0.0.0.0:8000"]




