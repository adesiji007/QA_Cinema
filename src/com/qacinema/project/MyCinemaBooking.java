package com.qacinema.project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCinemaBooking {
	
	
	public static void main(String[] args){
		
		// define the constructor
				Scanner reader = new Scanner(System.in);
				//Movies movie1 = new Movies ("101","Mission impossible","the killer Man","Monday", "1.54");
				ArrayList<Movies> list = new ArrayList<>();
				list.add(new Movies ("101","Mission impossible","the killer Man","Monday", "1.54"));
				list.add(new Movies ("102","Boss Baby","funny boy","Friday", "1.54"));
				list.add(new Movies ("103","Lord of the Ring ","kill them all","Monday", "1.54"));
				list.add(new Movies ("103","Spider Man 2 ","Save Universe","Monday", "1.54"));
				

				for(int i = 0; i< list.size(); i++){
					System.out.println(i+1 + " : " + list.get(i).getMovies_Title());
				}
				
				System.out.println("please choose number between 1 to 4 for your Movie : ");
				
				int movieChoice;
				
		do{
			Scanner reader1 = new Scanner(System.in);
			movieChoice = reader1.nextInt();
			if(movieChoice<0 || movieChoice>1){System.out.println("please the valid Movies! : ");}
		}while(movieChoice<0 || movieChoice>1);
		
		// instances of classes
		OAP_Ticket oap = new OAP_Ticket();
		Standard_Ticket standard = new Standard_Ticket();
		Student_Ticket student = new Student_Ticket();
		Child_Ticket child = new Child_Ticket();
		
		System.out.println("Number of Standard Tickets :");
		Scanner reader1 = new Scanner(System.in);
		int numStandardTickets = reader.nextInt();
		
		System.out.println("Number of OAP Pensioners Tickets :");
		Scanner reader2 = new Scanner(System.in);
		int numOAPTickets = reader.nextInt();
		
		System.out.println("Number of Student Tickets :");
		Scanner reader3 = new Scanner(System.in);
		int numStudentTickets = reader.nextInt();
		
		System.out.println("Number of Child Tickets :");
		Scanner reader4 = new Scanner(System.in);
		int numChildTickets = reader.nextInt();
		
		
		//to get the price for the ticket
		double totalStandardTickets = standard.applyDiscount(Standard_Ticket.TICKET_PRICE) * numStandardTickets;
		
		double totalOAPTickets = oap.applyDiscount(OAP_Ticket.TICKET_PRICE) * numOAPTickets;
		
		double totalStudentTickets = student.applyDiscount(Student_Ticket.TICKET_PRICE) * numStudentTickets;
		
		double totalChildTickets = child.applyDiscount(Child_Ticket.TICKET_PRICE) * numChildTickets;
		
		// print out the values
		
		System.out.println("The Total cost of the movies is : " + (totalStandardTickets + totalChildTickets + totalOAPTickets + totalStudentTickets));
		
		
	}

}
