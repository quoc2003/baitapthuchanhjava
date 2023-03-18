import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Nhap vao chuoi bat ki: ");
        chuoi = sc.nextLine();
             
        System.out.println("Cac ky tu co trong chuoi: ");
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
                 
            System.out.println(kyTu);
        }
    }
}