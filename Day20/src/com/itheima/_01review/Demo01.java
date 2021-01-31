package com.itheima._01review;

import java.io.File;

/*
    File
        相对路径和绝对路径

        构造方法
            File(String)
            File(String parent, String child)
            File(File parent, String child)

        获取功能
            getAbsolutePath()
            getPath() : 构造中的路径
            getName()
            length()

         判断功能
            exists()
            isFile()
            isDirectory()

         创建功能
            createNewFile()
            mkdir()
            mkdirs()

         删除功能
            delete()

         遍历文件夹
            String[] list()
            File[] listFiles()



    递归
        方法本身调用了方法自己

        注意:
            1. 必须有出口
            2. 就算有出口,次数不能过多


       public static int fun(int n) {

            if (n == 1) {
                return 1;
            }

            return n * fun(n - 1);
       }

 */
public class Demo01 {
    public static void main(String[] args) {
        deleteDirectory(new File("d:\\java"));
    }

    /**
     * 此方法用于删除文件夹
     */
    public static void deleteDirectory(File file) {
        // 获取file中所有文件和文件夹
        File[] subFiles = file.listFiles();
        // 遍历数组, 获取每一个文件和文件夹
        for (File subFile : subFiles) {
            // 判断如果是文件, 就直接删除
            if (subFile.isFile()) {
                subFile.delete();
            } else {
                // 如果是文件夹, 就删除这个文件夹 递归调用
                deleteDirectory(subFile);
            }
        }
        // 删除最外层空文件夹
        file.delete();
    }

}
