# CommercialTrading_OODP

Object Orientation with Design Patterns
 Module Title: Assignment Type: Project Title:
Project Date: Assignment Compiler: Weighting:
Due Date:
Method of Submission:
Assignment Introduction
Object Orientation with Design Patterns Practical CA
Commercial Trading
April 2021
Amilcar Aponte (amilcar@cct.ie)
35%
Saturday, 15th May 2021
Late submissions will be accepted until Friday, 21st May 2021 @ 23:59 with a flat penalty of 10% of the grade awarded. Moodle uploader link
Email submission will not be accepted
  You have been asked to design and implement a program that simulates sales of products between two companies.
• BIG-A produces : A
• BIG-B produces : B
• BIG-C produces: C
Each of the companies produces one product and must trade with the other two to buy products. Company BIG-A is a supplier of A's and buys B's and C’s, while company BIG-B is a supplier of B's and buys A's and C’s, and company BIG-C is a supplier of C’s and buys A’s and B’s.
Each company have 50 depots, each containing a varying number of native product and external product. The minimum stock of native product for each depot is 15, and the maximum stock is 50. The same way, each depot can hold a minimum of 3 and a maximum of 40 of the external product.
Specific requirements
You are required to implement the program specification. In order to do this you must implement/customise at least THREE Object Oriented Design Patterns. You also must use best practice in Object Oriented software development and demonstrate knowledge of Object Oriented programming principles.
When the program start running the simulation should start, adhering to the following rules:
• Companies and depots most be created in memory with random values of allowance, stock
(native and external produce) and prices (products and delivery).
• Each depot must have its own product price and delivery price. These should be random
numbers between 1 and 10
• Every depot has a random initial cash allowance between 50 and 100
• Each depot from one company should try to trade with all depots from the other companies
• A depot cannot go below its minimum stock of its native product
• A depot cannot store above its maximum stock of its native product
• A depot cannot go below its minimum stock of its purchase products
• A depot cannot store above its maximum stock of its purchase products
Once the simulation is complete the user should be presented with a menu that allows them to see detailed information about the whole trading simulation:
• See all transactions
• See all transactions for a particular company
• For a given company, detailed information about each of the depots:
o Ownproductstock
o Foreignproductsstock o Cashbalance
