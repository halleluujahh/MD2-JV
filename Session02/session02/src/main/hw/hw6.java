package main.hw;

public class hw6 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên từ 1-100: ");
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (count == 20) {
                break;
            } else if (i == 2 || i == 3) {
                System.out.printf("%d\t", i);
                count++;
            } else if (i < 1 || i % 2 == 0 || i % 3 == 0) {
                continue;
            } else {
                System.out.printf("%d\t", i);
                count++;
            }
        }
    }
}
