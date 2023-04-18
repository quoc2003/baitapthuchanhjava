package baitapthuchanhlab3.src.shapes;

import java.util.Scanner;

public class hinhtron extends hinhhoc{
    public float bankinh;

    public hinhtron(){
        ten = "hinh tron";
    }
    public void nhapbankinh() {
        System.out.println("ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();

    }
    public void tinhchuvi(){
        chuvi = 2 * bankinh;

    }
public void tinhdientich(){
    dientich = PI * bankinh * bankinh;
}
    
}
