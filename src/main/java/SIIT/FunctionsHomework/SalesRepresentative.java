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

    /** In this method we are sorting an array of objects using bubble-sort method.
     *
     * @param reps is the array that needs to be sorted.
     * @return sorted array reps.
     */

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

