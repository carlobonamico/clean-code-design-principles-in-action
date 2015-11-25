# clean-code-design-principles-in-action

Materials and samples for my workshop on 

#Clean Code and Design Principles in Action: develop quality applications, faster
* http://milan2015.codemotionworld.com/workshop/clean-code-and-design-principles-in-action-develop-quality-applications-faster/

#In Short
As developers, we often feel that we are always asked for more: more
features, more bugfixes, more code to get our application done,
faster. In the workshop you'll learn first hand how applying Clean
Code and Design Principles will help you complete solid & maintainable
applications in less time.

#Slides
* [CleanCodeInAction-Slides-6.pdf](CleanCodeInAction-Slides-6.pdf)

#Labs
* [labs.md](labs.md)

#ABSTRACT
We are often asked for more features, more bugfixes, faster. But is
"running" always the fastest way to get things done?
For a mountain climber, "running" means more mistakes, falling off
more often,thus proceeding more slowly.
So like a climber gets to the top through a continuous chain of small,
safe steps, we can improve coding by making design & implementation
steps clean, safe and incremental.
In the workshop, starting from concrete examples, you will learn first
hand how applying Clean Code and Design Principles will help you
complete more solid & maintainable applications in less time

#REQUIREMENTS
Laptop
Web Browser (Chrome or Firefox)
Text Editor (Sublime, Atom, Visual Studio Code,...) and/or IDE
(Eclipse,  NetBeans, Intellij, Visual Studio,.. )

#TOPICS
How does our code become unmanageable? A practical example
- fast-forward demo through the life of an (apparently) trivial function
- the effects: code-writing time vs application-ready time
- what happens after 6 months?
- why this happens? the "deadly sins" of development (cut & paste,
optimization lust, haste, false savings, naming avarice, trial and
error wrath, my code is perfect pride, making it right is too hard -
discouragement)

##What can we do about that? 
Clean Code, Design Principles and Lean to the rescue
- improving our code
- improving our design
- practice, practice, practice and continuous / daily improvement (Kaizen)

##Clean Code by example: key concepts

##Concept 1 - Naming
-reading code vs writing code
- what is a good name?
- same but different: the importance of conventions
- be meaningful
- aside: commit messages

##Concept 2 - Formatting
- making code readable
- making code diff-friendly & commit-friendly
- making code modification-friendly

##Concept 3 - What's in a good function?
- single responsibility
- separing inputs from outputs
- if you have to do 3 things, make 4 functions
- primitives and orchestrators

##Concept 4 - What's in a good class? Design Principles
- Single Responsibility Principle
- collaborating with other classes
- composition vs inheritance (and the Open/Closed principle)
- Dependency Injection
- interfaces and the importante of Contracts

##Concept 5 - Making our code Testable
- avoid statics
- testable code vs good design

##Concept 6 - Making debug and troubleshooting easier
- one task - one statement
- make return values visible
- logging

##Concept 7 - Refactoring
- from bad code to good code
- in steps
- learn your IDE refactoring tools
- The "Boy Scout Rule"
- Why we need unit tests?

##Lab
Rewriting the initial example in a cleaner way

##The principles
So what did we just do? Understand the principles
- the relationship between quality and productivity
- the need for a continuous chain of small, safe steps of design &
implementation

##Incremental development and evolutionary design
- how to do everything incrementally
- Separation of Concerns in practice: ask yourself questions!
- incremental implementation: in-application Mocks & the Walking
Skeleton approach
- how to keep track of what you do and what is missing
- how to manage incremental commits

##A more complex example - applying the method to real-world problems
- the feedback loop
- splitting the problem
- getting more feedback
- getting feedback more frequently
- model the problem
- avoid trial and error, but if you need it, do it fast

##How to continue by yourself: references for further learning
- Principles of Package Design
- More on TDD

For each module, hands-on lab will include
- quizzes (which of these variants is better? trade-offs)
- interactive examples to complete and modify in an online IDE


##AUDIENCE
Basically, to all developers! Independently from the language /
platform you are developing on, and from your expertise level, if you
are interested in improving your approach to coding, and develop
higher quality applications with more productivity, this workshop is
for you.


##PREREQUISITES
Working knowledge and practical experience in one programming language
(you should be able to write/compile/test/debug by yourself a program
which reads and parses input and presents output either on the command
line or in a simple GUI).
Basic knowledge of HTTP.