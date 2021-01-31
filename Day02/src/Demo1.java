/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:19
 */
public class Demo1 {
    public static void main(String[] args){

/*
            将大的数据, 赋值给小的数据类型

            常量优化机制: 如果等号右边是常量, 在给左边赋值时, 会先判断这个常量
                          是否在左边数据类型的取值范围内, 如果在就不会报错;
                          如果不在取值范围内, 就会报错.
*/

        byte b = 100; // 将int类型的100, 转换成byte类型
        System.out.println(b);
    }
}
