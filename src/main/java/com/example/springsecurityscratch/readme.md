## MyCrm training application

Customer Relationship Management systems, usually named CRM, is interesting for me because I had worked as salesman earlier, so it is reasonably I am trying to make my own CRM application now, when I became a software developer

I consider CRM must provide to users functionality minimum at least as follows

* User database 
* Customer database with ranking
* History of negotiations with customer (orders and discussions of any kind) 
* Proposal of further action with customer
* Advertisement campaign history

Some features else I could tell right now as they appear upon you think about implementation of very basic functions as above, so I should tell about that consequent features later during creating corresponding classes

### User entity and user account 

First I must consider who should use that software! ;) 
This is a person acting on his own or on behalf of some company, so I have just realized user account model should be created with CRM application really useful for some real people and companies

#### User
human person

#### User account
person or company

### Customer entity and ranking
**Customer**: person or company that buys your products

**Ranking**: measure of significance of doing business with the customer, measure of profitability of negotiations with the customer.
It is very common. Companies make a lot of efforts to move their sales crews making most attention to most important customers, while not always successful with creating proper ranking systems
As a developer I simply consider ranking is a necessary property of customer entity
