import java.util.Scanner;
public class Multipleline
{
        public static void main(String[] args)
        {
            int vowels=0,i,l=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the paragraph:");
            String str=sc.nextLine();
            String[] lines=str.split("\\n+");
            String[] words=str.split("\\s+");
            System.out.println("Number of lines:"+lines.length);
            System.out.println("Number of words:"+words.length);
            String str1=str.toLowerCase();
            for(i=0;i<str.length();i++){
                char v=str1.charAt(i);
                if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u'){
                    vowels++;
                }
            }
            System.out.println("Number of vowels:"+vowels);
        }
}
