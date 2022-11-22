import java.util.Scanner;

public class Substring {
    static void Substring(char str[], int l) {
        for (int len = 1; len <= l; len++) {


            for (int i = 0; i <= l-len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add Character");
        char[] str = sc.next().toCharArray();

        Substring(str, str.length);


    }
}

