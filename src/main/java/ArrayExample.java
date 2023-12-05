import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args){

        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Sunday";
        System.out.println(Arrays.toString(weekdays));

        weekdays= new String[]{"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(Arrays.toString(weekdays));

        for(String day : weekdays){
            System.out.println("Day of the week: " + day);
        }
    }
}