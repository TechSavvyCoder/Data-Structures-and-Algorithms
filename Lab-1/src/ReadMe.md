# Lab 1
## Question 1 (Interface)
Create an interface called Runner. The interface has an abstract method called run() that displays a message describing the meaning of run to the class. Create classes called Machine, Athlete, and PoliticalCandidate that all implement Runner. Create an application/class that demonstrates the use of the classes.

## Question 2 (Exception)
Write an application that displays a series of at least five student ID numbers (that you have stored in an array) and asks the user to enter a numeric test score for the student. Create a ScoreException class, and throw a ScoreException exception for the class if the user does not enter a valid score (less than or equal to 100). Catch the ScoreException exception, display an appropriate message, and then store a 0 for the student’s score. At the end of the application, display all the student IDs and scores.

## Question 3 (Inheritance)
Create an abstract Student class for Parker University. The class contains fields for a student ID number, last name, and annual tuition. Include a constructor that requires parameters for the ID number and name. Include get and set methods for each field; the setTuition() method is abstract. Create three Student subclasses named UndergraduateStudent, GraduateStudent, and StudentAtLarge, each with a unique setTuition() method. Tuition for an UndergraduateStudent is $4,000 per semester, tuition for a GraduateStudent is $6,000 per semester, and tuition for a StudentAtLarge is $2,000 per semester. Write an application that creates an array of at least six objects to demonstrate how the methods work for objects for each Student type. Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java.

## Question 4 (Inheritance)
The Cell Phone Company provides phone services for its customers. Create an abstract class that includes a String field for a phone number and a double field for the price of the call. Also, include a constructor that requires a phone number parameter and that sets the price to 0.0. Include a set method for the price. Also include three abstract get methods—one that returns the phone number, another which returns the price of the call, and a third that displays information about the call. Create two child classes one for incoming calls and another for outgoing calls. The incoming call class constructor passes its phone number parameter to its parent’s constructor and sets the price of the call to 0.02. The method that displays the phone call information displays the phone number, the rate, and the price of the call (which is the same as the rate). The outgoing class includes an additional field that holds the time of the call in minutes. The constructor requires both a phone number and the time. The price is 0.04 per minute, and the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, and the total price.

1. Write an application that demonstrates you can instantiate and display both incoming and outgoing class objects.
2. Write an application in which you assign data to a mix of eight incoming and outgoing class objects into an array. Use a for loop to display the data.

## Recursion
1. Write a recursive method that accepts two arguments into the parameters x and y. The function should return a value of x times y. Remember multiplication can be performed as repeated addition as follows:

```math
7 * 4 = 4 + 4 + 4 + 4 + 4 + 4 + 4
```

2. Consider the method displayRowOfCharacters that displays any given character the specified number of times on one line. For example, the call

```java
displayRowOfCharacters('*', 5);
```

produces the line

```java
*****
```

3. Trace the call f(16) to the following method

```java
public int f(int n) {
    int result = 0;
    if (n < 4)
        result = 1;
    else
        result = f(n / 2) + f(n / 4);
    return result;
}
```