import java.util.Arrays;

public class varient {
    public static void main (String[] args){

        int data[] = new int[3]; /*开辟了一个长度为3的数组*/
        data[0] = 10; // 第一个元素

        System.out.println(data);//
        System.out.println(Arrays.toString(data));//

        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());//当前行
    }
}
