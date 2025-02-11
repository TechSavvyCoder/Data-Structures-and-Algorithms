# Lab 2

## Recursion
1. Write three different recursive methods that each compute the sum of integers in an array of integers. Model your methods after displayArray methods are discussed in the lecture slide.
2. Write a method that returns the largest value in an array passed as an argument. The method should use recursion to find the largest element.
3. Write a method that asks the user for integer input that is between 1 and 10, inclusive. If the input is out of range, the method should recursively ask the user to enter a new input value.
4. Write a recursive method that displays a portion of a given array backward. Consider the last entry in the portion first.
5. Repeat question 4, but write a string backward instead of an array.

*More practice questions.*

6. Write a recursive method to count the number of vowels in a string.
7. Write a recursive method to remove all the vowels from the given string and return what is left in the new string.
8. Write a method to duplicate each character in a string and return the result as a new string. For example “book” will be “bbooookk”.

## Efficiency of Algorithms
1. Using Big Oh notation, indicate the time requirement of each of the following tasks in the worst case. Describe any assumptions that you make.
    * After arriving at a party, you shake hands with each person there.
    * Each person in a room shakes hands with everyone else in the room.
    * You climb a flight of stairs.
    * After entering an elevator, you press a button to choose a floor.
    * You ride the elevator from the ground floor up to the nth floor.
    * You read a book twice.
    * After arriving at a library, you search for a specific book by looking at every book on the shelf.
    * A teacher distributes graded exams to a class of students by calling each student's name one by one.
    * You write a list of n numbers on a whiteboard, and for each number, you calculate its square and write it down.
2. Find the growth rate function using Big Oh notation for the following:
    * 6n2 + 3
    * n2 + 17n + 1
    * 5n3 + 100n2 – n – 10
    * 3n2 + 2n
    * n + 10
    * 100 * n
3. What is the Big Oh of the following computation?

```java
int sum = 0;
for (int counter = n; counter > 0; counter = counter − 2)
sum = sum + counter;
```

```java
for (int pass = 1; pass <= n; pass++) {
    for (int index = 0; index < n; index++) {
        for (int count = 1; count < 10; count++) {
            . . .
        } // end for
    } // end for
} // end for
```

* Repeat the previous exercise, but replace 10 with n in the inner loop.

## Searching Algorithms
1. Trace the method binarySearch, when searching for 4 in the following array of values:

```math
5, 8, 10, 13, 15, 20, 22, 26, 30, 31, 34, 40
```

Repeat the trace when searching for 13.

2. Implement Sequential search and Binary search, algorithms (as discussed in the lecture slide) in Java.