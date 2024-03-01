package fc.java.part2;

import java.util.Calendar;
import java.util.Date;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        int week_num = calendar.get(Calendar.DAY_OF_WEEK) + 2;
        switch (week_num){
            case 1:
                System.out.println("Basketball");
                break;
            case 2:
                System.out.println("Swimming");
                break;
            case 3:
                System.out.println(date);
                System.out.println("Swimming");
                break;
            case 4:
                System.out.println("Take a rest");
                break;
            case 5:
                System.out.println("Take a rest");
                break;
            case 6:
                break;
            case 7:
                System.out.println("Baseball");
                break;
        }
    }
}
