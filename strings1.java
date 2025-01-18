
package prac ;

import java.util.*;
import java.util.regex.*;


class strings1
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		String s1 = sc.nextLine();
		String s2;
		
		  char s ;
		  boolean  found = false;
		String[] sentence =  s1.split(" ");
	   
		for(int j=0;j<sentence.length;j++){

			
			
			found = Pattern.matches("[A-Z].*", sentence[j]);

			

			if(!found){	
			 s =	Character.toUpperCase(sentence[j].charAt(0));

              s2 = sentence[j].substring(1).toLowerCase();

			  sentence[j] = s+s2;
				
			}
			
		}
		for(String each: sentence){
			System.out.print(each+" ");

		}

	}
}
