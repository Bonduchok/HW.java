

import java.util.Scanner;

public class program_one {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        while (flag == false) {
            System.out.printf("Вы ввели неправильное число, попробуйте еще раз, а = ");
            String z1 = iScanner.nextLine();
            boolean flag2 = iScanner.hasNextInt();
            flag = flag2;
        }
        int x = iScanner.nextInt();
        System.out.printf("int b: ");
        boolean flag_two = iScanner.hasNextInt();
        while (flag_two == false) {
            System.out.printf("Вы ввели неправильное число, попробуйте еще раз, b = ");
            String z2 = iScanner.nextLine();
            boolean flag3 = iScanner.hasNextInt();
            flag_two = flag3;
        }
        int y = iScanner.nextInt();
        if (x == 0 & y == 0) {
            System.out.println("Не определено!");
        } 
        else {
            double z = Math.pow(x, y);
            System.out.println(z);
        }
        iScanner.close();
    }
}