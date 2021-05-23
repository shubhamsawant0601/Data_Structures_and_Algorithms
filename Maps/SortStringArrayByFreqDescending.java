package Maps;
import java.util.*;
import java.util.Map.Entry;
/*
public class SortStringArrayByFreqDescending {
	
    static void sortArrayByFreq(String[]str){
		HashMap<String,Integer> m = new HashMap<>();
		
		for(int i=0;i< str.length;i++) {
			if(m.containsKey(str[i])) {
				m.put(str[i], m.get(str[i])+1);
			}else {
				m.put(str[i], 1);
			}
		}
		
		ArrayList<Map.Entry<String,Integer>> arr = new ArrayList<>(m.entrySet());
		Collections.sort(arr, (o1,o2) ->o2.getValue().compareTo(o1.getValue()));
		arr.forEach((K)->System.out.println(K.getKey()+" "+K.getValue()));
	}

	public static void main(String[] args) {
        String [] s = {"sumit","ambuj","himanshu","ambuj","ambuj"}; 
		sortArrayByFreq(s);
	}

}
*/
import java.util.*;
class SortStringArrayByFreqDescending {
	static void difficultCharacter(String s){
	       LinkedHashMap <Character,Integer> l = new LinkedHashMap<>();
	       char ch [] = new char [s.length()];
	       for(int i=0;i<ch.length;i++){
	           ch[i] = s.charAt(i);
	       }
	       char a = 'z';
	       while(a>='a'){
	           l.put(a,1);
	           a--;
	       }
	       
	       
	
	    for(int i=0;i<ch.length;i++){
	       if(l.containsKey(ch[i]))
	       {
	          l.put(ch[i],l.get(ch[i])+1);
	       }else
	       {
	          l.put(ch[i],1);
	       }
	    }
	    ArrayList<Map.Entry<Character,Integer>> arr = new ArrayList<>(l.entrySet());
	    Collections.sort(arr,(o1,o2)->o1.getValue().compareTo(o2.getValue()));  
	    arr.forEach((k)->System.out.print(k.getKey()+" "));
	  }
	  
	  public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    while(n>0){
		         n--;
		         String s = sc.next();
		         difficultCharacter(s);  
		    }
	    
	  }
	}
