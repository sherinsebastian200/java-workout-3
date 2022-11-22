import java.util.Scanner;
class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String str){
        super(str);
    }
}
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String str){
        super(str);
    }
}
public class Longshort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        int l=s.length();
        try {
            if(l>10){
                throw new ExceptionLineTooLong("The input is too long");
            }
            else if (l<5) {
                throw new ExceptionLineTooShort("The input is too short");
            }
            else{
                System.out.println("String length is correct");
            }
        }
        catch (ExceptionLineTooLong el){
            System.out.println("Exception Caught "+el.getMessage());
        }
        catch (ExceptionLineTooShort es){
            System.out.println("Exception Caught "+es.getMessage());
        }
    }
}