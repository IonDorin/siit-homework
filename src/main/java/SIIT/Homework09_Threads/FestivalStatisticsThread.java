package SIIT.Homework09_Threads;


import java.util.LinkedList;
import java.util.Queue;

public class FestivalStatisticsThread extends Thread {
    final FestivalGate gate;
public FestivalStatisticsThread(FestivalGate gate){
    this.gate = gate;
}

    @Override
    public void run() {
        try {
            for (int i = 0; i <12 ; i++) {
                Thread.sleep(5000);

                listStats();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void listStats(){
    synchronized (gate){
        GateStats stats = new GateStats();
        gate.getTicketType().forEach(stats::countTickets);
        stats.listTickets();
    }

    }
}
