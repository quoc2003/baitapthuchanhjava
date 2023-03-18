import java.text.Format;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("nhap vao a:");
       int a = sc.nextInt();
       System.out.println("nhap vao b:");
       int b = sc.nextInt();


       System.out.println("tong:"+(a+b));
       System.out.println("tich:"+(a*b));
       System.out.println("thuong:"+(a/b));
       System.out.println("hieu:"+(a-b));
       System.out.println("du:"+(a%b));

       if(a>b){
        System.out.printf("%d>%d", a,b);
       
       }
    }
}
