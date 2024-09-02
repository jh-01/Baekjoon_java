public class bj_2588 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        
        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 / 10) % 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);
        
    }
}
