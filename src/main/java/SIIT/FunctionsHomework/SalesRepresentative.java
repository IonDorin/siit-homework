package SIIT.FunctionsHomework;

public class SalesRepresentative {


    private final String name;
    private final int revenue;


    public  SalesRepresentative(String name, int revenue) {

        this.name = name;
        this.revenue = revenue;

    }


    public int getRevenue() {
        return revenue;
    }



    public static SalesRepresentative[] sort(SalesRepresentative[] reps) {


        for (int i = 0; i < reps.length; i++) {
            SalesRepresentative aux;
            for (int j = 0; j < reps.length-1 ; j++)


                if (reps[j].revenue < reps[j + 1].revenue) {
                    aux = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = aux;

                }


        }


        return reps;
    }

    @Override
    public String toString() {
        return name;
    }




}

