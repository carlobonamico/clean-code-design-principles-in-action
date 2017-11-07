## While you are waiting...

* download the labs from
  * https://github.com/carlobonamico/clean-code-design-principles-in-action

```
git clone https://github.com/carlobonamico/clean-code-design-principles-in-action
```

or plain "Download Zip" from browser



# ABSTRACT
Most developers agree that "Software must be Well-Designed". 

But what is a "Good" Design? 

This workshop presents a core set of Design Principles that will help you make your application easier to implement, change and understand. 

Starting from a focused but realistic specification, we will practice with a Kata where each step introduces a challenge that can be solved by applying different Principles & Patterns.



# TRAINING OBJECTIVES
Through the workshop you will learn to:
* understand the basic dynamics of a complex Software system, and key Design concepts such as Cohesion, Coupling, Abstraction and Impact of Change.
* apply core Design Principles to improve the structure of your applications
* balance the pros & cons of alternative Design choices




# WHO THE WORKSHOP IS DEDICATED TO?
Basically, to all developers! Independently from the language / platform you are developing on, this workshop is for you if:
* you are moving from implementing a detailed specification to designing new features and application
* you are interested in improving your Software Design approach and skills
* you want to develop more robust and maintainable applications with more productivity



# TABLE OF CONTENTS
* What is Software Design? what is a "good" Design?
* Why is it important?
* Key ideas from Event Storming & Domain Driven Design
* Key forces in Software Design

* The Travel Expenses Kata



# TOPICS 
* Single Responsibility Principle for methods
* Single Responsibility Principle for Classes
* Single Responsibility means splitting …
* How to start?



# TOPICS
* Reviewing your Design
* Collaborating with other classes
* Generalizing the model
* Incremental development and Evolutionary Design
* How to continue by yourself: references for further learning



# PREREQUISITES
* Working knowledge and practical experience in one programming language (you should be able to write/compile/test/debug by yourself a program which reads and parses input and presents output either on the command line or in a simple GUI).
* Good knowledge of Object Oriented concepts (Class, Interface, Method, Variable Scope and Visibility) and ability to "read" them from a sketch/diagram
* Basic knowledge of HTTP



# HARDWARE AND SOFTWARE REQUIREMENTS
* Laptop
* Web Browser (Chrome or Firefox)
* Text Editor (Sublime, Atom, Visual Studio Code,…)
* IDE (Eclipse, NetBeans, Intellij, Visual Studio,.. )
* Pen and Paper



## Key references
* All Labs and links available at
  * https://github.com/carlobonamico/clean-code-design-principles-in-action
  
* Clean Code: the book
  * https://books.google.it/books/about/Clean_Code.html?id=hjEFCAAAQBAJ
  

<img src="images/CleanCode.png" >



# What is Software Design? 



# Ideas...
TODO: 


## What often happens
* huge files
* deep interconnections between features
* cross-cutting mechanisms "spread" everywhere
* fragility
* risk of change increases
* productivity decreases over time



# what is a "good" Design?



# Spaghetti code vs encapsulated
<img src="images/codemotion/6.png" >



# Ideas
* reducing cost of development
* reducing cost of change
* making possible to create complex systems
* decoupling unrelated parts
* preventing fragility in the face of changes
* keeping collaboration effective as team grows



# TOPICS
* up-front vs continuous design
* Design vs Agile
* Evolutionary vs Emergent Design
* Modeling vs Design



# Why do we need design? 

## Maybe if we do Agile, we do not need it? 



# Design is very important even in Agile

## It is just done at different times



# Evolutionary Design
* Making things easier to change
* This does not mean that you do not have a vision
* Plan the overall Path
  * but execute a step at a time
TODO: more


* Rebecca Parsons book https://files.thoughtworks.com/pdfs/Books/Building+evolutionary+architecture.pdf



# Emergent Design
* discovery from tests
* discovery from requirements
* making the invisible visibile



# Design is not needed everywhere in the same amount/way
Think of a building
* external structure
* floor height
* wiring / plumbing
* room layout
* furniture layout



# In Software
* interfacing with other system
* splitting the system in modules
* identifying compnents and their interfaces in modules
* implementing low-level details
* repetitive/standard areas vs custom/innovative areas



# So Design needs are very different for 
* UI
* Persistence layer
* Infrastructure 
* Application-specific logic




# Why is it important?
* the two bottlenecks of Software Development: learning and communication
* Managing Complexity



# Learning is the bottleneck
> Software development is a learning process
>
> Working code is a side effect
Alberto Brandolini 

Learning to learn
* Kathy Sierra
* https://www.youtube.com/watch?v=FKTxC9pl-WM



# Communication is the bottleneck



# Communication between
* Users / Domain Experts and Developers
* Developers / Team members 
* Future Developers / Maintainers



# Complexity
We need design to make Complexity tractable
* Essential Complexity
* Accidental Complexity



# Essential Complexity
* inherently present in the business Domain

If you oversimplify Essential Complexity, you get 
* higher coupling
* worse defect rate / maintainability 

* can be however reduced through 
  * Abstraction
  * Composition
  * Changing the Context Boundary



# Accidental Complexity 
* added during the Analysis, Design, Implementation

Can, and must be removed as much as possible

> Simplicity--the art of maximizing the amount 
of work not done--is essential.
Principles behind the Agile Manifesto



## Improve our code
It takes a Deliberate approach and constant effort

    To complicate is easy, to simplify is hard
    To complicate, just add, everyone is able to complicate
    Few are able to simplify
    Bruno Munari



# Complexity vs Design vs understanding
* Encapsulation, Cohesion, Decoupling, Abstraction are important because...
they let us __think__ about a single aspect at a time



# Cost of Change
* over time
* with respect to the number of features
  * exponential increase 




# Key ideas from Event Storming & Domain Driven Design



# TOPICS
Key ideas from Event Storming & Domain Driven Design
* Ubiquitous Language
* focus on the Domain
* "Big Picture" vs local consistency (Bounded Contexts)



# Domain Driven Design
Key ideas: 
* focus on the Application Domain
* strong Domain Expert / Developer collaboration
* (Multiple) Consistent Models



# Ubiquitous Language
* agree on a single definition / word per concept
* always use it in
  * code
  * ocuments
  * tests



# Why Ubiquitous Language
* reduces ambiguity
* enables Developer - Domain Expert collaboration 
  * or at least review and validation by the Domain Expert



# Model-Driven (or Model-Centered) Design
> All models are wrong. Some are useful

* Model <--> Code
* the code should reflect the model as much as possible



# Avoid mental mapping
* finite "thinking slots"
* Mental energy is finite
  * attention over time
  * amount of information: 7 +/- 2

* do not waste it in useless mappings
  * see http://www.amazon.it/Badass-Making-Awesome-Kathy-Sierra/dp/1491919019
FIXME: here or before? 




# Keep the model consistent and up to date
* continuous refinement
* continuous learning
* progressively more explicit



# Event Storming
* Focus on Domain Events
 * things that happen 

A great way to kickstart the Domain Model discovery
https://www.slideshare.net/ziobrando/50000-orange-stickies-later
TODO: more ???



# The Travel Expenses Kata



# TOPICS 
The Travel Expenses Kata
* what is a Kata?
* overview of the Kata
* basic requirements



# What is a Kata? 
  * _deliberate practice_ -> iterate small skills until >90% perfect
TODO: 



# Our Kata
TODO: Approach
* focus on the business logic
  * limited UI (only a TXT report)
* see how new requirements impact our design



# General Requirements
Design on paper the macro-structure of an Expense Report Validator Use Case
  * load a single Request from JSON 
  * (in a second phase, also load the Validation Rules)
  * validate one or more conditions (e.g. amount limits)
  * present a TXT or HTML report showing validation results

With the goal of letting the user take a decision and change the status of the request



# Have a look at the inputs...



## Sample Validation Report
```
Employee: Carlo Bonamico
Month: March
Year: 2017

Expenses: 3

Date      Category  Requested Amount  Status  Allowed Amount  
10 March  food                  10.5  NODOC   0            
10 March  food                  35.7  PARTIAL 25
10 March  taxi                  10.2  OK      10.2  
...
March     TOTAL                 66.4          35.2
Warnings
- expenses with no document
Blocking Errors
- overall total > 200 euro
```


# Approach
* Do everything incrementally
* start from the basics



# LAB
Model storming
* define on paper the main entities
  * input data (e.g. Request... )
  * output data (e.g. Report.. )
  * processing steps/policies
* define their properties 
* define their relationships
* define main operations

focus on the application domain



# DISCUSSION
* which new "implicit" entities appeared in the model? 
* what is the main operation? 
* what are the main steps of this operation? 



# LAB - Identify an implementation roadmap
* how can we split the design and implementation in 
  * phases
  * sub-tasks

* vertical vs horizontal slicing



# How to start?
It's difficult!

The general vision is needed, but we must implement it incrementally

* make it smaller



# Make it smaller: ask yourself questions
* what if instead I only do X?
* A & B -> A then B

* top down vs bottom up



## Continuous Chain
* Faster small steps beat bigger steps
* also easier to parallelize

* The smaller the better



# LAB
* what is the "Minimum Viable Implementation"?

* choose a single case to process, from end to the end
  * End-to-end means Request loading to Report output

* keeping the input data
* a representative case
* a simple case



## A chain of Safe steps
> A complex system that works evolves from simpler systems that works

* you need to be able to check that everything works
* review the model frequently
* run frequently 
* test frequently



## Walking Skeleton
* entire application / workflow structure
* made of empty (or logging-only) components
* incrementally filled-in
* also useful for testing

* also, in-app mocking



# LAB: outline an implementation plan
Define the main structure
Split in sub-tastks with post-its
Discuss the optimal order
Introduce mock / support steps



## Shared Plan - Phase 1
- Parsing Json -> Minimal (always ok) Validation -> Generate Report
  - generate empty Report
  - generate report with the number of expenses header 
  - generate report with the first expense and allowed amount = amount
- Validate documentation present of the first expenses
  - status in expense line



# Phase 2
- add warnings at the bottom

- Validate amount limit on single expense 
- iterate validations on all expenses
- Compute amount total and allowed amount total (introduce aggregation)

- implement blocking validations ???

- implement monthly overall limit 
- implement monthly limit per Category 



# Advanced
- Implement limit per day (Optional)

- implement daily limit per Category  (Optional)



# Key forces in Software Design



# TOPICS 
Key forces in Software Design
* Cohesion
* Coupling
* Impact of Change
* fragile vs robust designs



## Design Principles
Basically, Common Sense applied to software design

>Treat your code like your kitchen
> C.B., about 2013

easy in the real world...

practice "seeing this way" code and abstract concepts



# Cohesion
Things which 
* are related
* are used togehter
* change for the same reason
* change at the same time
need to stay together (or at least nearby)

Think forks and knives



# Coupling
Couple related things, decouple unrelated things
Thinks that 
* are NOT related
* are NOT (necessarily) used togehter
* change for the DIFFERENT reasons
* change at DIFFERENT times
need to stay separate

Think forks and milk, or bread and socks



# Encapsulation 
* Objects have a clear "Outside" and "Inside"
* Minimize the impact of change



## Do you know this man? 
Google Ignaz Semmelweis



## It is _not_ brain surgery 
* Ignaz Semmelweis
  * http://www.npr.org/sections/health-shots/2015/01/12/375663920/the-doctor-who-championed-hand-washing-and-saved-women-s-lives
  * http://semmelweis.org/about/dr-semmelweis-biography/

* He championed washing hands before childbirth and surgery

    

## The simples things are the most difficult to do
* he was obstracized by the medical community!
  * it can't be that simple...
  * we just don't have time...

* And now?




## Clean Code and Basic Design Principles
* cannot solve all development problems...

* But can make them way more tractable!


especially if applied consistently.
> Never underestimate the impact of doing something all the time 



## The Boy Scout Rule
>Leave the campsite a little better than you found it

>Every time you touch some code, leave it a little better

The power of compounding many small changes _in the same direction_
* 1% time



# A "bad" example
How does our code become unmanageable? A practical example
- fast-forward demo through the life of an (apparently) trivial function



## The requirements
Write an expense report tool that
- runs in a folder where employee expense excel (csv for now) are stored
- a file for each month (e.g. 01.csv for January)



## Specifications
### Input

```csv
10/01/2015, 10.50
11/01/2015, 8.50
12/01/2015, 5.50
15/01/2015, 8.50
```



### Expected output
- compute the monthly total and produce <<month>>-report.txt

```
Month January

Expenses: 4
Amount: 33
```



## Convert coffee to code...
Version 1... 
implemented in 15 minutes! :-) 

not good but not so bad



# Can you also...
- add a type of expense
- skip an header row

```csv
Date, Type, Amount
10/01/2015, Train, 10.50
```

- produce an html report
- compute expenses per category
- detect if the expenses are more than threshold



## The results
another 15 minutes - I am a 10x-programmer!

120 Lines, and already unmaintainable

[labs/clean-code-expenses-ugly](labs/clean-code-expenses-ugly)



# Impact of change analysis
TODO: more



## the effects: 
* code-writing time -> decreases
* application-ready time -> never done
* time needed for bug fixes and new features -> increases



## Why? 
* reading code vs writing code
* understanding effort
* fragility due to interdependence
* Symptoms of Rotten Design
  * http://www.objectmentor.com/resources/articles/Principles_and_Patterns.pdf



##What can we do about that? 
Clean Code, Design Principles and Lean to the rescue
- improving our code
- improving our design
- iterate 
- practice, practice, practice and continuous / daily improvement (Kaizen)



# LAB
Implement the first steps paying attention to Cohesion and Coupling

- Parsing Json -> Minimal (always ok) Validation -> Generate Report
  - generate empty Report
  - generate report with the number of expenses header 
  - generate report with the first expense and allowed amount = amount



# Synchronization point
You should have at least classes for these concepts: 
* loading and parsing the Request
* validator process
* validation result
* generating output txt from validation result



# Works != Done
If you started with 1-2 classes, take some time to split them

And name them well



# Single Responsibility Principle for methods



# TOPICS
Single Responsibility Principle for methods
* separing inputs from outputs
* Primitives vs orchestrators
* if you have to do 3 things, make 4 functions
* Steps vs Flow



##Code ?!#%
See the ``gen()`` function again



## Single Responsibility
>Each function should do 1 thing

Or even better, have a single responsibility
* and reason to change



## how to find responsibilities? 
Ask yourself questions...

* What? 
* Who?
* When?
* Why?
* Where?

And put the answer in different sub-functions



## Inputs vs outputs
* make inputs clear
* limit / avoid output parameters



## 3 things, 4 functions
If your function needs to perform a non-trivial task: 
* import data, transform it and store it in the DB

Instead of 
```js
  readData(){
    file.open();
    while(..)
      {
        line = readLine();
        obj = trasformLine(line);
        saveInDB(obj); 
      }
  }
```
what's better?



## 3 things, 4 functions 
```
  importData(){
    data = readData();
    obj = transformData (data); 
    saveInDB(obj);
   }  
```

* a function for each step
* a function to call the steps



# LAB review the validate() and generate() functions
Split the methods in elementary responsibilities



# Synchronization point
At this point you should have separate methods for 
- validating a single expense
- generating the header
- generating the validated expenses table
  - generating a single line of the output
- generating the footer



## Primitives, Orchestrators, level of abstraction
* Primitives: small, focused, typically use-case independent
* Orchestrators: implement use-cases by combining primitives

* rinse and repeat over multiple levels of abstraction

* benefits:
  * more reusable
  * easier to test
  * easier to understand


# Steps vs Flow
* Another example: have methods for each step of an algorithm
* another method to decide the flow among them



##Lab - add more validations
- Validate documentation present of the first expenses
  - status in expense line
- add warnings at the bottom (Optional)



# Single Responsibility Principle for Classes



# TOPICS 
Single Responsibility Principle for Classes
What is a Responsibility
* reason to change
* what if…
* looks similar vs changes for the same reason



##Single Responsibility Principle
Have you ever seen your grandmother put dirty clothes in the fridge?

Or biscuits in the vegetable box?

So, why to we do this all the time in our code? 



##Single Responsibility Principle
Responsibility == reason to change



## SRP - Again
A class should do one thing
* and have a single reason to change 

Consequences:
* classes should be small
* classes should be focused
* classes need to collaborate to perform complex tasks



##LAB FIXME: 
* Take the "ugly" code or any other code example
* Paste it in word / Google Docs
* Outline in different colors the various responsibilities




# LAB: Validating the overall monthly total amount
- Validate amount limit on single expense 
- iterate validations on all expenses



# Reviewing your code 
Look at parts of the code and ask yourself what if that changes?



# Synchronization point
At this point you should have separate classes for 
* validating the amount of a single expense
* validating the documentation presence
* iterating on all expenses



# looks similar vs changes for the same reason
TODO: link



# Single Responsibility means splitting ...



# TOPICS Single Responsibility means splitting ...
* UI from logic
* Logic from persistence
* I/O from logic
* Sync from Async
* Intent from implementation


# UI from logic



# Logic from persistence



# I/O from logic



# Sync from Async



# Intent from implementation 



# Layered Architecture
* each layer depends only on lower layers
* ideally, with the domain layer at the bottom (Hexagonal architecture)



# LAB: planning a complex change: adding aggregation
Compute amount total and allowed amount total (introduce aggregation)

* Define the main structure
* Split in sub-tastks with post-its
* Discuss the optimal order



## How to keep track of what you do and what's missing
* Write it down
* comment it with temporary comments
* code it!



## Incremental commits
* Each commit should start from a stable state and lead to a stable but more complete state



## Link: continuous delivery
http://continuousdelivery.com/



##More practice and Katas
* Elefant Carpaccio
  * https://docs.google.com/document/u/1/d/1TCuuu-8Mm14oxsOnlk8DqfZAA1cvtYu9WGv67Yj_sSk/pub



#FIXME: anticipare?
# TOPICS 
Reviewing your Design
* naming
* model out loud
* validate with examples
* what if this changes?
* the Open / Closed Principle



# Continuously refined Model
* Knowledge crunching
* maintaining Model consistency
* continuous learning
* breaktroughs
* making implicit explicit



## Why does this matter? 
A little experiment

Write down: 
- what the software does
- how long it took to understand it
- which bugs you can find in the code
- how long it took to find them



## Ready - Set - Go!
Group A: go to http://plnkr.co/edit/dQldXF

Group B: go to http://plnkr.co/edit/zPXf70?



##reading code vs writing code
>What is written without effort is in general read without pleasure.
>
>Samuel Johnson

Most code is written once, but read
* every time you need to fix a bug
* to add new features
* by other developers
  * including your future self 



##what is a good name?
* Ideas?



## What is a good name
<img src="images/naming.png">

 * nonsense
 * honest
 * honest & complete
 * does the right thing
 * intent
 * domain abstraction

http://llewellynfalco.blogspot.it/p/infographics.html


# Model out Loud


# Examples


# What if this changes? 



# TOPICS 
Collaborating with other classes
* Prefer Composition to Inheritance
* Dependency Injection



# Dependency Inversion Principle
TODO: 



## Collaborating classes
* We need a way of making collaboration easier

* With Dependency Injection
  * separate creation of classes from linking instances
  * create A
  * create B
  * something else passes B to A

* You do not need a framework for that...



## Inheritance - with caution
* Inheritance is the strongest link between classes
* useful with caution



## Prefer composition
* combine parts 
* a derived class becomes the composition of a base behaviour + additional custom behaviour

Achieve complex interaction by coordinating simple elements



# LAB: Monthly Expense limits 
- implement monthly overall limit 
- delegating aggregation to dedicated class



## Interfaces and Contracts
* esplicit vs implicit
* Decoupling changes and detecting regressions
* separate clean parts from dirty code



# Types of interaction
* what is effective in the small (everyone talking at the same time in a romm to solve a problem)
* interaction within local variables

chaos if same approach applied in the large
* anyone talking to anyone



# LAB: Generalizing the validation process
* Introduce the Validator interface
  * inputs
  * outputs
* Define a list of individual validators
* separate the validators from their application to the expenses
TODO: review



## OCP 
>Open for extension, Closed for Modification



# LAB: Validating Monthly constraints per category
TODO: add other validation 

- Implement limit per day (Optional)



## Lab: impact analysis 
* Revise the expenses lab in the light of these concepts
* Consider the impact of the following additional requirements
  * allow the operator to manually modify the allowed reimbursement 
  * enable the ``Approve`` button only if there are no blocking errors




# LAB: Validating Expense limits per day
- implement daily limit per Category  (Optional)



# TOPICS 
Generalizing the model
* making the implicit explicit
* Levels of abstraction vs Levels of implementation
* breakthroughs
* Emergent Design



# LAB: Making Validation Rules configurable
Introduce the concept of Validation Rule
* implement it 
* istantiate it in code



# LAB
* load validation rules from file



# Emergent concepts TODO: ???
* DDD Concepts like aggregates, etc.




# TOPICS 
Incremental development and Evolutionary Design
* the need for a continuous chain of small, safe steps of design &
* how to do everything incrementally
* incremental implementation: in-application Mocks & the Walking Skeleton approach
* the Expand and Contract pattern



# Refactoring for evolutionary design
- from bad code to good code
- in steps
- learn your IDE refactoring tools
- The "Boy Scout Rule"
- Why we need unit tests?



## From bad to good
Incremental transformation

<img src ="http://1.bp.blogspot.com/-Aaw2GppgxeA/Ve-a1CMqJEI/AAAAAAAAD8w/Epy6-J7VdGY/s320/PracticalRefactoringDemo.gif" >



## In steps
* Each step should not change the functional properties of the system
* and improve the non-functional ones

* separate adding features from refactoring
  * don't do both in the same step



## IDE Refactoring tools
* if you have to pick one: Find all references
* Refactor / Rename
* Extract Method
* Extract Interface
* http://refactoring.com/



# LAB
TODO: 



## How to do everything incrementally
* You can do _everything_ incrementally
  * decouple release from deployment
  * branch by abstraction
  * do both
  * expand-contract



# Decouple release from deployment


# Expand-Contract
TODO: 



# CONCLUSION



## Testable code and Good Design aligment
Things that make code testable
* clear interfaces
* small classes / functions
* decoupled
* composition

Things that make code well-designed, easy to evolve
* clear interfaces
* small classes / functions
* decoupled
* composition



##The principles
So what did we just do? Understand the principles
- the relationship between quality and productivity
- the need for a continuous chain of small, safe steps of design &
implementation



##Quality vs Productivity 
Traditionally, Quality is seen as an alternative to raw development Speed
* this is partly true only in the short term

Four quadrants: 
* high quality, high productivity -> tends to further improve
* high quality, low productivity -> tends not to improve, and go to
* low quality, low productivity -> tends to get worse 
* low quality, high productivity -> tends to go to the previous one

* Productivity curves at different quality ratio



# How to continue by yourself: references for further learning
* improving our design
* practice, practice, practice and continuous / daily improvement (Kaizen)
* Principles of Package Design
* More on TDD: Test-friendly vs Well-designed



## Improve our code
It takes a Deliberate approach and constant effort

    If I don't practice for a day, I notice
    If I don't practice for two days, my orchestra notices
    If I don't practice for three days, the public notice
    Claudio Abbado

- practice, practice, practice and continuous / daily improvement (Kaizen)



# Principles of Package Design
TODO: link



##More practice and Katas
* http://matteo.vaccari.name/blog/tdd-resources
* https://github.com/xpmatteo/simple-design-in-action/tree/master/stage-01-hello-world/script
* http://codekata.com/
* https://www.industriallogic.com/blog/modern-agile/



## Learning to learn
* Kathy Sierra
* https://www.youtube.com/watch?v=FKTxC9pl-WM



# Team Improvement 
About how to improve teamworking and raise technical proficiency and autonomy

The phoenix Project
http://itrevolution.com/books/phoenix-project-devops-book/

Drive (sulla motivazione)
https://books.google.it/books?id=E0H_DIkg0I4C

Event Storming
http://www.slideshare.net/ziobrando/event-storming-recipes
https://www.youtube.com/watch?v=veTVAN0oEkQ 
http://www.slideshare.net/ziobrando/idea-stickies-green-bar-wroclaw-edition

Introduzione di nuovi approcci nei team
http://www.davidmarquet.com/