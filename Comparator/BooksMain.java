package Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class BooksMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Books b1 = new Books("Advanced Java", 5500d, 2019, "Shivu Sir");
		Books b2 = new Books("Advanced Python", 5400d, 2018, "Adarsh Sir");
		Books b3 = new Books("Core Java", 3300d, 2021, "Harish Sir");
		Books b4 = new Books("SQL", 4000d, 2020, "Shymala Mam");
		Books b5 = new Books("HtmlTags", 2500d, 2016, "Akshay Sir");
		
		Books[] b = {b1, b2, b3, b4, b5};
		
		boolean flag = false;
		
		while(!flag) {
			System.out.println("=====Enter Your Choice=====");
			System.out.println("1.SortAccordingToTitle");
			System.out.println("2.SortAccordingToPrice");
			System.out.println("3.SortAccordingToYoP");
			System.out.println("4.SortAccordingToAuthor");
			System.out.println("5.Exit");
			System.out.println("===========================");
			
			int choice = sc.nextInt();

			switch(choice) {
			
			case 1:
			{
				Arrays.sort(b, new SortAccordingToTitle());
				for(Books bb : b) {
					System.out.println(bb);
				}
				System.out.println("===========================");
			}break;
			
			case 2:
			{
				Arrays.sort(b, new SortAccordingToPrice());
				for(Books bb : b) {
					System.out.println(bb);
				}
				System.out.println("===========================");
			}break;
			
			case 3:
			{
				Arrays.sort(b, new SortAccordingToYoP());
				for(Books bb : b) {
					System.out.println(bb);
				}
				System.out.println("===========================");
			}break;
			
			case 4:
			{
				Arrays.sort(b, new SortAccordingToAuthor());
				for(Books bb : b) {
					System.out.println(bb);
				}
				System.out.println("===========================");
			}break;
			
			case 5:
			{
				flag = true;
			}break;
			
			default:
			{
				System.out.println("Invalid option!!!");
			}
		   }
	    }
	}
}
