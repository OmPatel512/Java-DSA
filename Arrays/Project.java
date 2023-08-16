import java.util.*;

public class Project {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many day's temperature? ");
        int num_days = s.nextInt();

        int[] daily_temp = new int[num_days];
        double average  = 0;
        // record temperature and find average
        for(int day=0; day<num_days;day++) {
            System.out.println((day+1) +"days's high temperature");
            int temp = s.nextInt();
            daily_temp[day] = temp;
            average = average + temp;
        }
        average = average/num_days;

        // count days above average
        int high_day = 0;
        for(int i=0; i<daily_temp.length; i++) {
            if(daily_temp[i] > average) {
                high_day++;
            }
        }
        System.out.println("Average = "+ average);
        System.out.println(high_day + "days are above average temp.");
    }
}
