package SIIT.Homework09_Threads;


public class Main {
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(gate);


        for (int i = 0; i < 120; i++) {

            new FestivalAtendeeThread(gate,TicketType.randomTickets()).start();

        }

        festivalStatisticsThread.start();
    }
        }


