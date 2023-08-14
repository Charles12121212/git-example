public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(!(a > b));
        int x = true ? 1:2 ;
        System.out.println(x);
        int cha = a > b ? a- b:b-a;
        System.out.println(cha);
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a > b ? a > c ? a : c : b > c ? b : c);
        
    }
}
