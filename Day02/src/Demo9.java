/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:34
 */
public class Demo9 {
    public static void main(String[] args){
        short s1 = 10;
        short s2 = 20;

//         short sum = s1 + s2;// ①  将int类型的变量, 赋值给short类型, 有问题
        short sum = 10 + 20; // ② 将int类型的常量, 赋值给short类型,
        // 没问题, 因为有常量优化机制

        System.out.println(sum);
    }
}
