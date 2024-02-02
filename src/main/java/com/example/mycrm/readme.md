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

## Business Actions Overview

Hiring, Firing and Moving personal in company

| Action                                                                                                                                                                                                                           | Classes Involved                                                      | Notes                                                           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|-----------------------------------------------------------------|
| Hiring, Firing and Moving personal in company                                                                                                                                                                                    | Person, BusinessEntity, JobPosition, BusinessEntityStaffTable, Event  |                                                                 |
| Starting and terminating the project, update status                                                                                                                                                                              | Project, BusinessEntity, Person                                       |                                                                 |
| Assigning and Reassigning project responsible person and crew                                                                                                                                                                    | Person, Project, Event                                                |                                                                 |
| Negotiations with customer (acquaintance, discussion, selling products - sending proposal, deal made: signing contract, accepting proposal, receiving order, order confirmation; <br/>shipment of some goods, receiving payment) | Person, BusinessEntity, Deal, _Order, Shipment, CommercialItem, Event | Classes to create: Order, Shipment, Materials (Goods), Position |
| Metrics measurement, delivery metrics data to company sales personnel and management                                                                                                                                             | Person, BusinessEntity, Indicator                                     |                                                                 |

## How it usually goes in B2B company...

Now I have to remind how it goes in real commercial company

Let's skip initial stage of company establishing.

So, we have to model actions as below

* Company hires salesperson
* Salesforce starts acquiring customers
* At the first contact sales person puts customer's data to database where customer entity is created. Standard project
  is created by default ("automatically") upon customer entity ("customer card") created. Next projects are started upon
  company establish ones. Also activity with particular product or selected by some criteria could be considered a
  project. Upon each contact sales person makes a report
* Salesperson contacts customers to learn their demand for products of the company
* Salesperson provides a proposal to customer in response to request for quotation (RFQ) which could be composed by
  customer as dedicated document or clearly expressed by customer via any kind of communication
* Then usually goes several discussions and advances of proposal
* Customer gives order to sales person with official purchase order or informal message that clearly means customers
  decided to place order as discussed before
* Salesperson puts customers order to the system
* Deal gets approved by all parties
* Company ships ordered item to customer
* Salesperson keep negotiating with customers to acquire more orders

CRM system must provide to users functionality of standard CRUD operations with entities modelling customers, projects,
goods, contracts and other kind of deals, and, of course, business logic depending on particular company, because each
company
has its own rules on negotiating with customers, composing messages to customer, contract forms, etc.
<br>I guess business logic is mostly interesting for real companies while they have very knowledge about data storage
technology
<br>CRM must provide general operations with database and implementation of business logic by combining proper set of
general operations

CRUD for customer card (customer data entity) and customer details
CRUD for report on negotiation with customer
CRUD for outgoing message to customer
CRUD for products and product details
CRUD for incoming message from customer
CRUD for sales proposal
CRUD for deal
CRUD for project

Generally, customer negotiation flow is as follows:
<br> 1. Contact customer to learn his demand => 2. If customer is new then create customer file => 3. Compose a
report => 4. Provide offer to customer => 5. Compose a report => 6. Make a deal with customer => 7. Compose a report =>
8. Provide [contract] and invoice to customer => 9. Compose a report => 10. Fulfill contract (deliver order) => 11. Get
customer's whereabouts or do something else to have a possibility to meet customer => 12. Go to p.1

1. Contact customer to learn his demand
2. If customer is new then create customer file
3. Compose a report
4. Provide sales proposal to customer
5. Compose a report
6. Make a deal with customer
7. Compose a report
8. Provide [contract] and invoice to customer
9. Compose a report
10. Fulfill contract (deliver order)
11. Compose a report
11. Get customer's whereabouts or do something else to have a possibility to meet customer
12. Go to p.1

Generally, each engagement with customer must be reported to CRM
Simply:
everything done or happened with participating of customers must be reported

### **Each report must have information regarding:**

* timing,
* author,
* involved parties, projects, products, issues
* achieved results and appeared obligations,
* **schedule of next actions with involved parties and others**

### **Commercial B2B companies have complicated business processes consisted of sequences of elementary actions as
follows**

* Starting business
* Hiring sales persons and other employee
* Contacting customer (email, meeting in office or exhibition, phone call, messenger chat, sending a package by courier
  service or normal mail, etc.)
* Making a deal
* Fulfillment of obligations

Let's consider entities and operations required to implement functionality as above

| Business action   | Entities               | Operations besides (layer upper of) CRUD                                                                                     | Note                                                                                     |
|-------------------|------------------------|------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| Starting business | BusinessEntity, Person | Assigning particular BusinessEntity instance as our company, keep report on this<br>Assigning company head, keep it reported | Need to consider how to keep details of our company and event of creation of our company |
|                   |                        |                                                                                                                              |                                                                                          |

## What about project and metrics?!

Must consider about it!!