package SIIT.Homework09_Threads;
;
import java.util.Random;

public enum TicketType {

        FULL_TICKET,
        FREE_PASS,
        VIP_PASS,
        ONE_DAY_PASS,
        ONE_DAY_VIP_PASS;

        public static TicketType randomTickets(){
                TicketType[] values = TicketType.values();
                int index = new Random().nextInt(values.length);
                return values[index];

        }
    }

