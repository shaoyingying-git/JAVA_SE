/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:32
 */
public class Dmeo8 {
    public static void main(String[] args) {
        short s1 = 10;

        s1 += 10; // ①  +=号的内部, 做一个强转  等效于:  s1 = (short) (s1 + 10);

        // s1 = s1 + 10; // ②  有损失

        System.out.println(s1);


    }
}
