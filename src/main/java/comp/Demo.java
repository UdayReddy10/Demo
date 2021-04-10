package comp;

import java.util.*;
import java.util.Map.Entry;

public class Demo {
public static void main(String[] args) {
	Map<String, String> m=new TreeMap<String,String>();
	m.put("Bahubali", "Prabhas");
	m.put("Sivagami", "Ramya");
	m.put("Devasena", "Anushka");
	m.put("Avantika", "Tamannah");
	m.put("Kattapa", "Satyaraj");
	System.out.println(m);
	System.out.println(m.size());
	m.put("Devasena", "Sweety");
	System.out.println(m);
	m.remove("Sivagami");
	System.out.println(m);
	System.out.println(m.get("Sivagami"));
	Set<String> s=m.keySet();
	System.out.println(s);
	Iterator<String> itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Set<Entry<String, String>> e=m.entrySet();
	for(Entry m1:e)
	{
		System.out.println(m1.getKey()+"====>"+m1.getValue());
		
	}
}
}
