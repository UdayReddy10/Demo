package Deloitte;

public class maxCoins {
	static char flip(char ch)
	{
	    return (ch == '0') ? '1' : '0';
	}

	static int getFlipWithStartingCharcter(String str,char expected)
	{
	    int flipCount = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) != expected)
	        {
	            flipCount++;
	        }
	        expected = flip(expected);
	    }

	    return flipCount;
	}
public static void main(String[] args) {
	int array[]= {0,1,0};
	String str="";
	for (int i = 0; i < array.length; i++) {
		str+=String.valueOf(array[i]);
	}
	
	System.out.println(getFlipWithStartingCharcter(str, '0')+" "+" "+getFlipWithStartingCharcter(str, '1'));
	
}

}

