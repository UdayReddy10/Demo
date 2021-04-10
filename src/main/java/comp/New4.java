package comp;

public class New4 extends New3 {
public New4(int index)
{
	index=index;
}
public static void main(String[] args) {
	New4 n=new New4(10);
	System.out.println(n.index);
}
}
