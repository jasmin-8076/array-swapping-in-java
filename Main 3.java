/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	     array1[]=int array[];
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the array limit");
	      int limit=sc.nextInt();
	    
	   System.out.println("enter the values in array 1");
	      for(int i=0;i<limit;i++){
	       array1[i]=sc.nextInt();
	      }
	    System.out.println("enter the values in array 2");
	      for(int i=0;i<limit;i++){
	       array2[i]=sc.nextInt();
	      }
	    for(int i=0;i<limit;i++){
	        temp=array1[i];
	       array1[i]=array2[i];
	        array2[i]=array1[i];
	    }
	   
	    System.out.println(" after swapping: ");
	    System.out.println("array 1: ");
	    for(int i=0;i<limit;i++){
	    System.out.println(array1[i]);
	}
	
	System.out.println("array 2: ");
	    for(int i=0;i<limit;i++){
	    System.out.println(array2[i]);
	}
}
}
