package oops;

public class Encap {
private int age=19;
private String name="abc";
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	Encap e=new Encap();
	System.out.println(e.age);
	System.out.println(e.getAge());
	System.out.println(e.name);
	System.out.println(e.getName());
	e.age=23;
	e.name="xyz";
	System.out.println(e.getAge());
	System.out.println(e.getName());
	
}
}
