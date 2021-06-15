# standAloneAUTHORIZATIONserver

This is stand alone AuthorizationServer.It does require Db Repo and userdetailservice.
It uses the private key and creates token and the creates signature.


Sample Request for getting Token

curl --location --request POST 'http://localhost:9092/oauth/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Basic Y291cG9uY2xpZW50YXBwOjk5OTk=' \
--header 'Cookie: JSESSIONID=CC2B758F85008DA9A5E3DE9807AC463F' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=admin' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'scope=read write'
