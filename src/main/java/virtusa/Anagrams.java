package virtusa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
public static int getGrouped(List<String> words)
{
	String strs[]=new String[words.size()];
	for(int i=0;i<words.size();i++)
	{
		strs[i]=words.get(i);
	}
	if (strs == null || strs.length == 0) 
	{
		return new ArrayList<String>().size();
	}
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) 
    {
        char[] ca = new char[26];
        for (char c : s.toCharArray()) ca[c - 'a']++;
        String keyStr = String.valueOf(ca);
        if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
        map.get(keyStr).add(s);
    }
    return new ArrayList<>(map.values()).size();
}
}
