/**
 * @author Chen Shaoying
 * @date 2020-10-15 17:36
 */
public class Demo10 {
    public static void main(String[] args){

        // 调用格式: 要调用同一个类中的方法, 只需要写 : 方法名();
        eat();
    }

    // 定义格式
        /*
        修饰符 返回值类型 方法名(参数列表) {
            方法体;
            return;
        }

        修饰符: public static
        返回值类型: void
        方法名: 合法的标识符, 尽量见名知意
        参数列表: ()
        {}: 方法体, 功能的实现方式
        return : 不写

        */
    public static void eat() {
        System.out.println("要下课吃饭啦!~");
    }

}
