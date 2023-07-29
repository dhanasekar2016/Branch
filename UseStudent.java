package Arraylist;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		StudentDetials s1=new StudentDetials ("Ashok",17,78,true);
		StudentDetials s2=new StudentDetials ("Ajith",16,88,true);
		StudentDetials s3=new StudentDetials ("priya",17,40,false);
		StudentDetials s4=new StudentDetials ("Thiru",17,90,true);
		StudentDetials s5=new StudentDetials ("Arun",17,43,true);
		
		ArrayList<StudentDetials>stu=new ArrayList<>();
		ArrayList<StudentDetials>topper=new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		ArrayList<StudentDetials> max=stu.get(0).price;
		
		for(int i=0;i<stu.size();i++) {
			if(max.get(i).mark>stu.get(i).mark) {
				max=stu.get(i).mark;
				topper.add(stu.get(i));
			}
		}
		for(StudentDetials s:topper) {
			System.out.println(s);
		}
	}

}
