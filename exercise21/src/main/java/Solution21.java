import java.util.*;

class Solution21{

    //main function
    public static void main(String[] args) {

    //scanner
    Scanner in = new Scanner(System.in);
    Solution21 ntn = new Solution21();

    //get number for month
    System.out.print("Please enter the number of month: ");
    int month = in.nextInt();
    String result = ntn.getMonth(month);

    //get month or display error msg
    if(month>0 && month<12)
        System.out.print("The name of month is "+result);
    else
        System.out.print(result+" :please enter correct month number");
}

    //second function
    public String getMonth(int month){
        //switch cases
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";

            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }
    }

}