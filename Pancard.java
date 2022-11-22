import java.util.Scanner;
class  InvalidPanException extends Exception{
    public InvalidPanException(String s){
        super(s);
    }
}
public class Pancard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println("Enter Your Pan Card Number:");
        String pan=sc.nextLine();
        String nam1= String.valueOf(name.charAt(0));
        String pan1= String.valueOf(pan.charAt(4));
        try {
            if(nam1.equalsIgnoreCase(pan1) && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
                System.out.println("Pan Card is Valid");
            }
            else {
                throw new InvalidPanException("Invalid Pan Card");
            }
        }
        catch (InvalidPanException p){
            System.out.println("Exception Caught"+p.getMessage());
        }
    }
}