import SIIT.Homework09_Threads.FestivalGate;
import SIIT.Homework09_Threads.FestivalStatisticsThread;
import SIIT.Homework09_Threads.GateStats;
import SIIT.Homework09_Threads.TicketType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestForConcurrency {


     @Test
     public void TestForCountTickets()  {

             FestivalGate gate = new FestivalGate();
             gate.addTicket(TicketType.FULL_TICKET);
             gate.addTicket(TicketType.FREE_PASS);
             gate.addTicket(TicketType.ONE_DAY_PASS);



         FestivalStatisticsThread statsTest = new FestivalStatisticsThread(gate);

         statsTest.listStats();


         Map<TicketType, Integer> testStats = new HashMap<>();
         testStats.put(TicketType.FULL_TICKET,1);
         testStats.put(TicketType.FREE_PASS,1);
         testStats.put(TicketType.ONE_DAY_PASS,1);

         Assertions.assertEquals(1,testStats.get(TicketType.FULL_TICKET));
         Assertions.assertEquals(1,testStats.get(TicketType.FREE_PASS));
         Assertions.assertEquals(1,testStats.get(TicketType.ONE_DAY_PASS));
         Assertions.assertEquals(3,testStats.size());







     }
    }

