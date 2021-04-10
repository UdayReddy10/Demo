package comp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TreeHeight {
public int feets;
public int inches;

public TreeHeight(int feets, int inches) {
	super();
	this.feets = feets;
	this.inches = inches;
}
static int TallestTress(TreeHeight[] trees)
{
	try {
	int[] res=new int[trees.length];
	int max=-1;
	for (int i = 0; i < trees.length; i++) {
		res[i]=(trees[i].feets*12)+trees[i].inches;
	}
	Arrays.sort(res);
	return res[res.length-1];
	}
	catch(Exception e)
	{
		return -1;
	}
}
public static void main(String[] args) {
	TreeHeight[] t= {new TreeHeight(10,4),new TreeHeight(23,5),new TreeHeight(21,2),new TreeHeight(27,7)};
	System.out.println(TallestTress(t));
}
}
