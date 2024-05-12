package tester;

import java.util.HashSet;
import java.util.Set;

import com.app.core.Employee;

public class TestEmpSet {

	public static void main(String[] args) {
		//create empty HS of emps
		Set<Employee> emps=new HashSet<>();
		Employee e1=new Employee("rnd-001", "Rama Patil", 123456);
		Employee e2=new Employee("rnd-002", "Mihir Waze", 223456);
		Employee e3=new Employee("rnd-001", "Rama Patil", 123456);
		Employee e4=new Employee("rnd-006", "Rama Patil", 123456);
		Employee e5=new Employee("rnd-0011", "Rama Patil", 123456);
		
		// 1st emp added only checking hashcode but not check for equals because it will get null
//		bucket and for second one it will check using equals method and equals method gives false
//		means there is no match found and it will add the element.
//		For third emp it will check using equals method and get the match found and 
//		it will be not added into set. Next is Vica Versa...
		System.out.println("Added "+emps.add(e1));//t , hc=1
		System.out.println("Added "+emps.add(e2));//t , hc=1 , eq=1: f
		System.out.println("Added "+emps.add(e3));// f , hc=1 , eq=1 : t
		System.out.println("Added "+emps.add(e4));//t , hc=1 , eq : 
		System.out.println("Added "+emps.add(e5));//t , hc=1 , eq : 
		
		System.out.println("size "+emps.size());//3
		for(Employee e : emps )
			System.out.println(e);//dups !
//		System.out.println(e1.equals(e3));//t
//		System.out.println(e1.hashCode()+" "+e3.hashCode());//different

	}

}
