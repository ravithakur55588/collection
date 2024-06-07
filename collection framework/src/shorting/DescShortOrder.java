package shorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescShortOrder {
public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"rakesh",28,40000));
		emp.add(new Employee(102,"mukesh",30,48000));
		emp.add(new Employee(103,"jp",40,20000));
		emp.add(new Employee(104,"mohan",35,35000));
		
		//shorting in descending order (by salary)
//		Collections.sort(emp, new NewSort());
//		System.out.println(emp);
		
		//.....OR......( without some new class (eg. MySort))(using lamda exprassion)
		
				Collections.sort(emp, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return (int)(o1.getSalary() - o2.getSalary());
					}
				});
				
				Collections.sort(emp, (o1,o2) -> (int)(o2.getSalary() - o1.getSalary()));
				System.out.println(emp);
	}

}

//class NewSort implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int)(o2.getSalary() - o1.getSalary());
//	}
//
//}
	

