package SIIT.Homework09_Threads;

import java.util.*;


public class FestivalGate {


   private final Queue <TicketType> ticketTypeQueue = new LinkedList<>();


   public synchronized void addTicket(TicketType ticketType){
       ticketTypeQueue.offer(ticketType);
   }

    public Queue<TicketType> getTicketType() {
        return new LinkedList<>(ticketTypeQueue);
    }


}
