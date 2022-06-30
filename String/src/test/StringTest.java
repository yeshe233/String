package test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * s1.length() 获取字符串的长度
 * 2、s1.charAt() 获取字符串中指定索引的字符
 * 3、s1.isEmpty() 判断字符串是否为空
 * 4、s1.toLowerCase() 将字符串中所有大写字母转换为小写
 * 5、s1.toUpperCase() 将字符串中所有小写字母转换为大写
 * 6、s1.trim() 返回删除字符串中前后空格后新的字符串
 * 7、s1.equals() 判断两个字符串是否相等
 * 8、s1.equalsIgnoreCase() 忽略大小写的情况下判断两个字符串是否相等
 * 9、s1.concat() 做字符串的拼接，相当于 ”+“
 * 10、s1.substring() 从指定索引处开始截取字符串，直到末尾
 * 11、s1.substring(index1, index2) 采用 包含索引1，不包含索引2 形式的截取字符串
 * 12、s1.endsWith() 判断字符串是否以指定的后缀结束
 * 13、s1.startsWith() 判断字符串是否以指定的前缀开始
 * 14、s1.contains() 当且仅当此字符串包含指定的char值序列时，返回true
 * 15、s1.indexOf() 返回指定子字符串在此字符串中第一次出现处的索引，未找到返回 -1
 * 16、s1.lastIndexOf() 返回指定子字符串在此字符串中最右边出现处的索引，未找到返回 -1
 * 17、s1.replace(char oldChar, char newChar) 返回一个经过替换后新的字符串
 * 18、s1.matches(String regex) 判断此字符串是否匹配给定的正则表达式
 */

public class StringTest {

    public static void main(String[] args) {
     String s1="JAVAEE";
    String s2="JAVAEE";
    String s3=new String("JAVAEE");
    String s4=new String("JAVAEE");
        System.out.println(s1==s2);
        System.out.println(s2.equals(s3));
        System.out.println(s3==s4);
    }
    @Test
    public void test(){
        String s1=" hello Word ";
        System.out.println("字符串长度"+s1.length());
        System.out.println("字符串中第四个字符是"+s1.charAt(4));
        System.out.println("字符串是否为空"+s1.isEmpty());
        System.out.println("小写字母转化为大写字母"+s1.toUpperCase());
        System.out.println("大写字母转化为小写字母"+s1.toLowerCase());
        System.out.println("删除字符串前后空格"+s1.trim());

    }
    @Test
    public void test2(){
        String s2 = "helloWorld";
        String s3 = "HelloWorlD";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
          String s4="abc";
        System.out.println(s4.concat("efg"));//字符串拼接

    }
    @Test
    public void test3(){
        String s1 = "helloWorld";
        System.out.println(s1.substring(5));//截取元素
        System.out.println(s1.substring(1,3));
    }
    @Test
    public void test4(){
         String s1="WoAi ni China";
        System.out.println(s1.endsWith("ina"));//判断是否为指定的后缀结束
        System.out.println(s1.startsWith("WO"));//前缀有大小写限制
        System.out.println(s1.contains("China"));//
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.indexOf("i",4));
    }
    @Test
    public void test5() {
        String s1 = "Wo shi yi ge coder, I love my hometown";
        System.out.println(s1.replace("wo","I;s"));//替换字符串
        System.out.println(s1);
    }
    @Test
    public void  test6(){
        String S1="123";
        int i = Integer.parseInt(S1);
        System.out.println(i);
       String valueOf = String.valueOf(i);
        System.out.println(valueOf);
    }
    @Test
    public void test7(){
        String s1 = "Hello，中国";
       // byte[] bytes = s1.getBytes();
        char[] chars = s1.toCharArray();
        for (char ch : chars){
            System.out.print(ch);
        }
        char [] chars1=new char[]{'h','l','l'};
         String s = new String(chars1);
        System.out.println(s);
    }
    @Test
    public void test8() throws UnsupportedEncodingException {

    String s1 = "Hello，中国";
    byte[] bytes = s1.getBytes();    //使用默认的字符集编码
        System.out.println(Arrays.toString(bytes));
     byte[] bytes1 = s1.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
        String s4 = new String(bytes1, "GBK");
         String s = new String(bytes1);
        System.out.println(s);
        System.out.println(s4);
    }
    @Test
    public void test9(){
        StringBuffer stringBuffer = new StringBuffer("hello word ");
        StringBuffer eee = stringBuffer.append("eee");
        System.out.println(eee);
         StringBuffer delete = stringBuffer.delete(1, 3);
        System.out.println(delete);
      StringBuffer replace = stringBuffer.replace(1, 4, "eee");
        System.out.println(replace);
        System.out.println(stringBuffer.reverse());

    }
}
