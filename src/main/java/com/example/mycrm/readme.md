## MyCrm training application

Customer Relationship Management systems, usually named CRM, 
is interesting for me because I had worked as salesman earlier, 
so it is reasonably I am making backend CRM application now

I consider CRM must provide to users functionality minimum at least as follows

* User database 
* Customer database
* History of negotiations with customer (orders and discussions of any kind) 
* Proposal of further action with customer and other counterparty
* Advertisement campaign history
* Instant customer ranking and employee KPIs

Some features else I could tell right now as they appear upon you think about implementation of very basic functions as above, so I should tell about that consequent features later during creating corresponding classes

### User entity and user account 

First I must consider who should use that software! ;) 
<br>This is a person acting on his own or on behalf of some company, so I have just realized user account model should be created with CRM application really useful for some real people and companies

#### User
human person

#### User account
person or company

### Customer entity and ranking
**Customer**: person or company that buys your products

**Metrics**: measure of significance of doing business with the customer, measure of profitability of negotiations with the customer.
It is very common. Companies make a lot of efforts to move their sales crews making most attention to most important customers, 
while not always successful with creating proper ranking systems. 
Also ranking is applied to measure results of employees.
Sure, metrics are pretty different for customers and employees
Model metrics is Set of Indicator entities.

Let's try to resume about models we created

| Group of entities | Class          | Notes                                                                                                                                                                                                                               |
|-------------------|----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| People            | Person         | Has fields of PersonProps class and Set<Indicator> field for metrics                                                                                                                                                                |
| Business entities | BusinessEntity | Customers, suppliers, third parties are represented by BusinessEntity Class<br>Contains field of BusinessEntityType                                                                                                                 |
| Events            | Event          | Everything happened with company business: hiring and layoff personnel, contacting customers, shipping out orders, etc. ... i.e. any business action which company performs                                                         |
| Business process  | Project        | Initially is a way to describe activity of company aimed to get and fulfill customer order. Could be applicable for advertisement campaign and other activity that required multiple contacting external or internal counterparties |
| Business action   |  | Will use eventType filed of BusinessEventType enum type to model action performed in company                                                                                                                                        |


To do next: scratch simple description of business actions and process in B2B company
<br>Then implement that! ;)