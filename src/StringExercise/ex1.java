package StringExercise;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import javax.print.DocFlavor;
import java.util.SortedMap;

/**
 * 汉字截半的话对应字节的ASC码为小于0的数值
 */
public class ex1 {
    public static void main(String[] args) {
//        String s = "我qwe11";
//
//        byte[] b = "s".getBytes();
//
//        A(s,4);
        System.out.println(3/2);
        int x = 123;
        isPalindrome(x);
    }

    public  static void A(String str,int i){
        byte b[] = new byte[1024];
        int num = 0;
        b = str.getBytes();

        if(b[i-1] >0){
            System.out.println(b[i-1]);
            System.out.println(new String(b,0,i));
        }else{
            for(int j=0;j<i;j++){
                if (b[j]<0){
                    num++;
                    num = num % 2;

                }else {
                    num = 0;
                }
            }

            if (num == 0){
                System.out.println(new String(b,0,i));
            }else {
                System.out.println(new String(b,0,i-1));
            }
        }
    }

    public  static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        if (x == 0){
            return true;
        }
        int length = 1;
        //判断x最高位为多少位
        while (x/length >= 10){
            length = length*10;
        }
        while (x > 0){
            int left = x/length;
            int right = x % 10;
            if(left != right){
                System.out.println("不是回数");
                return false;
            }else {
                x = (x % length)/10;
                length = length/100;
            }

        }
        System.out.println("是回数");
        return true;
    }
}
