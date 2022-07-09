# Nuwe-MyLambda

This is my solution submitted for [Nuwe](https://nuwe.io/)'s challenge "Repte #2 - Welcome to Lambdas ƛ" on the programming league made for IT Academy.

## Installation

You can directly download the repository in zip format.  
It contains this README, the `MyLambda` class, and the `CheckNumber` (functional) interface.

## Usage

Once you have downloaded and unzipped the content of this repository, you can move both Java Files to an existing Java Project to be used.   

It is important that both files are located in the same package. As I used them, they were both in package `repte2`, so if your package is named differently you will have to change this line of code:
```java
package repte2;
```
for both files, and replace it to whatever your package name is.

In the case you do not put both files in the same package, you will have to make sure that in the `MyLambda` class you import the `CheckNumber` interface. Otherwise, it will not work correctly.  
For example, if your `CheckNumber` interface is located in the package `com.example.interfaces` you will have to add the following line with the other imports:
```java
import com.example.intarfaces.CheckNumber; 
```


## Code explanation
*(Please note that the code itself is commented with explanations)*

When I first read this challenge, and saw that we had to implement three different functions, all of which received an integer and returned a boolean, by using lambda expressions, the first thing I thought of was Functional Interfaces.  
In case you are unfamiliar with this term, a Functional Interface is an interface which only contains one (abstract) method and has the annotation @FunctionalInterface. This method can be implemented elsewhere by instancing the interface and writing its content using lambda expressions.  
So, after making sure I was allowed to submit more than only `MyLambda` class with my solution, I decided to make it this way. And so, as you can see in `MyLambda`, I start by instancing the interface and writing the method's code.  
As for the functions themselves, they were not that complicated  
* isOdd: very easy to code, although there were doubts because the return is the contrary of what one would think by seeing the name (it must return `false` if the number received is odd).
* isPrime: pretty easy, as it is a typical programming problem. Some people use `for` loops, which I find have lower efficiency, so in my case I use a `while` loop which is exited in the case a divisor is found. In case a divisor is not found, it will only loop to aprox. the half of the received number, because mathematically a divisor cannot be found in the other half.
* isPalindrome: notably more difficult to code than the previous two, however luckily in the last "Repte" I already had to separate an integer into its digits, so in this case I only had to do the same but use the digits to build the integer `reverse` and then compare this variable to the number received.

Finally, we wrote the code for the method checker, which receives an integer array, and had a bit unclear output in the explanation. So, I decided to make the output a List of Maps, which turns out pretty similar to the JSON format shown in the explanation.  

Then, after creating this output List, from the array received, we can build our Map for each number in the array and put them in the output List in a "single line" of code, thanks to the Stream API.  
I could explain what I did step by step here, but the code is already commented and you can see it more clearly there.
