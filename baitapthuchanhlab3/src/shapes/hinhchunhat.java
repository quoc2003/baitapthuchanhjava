package baitapthuchanhlab3.src.shapes;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai;
    public float rong;

    public hinhchunhat(){
        ten = "hinh chu nhat";

    }
    public void nhapchieudai(){
        System.out.println("chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();

    }
    public void nhapchieurong(){
        System.out.println("chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * ( dai + rong );
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }

}
    
