package virtusa;

public class FirstUnique {
	
	public static int getUniqueCharacter(String s)
	{
	        int freq [] = new int[26];
	        for(int i = 0; i < s.length(); i ++)
	            freq [s.charAt(i) - 'a'] ++;
	        for(int i = 0; i < s.length(); i ++)
	            if(freq [s.charAt(i) - 'a'] == 1)
	                return i+1;
	        return -1;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	System.out.println(getUniqueCharacter("aaabbbc"));
}
}
