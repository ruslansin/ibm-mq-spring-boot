# IBM MQ Demo

Process incoming POST requests and send messages using `JmsTemplate`.
Receive messages using `@JmsListener` and print them.

Docker:

`docker stack deploy docker-compose.yml ibmmq`

Send request:
```bash
curl --location --request POST 'http://localhost:8080/send' \
--header 'Content-Type: application/json' \
--data-raw '{
	"message": "hello"
}'
```

