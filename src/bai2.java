import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình trên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so nguyen b: ");
        int b= sc.nextInt();
        System.out.println("Nhap vao so nguyen c: ");
        int c = sc.nextInt();
        if (a==0){
            if (b==0 && c==0){
                System.out.println("Phuong trinh co vo so nghiem");
            } else if (b==0 && c!=0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else{
                System.out.println("Phuong trinh co nghiem la:"+ -b/c);
            }
        }
        else{
            double delta = ((b^2)-(4*a*c));
            if (delta <0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta==0) {
                System.out.println("Phuong trinh co nghiem kep la: "+ (-b/(2*a)));
            }
            else {
                double x1 = ((-b+ Math.sqrt(delta))/2*a);
                double x2 = ((-b- Math.sqrt(delta))/2*a);
                System.out.println("Phuong trinh co 2 nghiem la: ");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = "+ x2);
            }
        }
    }
}
