/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:39
 */
public class Demo1 {
    public static void main(String[] args){
        // 求1+2+3+...+100的和为多少?

        // 创建一个变量用来, 记录和
        int sum = 0;
        // 让for循环中i的值, 是 1  ~  100
        for (int i = 1; i <= 100; i++) {
            sum = sum + i; // 等效于  sum += i;
        }

        System.out.println(sum);
    }
}
