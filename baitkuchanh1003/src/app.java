import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        int length;
        int arrA[];
        Scanner sc = new Scanner(System.in);
       do {
           System.out.print("Nhap do dai mang : ");
           length = sc.nextInt();
       }
       while(length <= 0);
      arrA = new int[length];
       for(int i = 0; i < length ; i++ ){
           System.out.printf("A[%d] = ", i);
           arrA[i] = sc.nextInt();
       }
       int tg;
       for(int i = 0;i<length -1; i++){
          for(int j =  i + 1; j < length;  j++) {
           if(arrA[i] > arrA[j] ) {
               tg = arrA[i];
               arrA[i] = arrA[j];
               arrA[j] =tg;
           }

          }
       }
       for(int i = 0; i < length; i++){
           System.out.print(arrA[i] + " ");
       }
       sc.close();
   }

    
}
