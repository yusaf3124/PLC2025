// Java Program to pass a function as an argument
// to another function. Depending on selection the
// average or summation function is applied.
// A hastily put together java version of fun_as_arg.hs

import java.util.*;
import java.io.*;
interface testSum
{
  void set(int maxInt);  
}
class sumInts {
	
  	void applyFunc(testSum fun, int maxInt)
    {
      fun.set(maxInt);
    }
	
  	void sumfunc(int maxInt)
    {
      int total = 0;
      for (int i = 0; i <= maxInt; i++)
        total += i;
      System.out.println("Total-> " + total);
    }
	
 	void avgfunc(int maxInt)
  	{
    	int total = 0;
      	for (int i = 0; i <= maxInt; i++)
        	total += i;
    	float avg = (float)total/(maxInt+1);
     	System.out.println("Average-> " + avg);
  	}    
	
	public static void main(String[] args)
	{
		char selection = 'a';
      	sumInts L=new sumInts();      	
      	if (selection=='s'){
       		testSum func = L::sumfunc;
        	L.applyFunc(func, 5);
        }
      	else if (selection=='a'){
         	testSum func = L::avgfunc;
          	L.applyFunc(func, 5);
        }
      	else{
         	System.out.println("Incorrect selection");
        }      	
		System.out.println("Done");
	}
}
