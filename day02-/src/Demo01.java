import com.sun.xml.internal.ws.wsdl.writer.document.Import;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int score = sc.nextInt();
        switch (score){
            case 1 :
                System.out.println('优');
                break;
            case 2 :
                System.out.println("良");
                break;
            case 3 :
                System.out.println("中");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
