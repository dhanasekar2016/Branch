package Arraylist;
import java.util.ArrayList;
public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Ashok",23,"Male",40000,2,"IT");
		Employee e2=new Employee("Ajith",22,"Male",20000,1,"NonIt");
		Employee e3=new Employee("Priya",22,"female",10000,2,"Teacher");
		Employee e4=new Employee("Thiru",25,"Male",50000,4,"Mehanical");
		Employee e5=new Employee("Ganesh",24,"Male",30000,3,"civil");
		
		ArrayList<Employee>emp=new ArrayList <>(); 
		ArrayList<Employee>increEmp=new ArrayList <>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
//		for(int i=0;i<emp.size();i++) {
//			if(emp.get(i).getExp()>2) {
//				increEmp.add(emp.get(i));
//			}
//		}
//		for(int i=0;i<increEmp.size();i++) {
//			System.out.println(increEmp.get(i));
//		}
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getExp()>=2) {
				emp.get(i).setSalary(emp.get(i).getSalary()+10000);
				
			increEmp.add(emp.get(i));
		
			}
		}
		for(Employee e:increEmp) {
		System.out.println(e);
		}
		
	}

}
