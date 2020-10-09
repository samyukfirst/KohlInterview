# KohlInterview
I have sent the answers for the below questions
1)Expose API to get all the data grouped by short and long positions
Answer:
http://localhost:8080/api/item/group_by_side/

2)Expose API to send only data requested, for ex user might be interestd in only 
 Security ID, Current Position, and Current Price. Also user might have option to order data based on any of the field
Answer:
GET Calls:
http://localhost:8080/api/item/
http://localhost:8080/api/item?securityId="AEO"

POST Call:
curl --request POST 'http://localhost:8080/api/item/' \
--header 'Content-Type: application/json' \
--data-raw ' {
        "id": 6,
        "portfolioName": "Portfolio 3",
        "side": "Long",
        "securityId": "AEO",
        "accountName": "10001",
        "sodPosition": 503121,
        "positionFilled": 0,
        "currentPosition": 503121,
        "closePrice": 0,
        "currentPrice": 53.835
    }'

3)If data does not exists for requested field or any error API should throw appropriate message.

4)If time permits implement global logging and exception handling. Log all the data requested by customers.
