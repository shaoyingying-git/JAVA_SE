/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:30
 */
public class Demo6 {
    public static void main(String[] args){
        System.out.println(true && true);	// true
        System.out.println(true && false);	// false
        System.out.println(false && true);	// false
        System.out.println(false && false);	// false
        // 只要第一个是false, 不需要看第二个, 就已经能够确定最后的结果了
        // 所以, 只要第一个是false, 第二个就不会运行了


        System.out.println("~~~~~~~~~~~~~~~");

        System.out.println(true || true);	// true
        System.out.println(true || false);	// true
        System.out.println(false || true);	// true
        System.out.println(false || false); // false

        System.out.println("~~~~~~~~~~~~~~~");
        // !
        System.out.println(!true);	// false
        System.out.println(!false); // true
    }
}
