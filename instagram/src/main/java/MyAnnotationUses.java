@MyAnnotation("Jack")
@MyAnnotation("Rajesh")
@MyAnnotation("Martin")
public class MyAnnotationUses {

	public static void main(String[] args) {
		for(MyAnnotation a:MyAnnotationUses.class.getAnnotationsByType(MyAnnotation.class)) {
			System.out.println(a.value());
		}

	}

}
