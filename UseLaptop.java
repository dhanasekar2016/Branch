package Arraylist;
import java.util.ArrayList;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Hp","Black",50000,"XRT11",6,"3i",false);
		Laptop l2=new Laptop("Dell","White",70000,"DeT13",8,"5i",false);
		Laptop l3=new Laptop("infinix","Red",60000,"vcy1",6,"3i",true);
		Laptop l4=new Laptop("Lenovo","Black",65000,"L1",8,"6i",true);
		Laptop l5=new Laptop("Samsung","Blue",80000,"SmPro",8,"10i",true);
		Laptop l6=new Laptop("ThinkPad","green",30000,"v11",4,"3i",false);
		Laptop l7=new Laptop("Apple","White",100000,"MaxPro",10,"10i",true);
		
		ArrayList<Laptop>laps=new ArrayList <>();
		ArrayList<Laptop>touchLaps=new ArrayList<>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		laps.add(l5);
		laps.add(l6);
		laps.add(l7);
//		for(int i=0;i<laps.size();i++) {
//			//System.out.println(laps.get(i));
//			if(laps.get(i).getprice()>50000&&laps.get(i).getprice()<100000) {
//				System.out.println(laps.get(i));
//			}
//		}
//		for(Laptop l:laps) {
//			if(l.getRam()<8) {
//				System.out.println(l.getBrand());
//			}
//		}
//		
		laps.forEach((l)->{
			if(l.getRam()<8) {
				System.out.println(l.getBrand());
			}

		});
	}
}
		

	
