package java8;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Set;
	import java.util.stream.Collectors;

	public class Employeestream {

		public static void main(String[] args) {
			List<Integer> number = Arrays.asList(2,3,4,5,3);
			Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

			ArrayList<Employee> al= new ArrayList<>();
			al.add(new Employee("Ankita", 45, "Student", "Akola", 25000));
			al.add(new Employee("Nikita", 45, "Student", "Akot", 35000));
			al.add(new Employee("Aniket", 45, "Student", "Akola", 45000));
			al.add(new Employee("Nikhil", 45, "Student", "Amravati", 32000));
			al.add(new Employee("Aniket", 45, "Student", "Akola", 43000));
			//Set<Employee> e=new Set<>();
			List<String> e=al.stream().map(v->v.toString()).collect(Collectors.toList());
			System.out.println(e);
			
			double salaryaverage=al.stream().collect(Collectors.averagingInt(s->s.salary));
			System.out.println(salaryaverage);
			
			al.stream()
	        .sorted(
	             (emp1, emp2) ->e.getName().compareToIgnoreCase(emp2.getName()) 
	        )
	        .forEach(
	             emp-> System.out.println(emp)
	        );
			
			
		}
		
		
		
	}
	