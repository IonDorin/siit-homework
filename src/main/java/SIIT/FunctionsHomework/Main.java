package SIIT.FunctionsHomework;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative[] reps = new SalesRepresentative[5];

        SalesRepresentative John = new SalesRepresentative( "John",10,400);
        SalesRepresentative Marry = new SalesRepresentative( "Marry",21,100);
        SalesRepresentative Ted = new SalesRepresentative( "Ted",15,700);
        SalesRepresentative Tom = new SalesRepresentative( "Tom",10,1200);
        SalesRepresentative Ana = new SalesRepresentative("Ana", 4,500);

        reps[0] = Ana;
        reps[1] = John;
        reps[2] = Marry;
        reps[3] = Ted;
        reps[4] = Tom;

        System.out.println("Before bubble-sort");

        for (SalesRepresentative rep : reps) {
            System.out.println(rep.toString()+ " has sales revenue "+ rep.getRevenue() );
        }
        System.out.println("After bubble-sort");

        SalesRepresentative[] sortedReps =SalesRepresentative.sort(reps);

        for (SalesRepresentative sortedRep : sortedReps) {
            System.out.println(sortedRep);

        }

    }


}


















