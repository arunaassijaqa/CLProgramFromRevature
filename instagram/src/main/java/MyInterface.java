import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface MyInterface {
	void calculateInterest(double p,float rate,int duration);
	
}


class Lambda{
	public static void main(String arg[]) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("all number");
		calculate(list,(n)->true);
		System.out.println("even number");
		calculate(list, (n)-> n%2==0);
		
		System.out.println("odd number");
		calculate(list, (n)-> n%2==1);
		
		System.out.println("greater than 3");
		calculate(list,(n)->n>3);
		
	}
	
	public static void calculate(List<Integer> list, Predicate<Integer> pp) {
		for(Integer i:list) {
			if(pp.test(i)) {
				System.out.println(i+"  ");
			}
		}
	}
}