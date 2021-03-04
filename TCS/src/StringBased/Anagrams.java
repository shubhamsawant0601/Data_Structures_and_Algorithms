package StringBased;
import java.util.*;
public class Anagrams {

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		boolean anagram = false, found = false;
			    
		for(int i=0;i<s1.length();i++){
		    char ch1 = s1.charAt(i);
			      
			for(int j=0;j<s2.length();j++){
			    char ch2 = s2.charAt(j);
			    if(ch1!=ch2){
			        found = false;
			    }
			    else{
			        found = true;
			        break;
			    }
			}
			       
			if(found){
			    anagram = true;
			    continue;
			}
			else{
			    anagram = false;
			    break;
	        }
			      
	    }    
			    
		if(anagram){
		   System.out.println("Anagram");
		}
		else{
	       System.out.println("Not anagrams");
	    }
	}
}