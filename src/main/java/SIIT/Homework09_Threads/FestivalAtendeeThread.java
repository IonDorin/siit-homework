package SIIT.Homework09_Threads;

import java.util.Random;

import static SIIT.Homework09_Threads.TicketType.randomTickets;

public class FestivalAtendeeThread extends Thread {
    private final FestivalGate gate;
    private final TicketType ticketType;

    public FestivalAtendeeThread(FestivalGate gate,TicketType ticketType){
        this.gate =gate;
        this.ticketType = ticketType;
    }

    @Override
    public void  run() {



            try {
            int timeOfArrivalMs = new Random().nextInt(60_000);
            Thread.sleep(timeOfArrivalMs);
                synchronized (gate){
                    this.gate.addTicket(ticketType);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



    }

}
