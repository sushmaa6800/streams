package stream_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors; 


public class prob_2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			List<String>arr=new ArrayList <String>();
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				arr.add(s.next());
				
			}
			
			List<String> st=arr.stream()
					  .filter(p -> p.startsWith("a"))
					  .filter(t -> t.length() == 3)
					  .collect(Collectors.toList());
			System.out.println("The Strings are....");
			for (String x:st) {
				System.out.println(x);
			}
			s.close();

		}

	}

