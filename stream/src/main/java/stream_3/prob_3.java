package stream_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob_3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			List<StringBuilder>arr=new ArrayList <StringBuilder>();
			 StringBuilder s1=new StringBuilder("aba");
			 StringBuilder s2=new StringBuilder("hello");
			 StringBuilder s3=new StringBuilder("madam");
			 StringBuilder s4=new StringBuilder("kik");
			 arr.add(s1);
			 arr.add(s2);
			 arr.add(s3);
			 arr.add(s4);
			for (StringBuilder x:arr) {
				System.out.println(x);
			
		}
			List<StringBuilder> st=arr.stream()
					  .filter(p->p==p.reverse())
					  .collect(Collectors.toList());
			System.out.println("Palindromes are...");
			for (StringBuilder x:st) {
				System.out.println(x.reverse());
			
		}
			s.close();

	}
	}
