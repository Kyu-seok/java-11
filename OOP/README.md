# Object Oriented Programming

###### 4 principles of OOP
- [x] Encapsulation
- [x] Abstraction
- [x] Inheritence
- [x] Polymorphism

OOP is a programming model that organizes program with data and object instead of functions and logics. Object in OOP should be viewd as collection of methods and variables. By using OOP design, a single block of source code is devided with smaller parts of object which brings great advantage on productivity.

##### Pros of OOP

1. **Reusability.** By using inheritence, same code is reusable in different object by inheriting the parent.
2. **Productivity.** Programmers can construct new programs quicker through the use of multiple libraries and reusable code.
3. **Scalable.** Programmers can implement system functionalities independently.
4. **Security.** Using encapsulation and abstraction, complex code is hidden, software amintenance is easier and internet protocols are protected.
5. **Flexibility.** Polymorphism enables a single function to adapt to the class it is placed in. Different objects can also pass through the same interface.

##### Cons of OOP

1. **Inefficiency.** Depending on the size of the project, or subject of the project, using OOP might cause ineddiciency in developing state. When the project has few objects, but more on the functioalities which is not reused, the first time coding might be more extensive than other options.
2. **Complexity.** It is very complex to create programs based on the interaction of objects. Some of the key programming techniques, such as inheritance and polymorphism, can be a big challenging to comprehend initially.



### Interface vs Abstract class

##### Abstract Class
- Abstract classes are similar to Interfaces. We cannot instantiate them, and they may contain a mix of mehtods declared with or without an implementation.
- However, with Abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods.
- An abstract class can extend only one parent class but it can implement multiple interfaces.
- When an Abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.


##### Use an Abstract class when

- We want to share code among several closely related classes (Animal - with fields name, age....)
- We expect classes that extend our abstract class to have many common methods or fields or requried access modifires other than public (protected, private). 
- We want to declare non static or non final fields (for example name, age), this enables you to define methods that can access and modify the state of an object (getName, setName).
- When we have a requirement for our base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes.
- **Summary** : The purpose of an Abstract class is to provide a common definition of a base class that multiple derived classes can share.


##### Interface
- An interface is just the declaration of an Class, it's not the implementation.
- In an Interface, we define what kind of operation an object can perform. These operations are defined by the classes that implement the Interface.
- Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.
- We cannot instantiate them, and they may contain a mix of mehtods declared with or without and implementation. All methods in interfaces are automatically public and abstract.
- Interfaces are more flexible and can deal with a lot more stress on the design of our program than the implementation.
- By intorducing interfaces into our program, we are really introduce points of variation at which we can plug in different implementations for that interface. An Interfaces primary purpose is abstraction, decoupling the "what" from the "how".

##### Use an Interface when
- We expect that unrelated classes will implement our interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
- We want to specify the behavior of a particular data type, but we are not concerned about who implements its behavior.
- We want to separate different behavior.
- The Collections API is an excellent example, we have the List interface and implementations ArrayList and LinkedList.
