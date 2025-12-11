public class CheckTypeUpLoSpDi {
    public static void main(String[] args) {
        char ch = '!';
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else if(ch >= 'A' && ch <= 'Z'){
             System.out.println("Uppercase Case");
        }else if (ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special char");
        }
    }
}
