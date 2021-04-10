package Deloitte;

import java.util.*;

public class Social {
	private static boolean isDivisor(int n, Set<Integer> set) {
        for (int elem : set) {
            if (n % elem == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean addedToOneSet(int n, List<Set<Integer>> list) {
        for (Set<Integer> set : list) {
            if (isDivisor(n, set)) { 
                set.add(n);
                return true;
            }
        }
        return false;
    }

    public int  friendGroups(int input1) {
    	int n=input1;
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.add(2);
        list.add(set);
        for (int i =  3; i <= n; i += 2) {
            if (i * 2 <= n) {
                list.get(0).add(i);
            } else {
                if (!addedToOneSet(i, list)) {
                    Set<Integer> newset = new HashSet<>();
                    newset.add(i);
                    list.add(newset);
                }
            }
        }
        return list.size();
    }
}
