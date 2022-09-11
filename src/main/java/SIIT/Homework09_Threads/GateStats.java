package SIIT.Homework09_Threads;



import java.util.HashMap;
import java.util.Map;

public class GateStats {


    private final Map<TicketType,Integer> ticketCount = new HashMap<>();
    private int totalTickets = 0;

    public void countTickets (TicketType ticketType){
        totalTickets++;
        Integer previousCount = ticketCount.get(ticketType);
        Integer newCount = previousCount == null ? 1 : previousCount + 1;
        ticketCount.put(ticketType, newCount);
    }
    public void listTickets(){
        System.out.println(totalTickets + " people entered");

        ticketCount.entrySet().stream()
                .map(entry -> entry.getValue() + " have " + entry.getKey() + " tickets")
                .forEach(System.out::println);

    }
    public Map<TicketType, Integer> getTicketCount() {
        return ticketCount;
    }

}
