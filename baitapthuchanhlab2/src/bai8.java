import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Nhập số thứ " + i + ": ");
            number = sc.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng của day la: " + avgNumber);
    }
}
