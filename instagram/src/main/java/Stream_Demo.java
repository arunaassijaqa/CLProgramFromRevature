import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.instagram.entity.Employee;

public class Stream_Demo {

	public static void main(String[] args) {
		Employee.persons().stream().filter(Employee::isFemale).map(Employee::getName).forEach(System.out::println);
		
		Employee.persons().stream().filter(Employee::isMale).filter(p->p.getIncome()>5001.0).map(Employee::getName).forEach(System.out::println);
		
		double sum=Employee.persons().stream().map(Employee::getIncome).reduce(0.0,Double::sum);
		System.out.println(sum);
		
		double sum1=Employee.persons().stream().mapToDouble(Employee::getIncome).sum();
		System.out.println(sum1);
		
		OptionalDouble maxsal=Employee.persons().stream().mapToDouble(Employee::getIncome).max();
		System.out.println(maxsal);
		
		List<String> name=Employee.persons().stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(name);
		
		DoubleSummaryStatistics income=Employee.persons().stream().collect(Collectors.summarizingDouble(Employee::getIncome));
		System.out.println(income);
		
		Map<Employee.Gender, Long> countgender=Employee.persons().stream().collect(Collectors.toMap(Employee::getGender, p->1L,(oldCount,newCount)->oldCount+newCount));
		System.out.println(countgender);
		
		Map<Employee.Gender, String> namegender=Employee.persons().stream().collect(Collectors.toMap(Employee::getGender, 
				Employee::getName,(oldCount,newCount)->String.join(", ",oldCount,newCount)));
		System.out.println(namegender);

	}

}




