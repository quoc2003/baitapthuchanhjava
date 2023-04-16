package baitapthuchanhlab3.hinhhoc.src.shapes;

import java.util.Scanner;

public class hinhtru extends hinhtron{

    public float chieucao;
    public hinhtru(){
        ten = " hình trụ";

    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();

    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;

    }
    
}
