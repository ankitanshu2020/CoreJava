package Comparable;

public class Student implements Comparable{
		String name;
		int roll_no;
		long ph_no;
		
		Student(){}
		
		public Student(String name, int roll_no, long ph_no) {
			super();
			this.name = name;
			this.roll_no = roll_no;
			this.ph_no = ph_no;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", roll_no=" + roll_no + ", ph_no=" + ph_no + "]";
		}
		
		//based on roll_no ----> Ascending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			if(this.roll_no<s.roll_no)
//				return -1;
//			else if(this.roll_no==roll_no)
//				return 0;
//			else
//				return 1;
//		}
		
		//------Shorcut----
		
		//based on roll_no ----> Ascending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			
//	       return this.roll_no - s.roll_no;
//		}	
		
		//based on roll_no ----> Descending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			if(this.roll_no<s.roll_no)
//				return 1;
//			else if(this.roll_no==roll_no)
//				return 0;
//			else
//				return -1;
//		}
		
		//based on Phone Number ----> Ascending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			if(this.ph_no<s.ph_no)
//				return 1;
//			else if(this.ph_no==ph_no)
//				return 0;
//			else
//				return -1;
//		}

		//------Shorcut----
		
			//based on Phone number ----> Ascending
//			@Override
//			public int compareTo(Object o){
//				Student s = (Student)o;
//				
//		       return (int)(this.ph_no - s.ph_no);
//			}
		
		
		//based on Phone Number ----> Descending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			if(this.ph_no<s.ph_no)
//				return 1;
//			else if(this.ph_no==ph_no)
//				return 0;
//			else
//				return -1;
//		}
		
		//based on name ----> Ascending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			
//	      return this.name.compareTo(s.name);
//		}
		
		//based on name ----> Descending
//		@Override
//		public int compareTo(Object o){
//			Student s = (Student)o;
//			
//	      return s.name.compareTo(this.name);
//		}

		@Override
		public int compareTo(Object o) {
			Student s = (Student)o;
			
			return s.name.compareToIgnoreCase(this.name);
		}
}
