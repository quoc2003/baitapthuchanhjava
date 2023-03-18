import java.util.Scanner;

public class slide74 {
    private static int i;

    public static void main(String[] args) {
        int langth;
        int arrA[];
        Scanner sc = new Scanner(System.in);
        int length;
        do{
            System.out.print("Nhap chieu dai cua mang : ");
            length = sc.nextInt();        
         }while(length <= 0);
         arrA = new int[length];
         for(int i = 0; i< length;i++){
            System.out.printf("A[%d] = ", i);
            arrA[i] = sc.nextInt();

         }
         sc.close();
         int sun = 0;
         for (int i = 0; i< length; i++ );{
            if(arrA[i] % 2 ==0 ) {
                sun +=arrA[i];
            }
         }
         System.out.print(sun);
    }

    
}
