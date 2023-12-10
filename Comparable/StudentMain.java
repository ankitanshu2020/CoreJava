package Comparable;
import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("Rohan",56,64236346l);
		s[1] = new Student("mohan",32, 23245325235325l);
		s[2] = new Student("sohan", 12,4123l);

		Arrays.sort(s);
		//sort student array
		
//		for(int i=0;i<s.length;i++){
//			for(int j=i+1;j<s.length;j++){
//				if(s[i].roll_no<s[j].roll_no){
//					Student s1 = s[i];
//					s[i] = s[j];
//					s[j] = s1;
//				}
//			}
//		}
		
		System.out.println("================");
		
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}

	}

}