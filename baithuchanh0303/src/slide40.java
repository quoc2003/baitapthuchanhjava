import java.util.Scanner;
 
public class slide40 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Mời bạn nhập ngày: ");
        int day = sc.nextInt();
         
        switch (day) {
        case 1:
            System.out.println("Đây là thứ 2");
            break;
        case 2:
            System.out.println("Đây là thứ 3");
            break;
        case 3:
            System.out.println("Đây là thứ 4");
            break;
        case 4:
            System.out.println("Đây là thứ 5");
            break;
        case 5:
            System.out.println("Đây là thứ 6");
            break;
        case 6:
            System.out.println("Đây là thứ 7");
            break;
        case 7:
            System.out.println("Đây là thứ Chủ Nhật");
            break;

            default: System.out.println("nhap so khong hop le");
        }
        
    }
}