import java.util.ArrayList;
import java.util.List;

import com.instagram.entity.InstagramUser;

public class Lambda_Demo {

	public static void main(String[] args) {
		InstagramUser i1=new InstagramUser();
		i1.setName("a");
		i1.setPassword("abcd");
		i1.setEmail("s1");
		i1.setAddress("p1");
		
		InstagramUser i2=new InstagramUser();
		i2.setName("a1");
		i2.setPassword("abcd1");
		i2.setEmail("s11");
		i2.setAddress("p11");
		
		InstagramUser i3=new InstagramUser();
		i3.setName("a2");
		i3.setPassword("abcd2");
		i3.setEmail("s12");
		i3.setAddress("p12");
		
		InstagramUser i4=new InstagramUser();
		i4.setName("a3");
		i4.setPassword("abcd3");
		i4.setEmail("s13");
		i4.setAddress("p13");
		
		List<InstagramUser> list=new ArrayList<InstagramUser>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		list.forEach(value->{
			System.out.println(value.getAddress());
		});
		
		consumer
		supplier
		predicate
		function
		

	}

}














