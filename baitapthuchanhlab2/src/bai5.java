import java.util.Scanner;

public class bai5 {
    
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);

        while (sum< 100){
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            number = sc.nextInt();
            sum += number;

        }
        System.out.println("Tổng các số nguyên vừa nhập = " + sum);

    }
}
