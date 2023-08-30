import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите пример (все числа должны быть разделены пробелами):");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        String[] array2 = x.split(" ");
        int dl = array2.length;
        if (dl != 3){
            throw new IOException("throws Exception (Недопустимое количество операндов)");
        }
        int a = Integer.parseInt(array2[0]);
        String ope = array2[1];
        int b = Integer.parseInt(array2[2]);
        int c = 0;
        if (a>10 || b>10 || a<1 || b<1) {
            throw new IOException("throws Exception (Недопустимый формат чисел)");
        }
        switch (ope) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "/":
                c = a / b;
                break;
            case "*":
                c = a * b;
                break;
            default:
                throw new IOException("throws Exception (Недопустимая операция)");
        }
        System.out.println(c);
    }
}