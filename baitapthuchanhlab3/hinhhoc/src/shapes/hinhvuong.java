package baitapthuchanhlab3.hinhhoc.src.shapes;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
    public hinhvuong(){
        ten = "hinh vuong";

    }
    public void nhapcanh(){
        System.out.println("canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
    
}
