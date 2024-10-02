import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//        trên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so nguyen b: ");
        int b = sc.nextInt();
        if (a== 0 && b==0){
            System.out.println("Phuong trinh co vo so nghiem!");
        } else if (a==0 && b !=0 ) {
            System.out.println("Phuong trinh vo nghiem!");
        }
        else {
            int x = -b/a;
            System.out.println("Nghiem cua phuong trinh "+a+"x +"+b+" la: "+ x);
        }
    }
}
