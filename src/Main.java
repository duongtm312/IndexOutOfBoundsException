import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
            break;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }}
    }
}
