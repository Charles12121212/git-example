import java.util.Scanner;
public class Demo06 {
    public static void main(String[] args) {
        // 创建scanner对象
        Scanner sc = new Scanner(System.in);
        //调用输入数据的方法
        System.out.println("请输入身高1:");
        int h1 = sc.nextInt();

        System.out.println("请输入身高2:");
        int h2 = sc.nextInt();

        System.out.println("请输入身高3:");
        int h3 = sc.nextInt();

        //输出结果
        System.out.println(h1 > h2 ? h1> h3 ? h1 : h3 :h2> h3 ? h2 : h3);
    }

}
