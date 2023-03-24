import java.util.Scanner;

public class nhanvien {
    public String hoten;
    public int tuoi;
    public float hesoluong;
    final float luongcoban = 1490000;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nnhap ho ten :");
        hoten = sc.nextLine();
        System.out.print("\nnhap tuoi :");
        tuoi = sc.nextInt();
        System.out.print("\nnhap he so luong :");
        hesoluong = sc.nextFloat();
        sc.close();

    }
    public float tinhluong (float hesoluong){
        return (float) hesoluong*luongcoban;
    }
    public void hienthi(){
        System.out.printf("\nten : %s - %d ",hoten,tuoi);
        System.out.printf("\ntien luong nhan duoc : %f", Math.ceil(tinhluong(hesoluong)));
    }
    public static void main(String[] args) {
        nhanvien nv = new nhanvien();
        nv.nhapthongtin();
        nv.hienthi();

    }
    
}
