package repte2;


// This functional interface contains the method 'check', which we'll implement in the class MyLambda 
// As it receives an int as parameter and returns a boolean, we'll be able to use this method for
// the three different functions want to implement: isOdd, isPrime, and isPalindrome.

@FunctionalInterface
public interface CheckNumber {

	
	
	public boolean check(int num);
}
