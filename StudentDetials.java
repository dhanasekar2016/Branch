package Arraylist;

import java.util.ArrayList;

public class StudentDetials {
	String name;
	int age;
	int mark;
	boolean isMale;
	
	public StudentDetials(String name,int age,int mark,boolean isMale) {
		this.name=name;
		this.age=age;
		this.mark=mark;
		this.isMale=isMale;
	}
	public String toString() {
		return "Name: "+name+", Age: "+age+", Mark: "+mark+", IsMale; "+isMale;
	}

}
