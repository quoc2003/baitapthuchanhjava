package baithuchanhlab4.src.baitap;
import java.util.ArrayList;
import java.util.Scanner;
public class slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int c,a;
        do{
        System.out.print("Nhap vao so luong phan tu :");
         a=sc.nextInt();
        }while(a<=0);
        for(int i=0;i<a;i++) {
            System.out.printf("nhap vao gia tri cua phan tu %d ",i );
            c=sc.nextInt();
            arrList.add(c);
        }
        System.out.println("danh sach ban dau:");
        HienThi(arrList);
        arrList.sort((o1,o2)->o2-o1);
        System.out.println("danh sach sau sap xep giam dan");
        HienThi(arrList);
        int max,min;
        max=arrList.get(0);
        min=arrList.size()-1;
        
                System.out.print("gia tri lon nhat la: "+max+" gia tri nho nhat la:"+min);
 }
 public static void HienThi(ArrayList<Integer> A) {
     for(int i=0;i<A.size();i++) {
         System.out.print(A.get(i)+"\t");
     }
 }
}