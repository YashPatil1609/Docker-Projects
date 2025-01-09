# nginx/Dockerfile
FROM nginx:latest

# Remove the default configuration file
RUN rm /etc/nginx/conf.d/default.conf

# Copy your custom Nginx configuration file
COPY ./nginx.conf /etc/nginx/nginx.conf
