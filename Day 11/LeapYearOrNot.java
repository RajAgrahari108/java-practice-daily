public class LeapYearOrNot {
    public static void main(String args[]){
        int year  = 1600;
        if((year % 4==0 && year %100 !=0) ||( year %400 ==0)){
            System.out.println("Year is leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}
