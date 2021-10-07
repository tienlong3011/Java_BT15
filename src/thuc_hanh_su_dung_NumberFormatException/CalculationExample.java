package thuc_hanh_su_dung_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số X: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập số Y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }

    public void calculate(int x , int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng X + Y = " + a);
            System.out.println("Hiệu X - Y = " + b);
            System.out.println("Tích X * Y = " + c);
            System.out.println("Hiệu X / Y = " + d);
        }
        catch (Exception e){
            System.out.println("Xảy ra lỗi" + e.getMessage());
        }
    }
}
