package com.evergent.corejava.satish.application7;
import java.util.*;
public class SupportTicketSystem {
	
	// Method to add a ticket to the queue
	ArrayDeque<String>ticketQueue=new ArrayDeque<String>();
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }
    
 // Method to display all tickets currently in the queue
    public void displayQueue(String msg) {
    	System.out.println(msg);
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.println("Current queue:");
        for (String ticket : ticketQueue) {
            System.out.println(ticket);
        }
    }
    
    // Method to process the next ticket in the queue
    public void processNextTicket(String msg) {
    	System.out.println(msg);
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return;
        }
        String ticket = ticketQueue.poll();
        System.out.println("Processed: " + ticket);
    }
 
    // Method to check the next ticket without processing it
    public void peekNextTicket(String msg) {
    	System.out.println(msg);
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return;
        }
        String ticket = ticketQueue.peek();
        System.out.println("Next ticket to process: " + ticket);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SupportTicketSystem sts=new SupportTicketSystem();
		for(;;)
		{
		enum module1 {TICKET1,TICKET2,TICKET3,TICKET4,EXIT};
		System.out.println("Enter the ticket in (TICKET1,TICKET2,TICKET3,TICKET4,EXIT)");
		String str=sc.next();
		switch(module1.valueOf(str))
		{
		case TICKET1:System.out.println("Enter element into queue");
			sts.addTicket(sc.next());
		break;
		case TICKET2:sts.displayQueue("Ticket 2: Display all tickets");
		break;
		case TICKET3:sts.peekNextTicket("Ticket 3: Displays the next Element in queue");
		break;
		case TICKET4:sts.processNextTicket("Ticket 4:Display and deletes after the process of ticket");
		break;
		case EXIT:
			System.exit(0);
		}
		}
		// Adding some tickets
		
		 /*/ Display current queue
		sts.displayQueue();

        // Processing tickets
		sts.processNextTicket();
		sts.processNextTicket();

        // Check the next ticket without processing
		sts.peekNextTicket();

        // Display remaining queue
		sts.displayQueue();

        // Process remaining tickets
		sts.processNextTicket();
		sts.processNextTicket(); // Handling empty queue gracefully*/
	}

}
