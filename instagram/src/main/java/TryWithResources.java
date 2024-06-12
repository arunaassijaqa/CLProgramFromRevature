import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TryWithResources {

	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				) {
			
			
			System.out.println("enter your data");
			String str=br.readLine();
			
			System.out.println(str);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	@Override
	public String toString() {
		return "hello";
	}

}
