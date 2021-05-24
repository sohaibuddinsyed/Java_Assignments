# Assignment Questions

### JAVA- 1

Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
Provide appropriate documentation and comments on your code.
Post your code to your GitHub repo and share the url.


### JAVA-2

Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). Write time and space complexity of your solution as comments in the source file.


### JAVA-3

Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
Use the system ping utility, do not use any deprecated methods.


### JAVA-4

Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.
Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.
For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy



### JAVA-5

DefaultInitializationAssignment:

Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized, add a method to print these variables. Add another method in the same class with two local variables and print their values without initializing them.
Create another class in package yourname.assignment.singleton containing a non static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.
Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.
One or more tasks mentioned above are not possible in JAVA, comment that part of the code with block comments and add the explanation for the same.


### JAVA-6

Operators and More:

1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

4. Complete the previous exercise by creating objects to attach to the array of references.



### JAVA-7

Access Control and More

1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.

2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.

3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.

4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.

5. Create a class with an inner class that has a non-default constructor (one that takes arguments). Create a second class with an inner class that inherits from the first inner class.



### JAVA-8

Error Handling

Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.



### JAVA-9

String and Type Information

Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.



### JAVA-10

Generics, Arrays and Containers

Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.


### JAVA-11

I/O

Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.



### JAVA-12

Assignment on Stream Api

Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

Add following student in list ;

Use stream api on above list of employees find

1. Print the name of all departments in the college?
2.Get the names of all students who have enrolled after 2018?
3. Get the details of all male student in the computer sci department?
4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
5.What is the average age of male and female students?
6.Get the details of highest student having highest percentage ?
7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
8. What is the average percentage achieved in each department?
9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
10.How many male and female students are there in the computer science department?

Structure your code so as to comply to clean code(SOLID Principles)
