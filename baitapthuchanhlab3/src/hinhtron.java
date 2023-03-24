import java.util.Scanner;

public class hinhtron {
    public float bk;
    public float pi = 3.14f;
    public float chuvi;
    public float dientich;

    public void nhapbankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nhap ban kinh :");
        bk =sc.nextFloat();
        sc.close();
    
    }
    public float chuvi() {
        chuvi = (bk*2)*pi;
        return chuvi;

    }
    public float dientich(){
        dientich = (bk*bk)*pi;
        return dientich;
    }
    public void hienthi(){
        System.out.printf("\nchu vi hinh tron la : %f", chuvi());
        System.out.printf("\ndien tich hinh tron la : %f", dientich());

    }
    public static void main(String[] args) {
        hinhtron ht1 = new hinhtron();
        ht1.nhapbankinh();
        ht1.hienthi();
    }

    
}
