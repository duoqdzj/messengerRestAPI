# messengerRestAPI

### Overview
- The messenger-api' is responsible for send messege and get the statistics.

### messenger-api
- Spring boot(Server) to develop RESTful web services and microservices.

### Description:

**'Messenger-api'** is a REST API service using a monolithic architecture for manipulating data. API is divided into several layers:

- Classes
- Configuration
- Entities
- Repositories
- restControllers
- Security
- Services


**Entities**
- Client
- Message


**Services**
- ClientService
- MessageService

**Classes**
- ClientsCount
- MessageFirstDate
- MessageLastDate
- MessagesAvarageLength
- MessagesCount
- MessageLastText


### Prerequisites
- JDK 11
- Spring Boot
- Spring RestController
- Swagger
- H2 database



### Repository
- [repo](https://github.com/duoqdzj/TasksLoggingAPI)

### These are the API's

- Create client : /client
- Edit task : /client
- Delete client : /client/Id
- Get all client : /client

- Create message : /creatMessage
- Edit message : /editMessage/id
- Delete message : /deleteMessage/Id
- Get all message : /getAllMessage

- Count the clients: /getAllMessage
- Count the client's message:/statistic/messagescount/{username}
- Show the client's first message date: /statistic/messagefirstdate/{username}
- Show the client's last message date: /statistic/messagelastdate/{username}
- Count the average for messages lenght: /statistic/messagesavaragelength/{username}
- Show the last message: /statistic/messageslasttext/{username}
