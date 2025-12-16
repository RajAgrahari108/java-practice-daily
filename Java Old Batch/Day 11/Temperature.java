public class Temperature {
    public static void main(String[] args) {
        int temp = 25;
        if(temp >= 1 && temp < 25){
            System.out.println("The temperature " + temp + "°C is Cold");
        }else if(temp >=25 && temp <35){
               System.out.println("The temperature " + temp + "°C is Worm");
        }else{
               System.out.println("The temperature " + temp + "°C is Hot");
        }
    }
}
