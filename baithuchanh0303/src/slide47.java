import java.util.Scanner;

public class slide47 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Nhap so nguyen can tinh: ");
            int number = scan.nextInt();

            sum  += number;

            if(sum > 100) { 
                System.out.println("Tong so nguyen vua nhap la: " + sum);
                break;
            }
        }
    }
}