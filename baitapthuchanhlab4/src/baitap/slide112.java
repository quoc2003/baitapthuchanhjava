package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class slide112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhvien> sinhvien = new ArrayList<>();
        int a = 1;
        while(a==1) {
            System.out.println("1.them sinh vien");
            System.out.println("2.Hien thi sinh vien");
            System.out.println("3.Dem so sinh vien thi lai va hien thi");
            System.out.println("4.Hien thi cac sinh vien co diem cao nhat");
            System.out.println("5.Tim kiem sinh vien theo ten va hien thi");
            int choose;
            do {
                System.out.print("\nNhap lua chon : ");
                choose = sc.nextInt();
            }while((choose<0) || (choose>5));
                switch(choose) {
                    case 1:
                    sinhvien.themsinhvien(sinhvien);break;
                    case 2:
                    sinhvien.hienthi(sinhvien);break;
                    case 3:
                    sinhvien.demsinhvien(sinhvien);break;
                    case 4:
                    sinhvien.maxdiem(sinhvien);break;
                    case 5:
                    sinhvien.timkiem(sinhvien);break;
                }
        }
        
    }
}
