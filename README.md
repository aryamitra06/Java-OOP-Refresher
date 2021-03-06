# Java-OOP-Refresher
#=== CHEATSHEET FOR JAVA OOP ===#

<-- METHOD -->

Static keyword is used to use any method without creating its class's object separately.

<-- METHOD OVERLOADING-->

Two or more methods can have same name but different parameters such methods are called overloaded methods.

<-- VAR ARGS -->

Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. 
Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.

<-- OOP CONCEPT-->

CLASS => A class is a group of objects which have common properties. 
         It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

         Fields
         Methods
         Constructors
         Blocks
         Nested class and interface

OBJECT => A Java object is a member (also called an instance) of a Java class. 
          Each object has an identity, a behavior and a state. 
          The state of an object is stored in fields (variables), while methods (functions) display the object's behavior.     
          MEMORY IS ALLOCATED ONLY AFTER OBJECT INSTANTIATION.


EXAMPLE -> 
          CLASS -> EMPLOYEE
          ATTRIBUTES -> Name, Age, Salary
          METHODS -> getSalary();, increment();
          OBJECT -> ARYAMITRA


<-- OOP TERMENOLOGY-->

1. ABSTRACTION -> Hiding internal details. (Use a phone without bothering about how it was made.)

2. ENCAPSULATION -> The act of putting various components together (in a capsule). (Laptop is a single entity with wifi + speaker + storage etc.)
                    Sensitive data can be hidden from users that simply means encapsulation.

3. INHERITANCE -> The act of deriving new things from exsisting things.
                  eg- Rickshaw -> eRickshaw

4. POLYMORPHISM -> Polymorphism in Java is the ability of an object to take many forms. 
                   To simply put, polymorphism in java allows us to perform the same action in many different ways.   
                   eg- Smartphone as a camera
                       Smartphone as a calculator
                       
<-- PRIVATE ACCESS MODIFIER, GETTER AND SETTER -->
When we want to access private variables inside a class then we use getter and setter.

<-- CONSTRUCTOR -->
A constructor is used to initialize the state of an object.
A constructor must not have a return type.
The constructor name must be same as the class name.

<-- INHERITANCE -->
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class. 

<-- CONSTRUCTOR IN INHERITANCE -->
Making constructors inside the inheritance.

<-- SUPER keyword -->
    1. super can be used to refer immediate parent class instance variable.
    2. super can be used to invoke immediate parent class method.
    3. super() can be used to invoke immediate parent class constructor.

<-- METHOD OVERRIDING -->
When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class,
then the method in the subclass is said to override the method in the super-class.    

<-- DYNAMIC METHOD DISPATCH -->
 Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.

    { Super Class -> meth1, meth2 }
    { Sub Class -> meth2(overridden), meth3}

    Super obj = new Sub(); => Allowed
    ***VVI**** obj.meth2() => Sub class's meth2 is called. ****VVI***

    obj.meth1() => Allowed
    obj.meth3() => Not allowed

    Sub obj = new Super(); => Not allowed

<-- ABSTRACT CLASS AND METHODS -->
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
Abstract methods are made inside the abstract classes.

<-- INTERFACE -->
An interface in Java is a blueprint of a class. It has static constants and abstract methods.
You've to implement all the methods in child class.

<-- INTERFACE INHERITANCE -->
Only inteface can be inherited from an interface.
interface can only implemented in a class.
