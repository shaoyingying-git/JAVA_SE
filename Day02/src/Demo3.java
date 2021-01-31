/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:20
 */
public class Demo3 {
    public static void main(String[] args){
      /*
            大的数据和小的数据参与运算, 会先将小的数据转换成大的数据类型,
            然后再参与运算

            特殊情况:
                (byte, short, char) -> int -> long -> float -> double
*/
        int a1 = 10;
        double d1 = 20; // 20.0
        double sum = a1 + d1;
        System.out.println(sum);

        byte b2 = 10;
        byte b3 = 20;
// byte sum2 = b2 + b3; // 两个byte类型参与运算, 会转换成int    会报错
// System.out.println(sum2);
    }
}
