package virtusa;

public class BinarySubString {
public static int count(String s)
{
	char str[] = s.toCharArray(); 
	int n=str.length;
	int m = 0; 
    for (int i = 0; i < n; i++)  
    { 
        if (str[i] == '1') 
            m++; 
    } 
    return m * (m - 1) / 2; 
}

























public static void main(String[] args) {
	System.out.println(count("001100011"));
}
}
