/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:27
 */
public class Demo5 {
    public static void main(String[] args){
        // 字符串通过"+"和任意类型连接, 都会将它们拼接起来, 并产生一个新的字符串

        int a = 10;
        int b = 20;
        // 操作a和b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("5 + 5 = " + 5 + 5); // "5 + 5 = 55"
        System.out.println("5 + 5 = " + (5 + 5)); // "5 + 5 = 10"
    }
}
