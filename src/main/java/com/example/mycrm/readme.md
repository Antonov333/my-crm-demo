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

| Group of entities         | Class            | Notes                                                                                                                                                                                                                                                     |
|---------------------------|------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| People                    | Person           | Has fields of PersonProps class and Set<Indicator> field for metrics, intended to model employees of company and its' counterparties                                                                                                                      |
| Business entities         | BusinessEntity   | Customers, suppliers, third parties are represented by BusinessEntity Class<br>Contains field of BusinessEntityType                                                                                                                                       |
| Events                    | Event            | Everything happened with company business: hiring and layoff personnel, contacting customers, shipping out orders, etc. ... i.e. any business action which company performs                                                                               |
| Business process          | Project          | Initially is a way to describe activity of company aimed to get and fulfill customer order. Could be applicable for advertisement campaign and other activity that required multiple contacting external or internal counterparties                       |
| Business action           |                  | Will use eventType and other fields of BusinessEventType enum type to model actions performed by company and its' counterparty                                                                                                                            |
| Products                  | Product          | Product entity models all selling and buying things such as physical goods (materials), service, rent, software, information, copyright on intellectual property of state of art by one Product entity                                                    |
| Information and documents | BusinessDocument | Class is to be created to model documents and information of all kinds under CRUD ops and moving inside company and outside to counterparty                                                                                                               |
| Deals                     | Deal             | I guess it is necessary to create dedicated entity to model obligations of parties. Deal entity should have field(s) to keep rights and obligations of all sides of commercial contract: seller and buyer in simplest case, while it may be more parties) |

Business Actions Overview

Hiring, Firing and Moving personal in company

| Action                                                                                                                                                                                                                           | Classes Involved                                                      | Notes                                                           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|-----------------------------------------------------------------|
| Hiring, Firing and Moving personal in company                                                                                                                                                                                    | Person, BusinessEntity, JobPosition, BusinessEntityStaffTable, Event  |                                                                 |
| Starting and terminating the project, update status                                                                                                                                                                              | Project, BusinessEntity, Person                                       |                                                                 |
| Assigning and Reassigning project responsible person and crew                                                                                                                                                                    | Person, Project, Event                                                |                                                                 |
| Negotiations with customer (acquaintance, discussion, selling products - sending proposal, deal made: signing contract, accepting proposal, receiving order, order confirmation; <br/>shipment of some goods, receiving payment) | Person, BusinessEntity, Deal, _Order, Shipment, CommercialItem, Event | Classes to create: Order, Shipment, Materials (Goods), Position |
| Metrics measurement, delivery metrics data to company sales personnel and management                                                                                                                                             | Person, BusinessEntity, Indicator                                     |                                                                 |
