/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:21
 */
public class Demo4 {
    public static void main(String[] args){

// (要强转到的数据类型) 数据
        int a = 130;
// byte b = a; // 会有损失
        byte b = (byte) a;
        System.out.println(b); // -126


// 1. 对小数的强转
        double d = 12.9;
        int a2 = (int) d; // 去掉小数点后面的内容
        System.out.println(a2);

        System.out.println("~~~~~~~~~~~~~~~~~~");

// 2. 对字符类型的强转
// char: 取值范围(0 ~ 65535)
        char c1 = 'a';
        System.out.println(c1);
        int c2 = 100;
        System.out.println((char) c2);

        char c3 = '泽';
        System.out.println((int) c3); // 想查看汉字字符对应的数字是多少
        System.out.println(c3 + 0);
    }
}
