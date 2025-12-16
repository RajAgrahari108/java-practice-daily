class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2002;

        if (year % 400 == 0) {
            System.out.println("Year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("Year is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Year is a leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }
}
