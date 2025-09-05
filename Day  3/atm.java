public class atm {
    public static void main(String[] args) {
     double num = 20000;
    double amt = 500;
    int pin = 1234;
    int mainPin= 1234;

    if(mainPin == pin)
    {
        if(amt <= num)
        {
             System.out.println("Withdeol succefull");
             System.out.println("remaning money" + (amt -num));

        }
        else
        {
             System.out.println("amount is insufecionet");
        }
    }
    else
    {
             System.out.println("wrong pin");

    }
    
   }
}
