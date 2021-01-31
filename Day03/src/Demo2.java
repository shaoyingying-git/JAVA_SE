/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:49
 */
public class Demo2 {
    public static void main(String[] args){
        // Java中, 使用整数类型, 更方便
        // 纸的厚度
        int zhi = 1; // mm * 100
        // 珠峰的高度
        int zhu = 884400000;
        // 定义计数器, 用来记录折纸的次数
        int count = 0;

        while (zhi < zhu) {
            // 折纸
            zhi = zhi * 2; // zhi *= 2
            // 计数器自增
            count++;
        }

        System.out.println("折纸之后, 纸的厚度为: " + (zhi / 100000) + "米");
        System.out.println("共折纸" + count + "次");
    }
}
