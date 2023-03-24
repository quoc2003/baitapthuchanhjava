import java.util.Scanner;

public class hinhtrutron {
    public float bk;
    public float cc;
    final float pi = 3.14f;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nnhap ban kinh :");
        bk =sc.nextFloat();
        System.out.printf("\nnhap chieu cao");
        cc = sc.nextFloat();
        sc.close();
    }
    public float chuvi(){
        chuvi = 2*pi*bk*cc;
        return chuvi;

    }
    public float dientich(){
        dientich = 2*pi* bk*(bk + cc );
        return dientich;
    }
    public float thetich(){
        thetich = pi*bk*bk*cc;
        return thetich;
    }
    public void hienthi(){
        System.out.printf("\nchu vi hinh tron la : %f", chuvi());
        System.out.printf("\ndien tich hinh tron la : %f", dientich());
        System.out.printf("\nthe tich hinh tron la : %f", thetich());


}
public static void main(String[] args) {
    hinhtrutron ht2 = new hinhtrutron();
    ht2.nhapthongtin();
    ht2.hienthi();
}
}
