# Java Constructors
In Java, constructors play an important role in object creation. 
A constructor is a special block of code that is called when an object is created. 
Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes.
This process happens automatically when we use the "new" keyword to create an object.
## Characteristics of Constructors:
1. Same Name as the Class: A constructor has the same name as the class in which it is defined.
2. No Return Type: Constructors do not have any return type, not even void. The main purpose of a constructor is to initialize the object, not to return a value.
3. Automatically Called on Object Creation: When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
4. Used to Set Initial Values for Object Attributes: Constructors are primarily used to set the initial state or values of an object’s attributes when it is created.
### Constructor vs Method in Java
The below table demonstrates the key difference between Java Constructor and Java Methods.
![image alt](https://github.com/harshadev-7/constructor-java/blob/05c262cfa5084b5d33e50e78ce5996072764d528/Screenshot_20251012_120129_Brave.jpg)

Now let us come up with the syntax for the constructor being invoked at the time of object or instance creation.
![image alt](https://github.com/harshadev-7/constructor-java/blob/16e33fc2173427f897eb520903d8ac5920d11c38/Screenshot_20251012_120936_Brave.jpg)

The first line of a constructor is a call to super() or this(), (a call to a constructor of a super-class or an overloaded constructor), if you don't type in the call to super in your constructor the compiler will provide you with a non-argument call to super at the first line of your code, the super constructor must be called to create an object:
Note:
If you think your class is not a subclass it actually is, every class in Java is the subclass of a class object even if you don't say extends object in your class definition.
#### Why Do We Need Constructors in Java
Constructors play a very important role, it ensures that an object is properly initialized before use.
##### What happens when we don't use constructors:
Without constructors:

1. Objects might have undefined or default values.
2. Extra initialization methods would be required.
3. Risk of improper object state.
![image alt](https://github.com/harshadev-7/constructor-java/blob/b67945e71655278064af3c62ab27eb1da883833c/Screenshot_20251012_121433_Brave.jpg)

##### When Java Constructor is Called?
Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class. Rules for writing constructors are as follows:

The constructor of a class must have the same name as the class name in which it resides.
A constructor in Java can not be abstract, final, static, or Synchronized.
Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
So, we have learned constructors are used to initialize the object's state. Like methods , a constructor also contains a collection of statements (i.e. instructions) that are executed at the time of object creation.

# Types of Constructors in Java
Now is the correct time to discuss the types of the constructor, so primarily there are three types of constructors in Java are mentioned below:

#### Default Constructor
#### Parameterized Constructor
#### Copy Constructor
##### 1. Default Constructor in Java
A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor. Once you define a constructor (with or without parameters), the compiler no longer provides the default constructor. Defining a parameterized constructor does not automatically create a no-argument constructor, we must explicitly define if needed. The default constructor can be implicit or explicit.

##### Implicit Default Constructor: 
If no constructor is defined in a class, the Java compiler automatically provides a default constructor. This constructor doesn’t take any parameters and initializes the object with default values, such as 0 for numbers, null for objects.
##### Explicit Default Constructor: 
If we define a constructor that takes no parameters, it's called an explicit default constructor. This constructor replaces the one the compiler would normally create automatically. Once you define any constructor (with or without parameters), the compiler no longer provides the default constructor for you.
