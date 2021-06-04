import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num,sum=0,sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı girin");
        num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            if (i%4==0 && i%3==0) {
                sum += i;
                sayac++;
            }
        }
        System.out.println("sonuç : "+(sum/sayac));
    }
}
