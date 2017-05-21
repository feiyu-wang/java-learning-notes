/* 
 String类适用于描述字符串事物。 
 那么它就提供了多个方法对字符串进行操作。 
  
 常用的方法如下： 
  
 1、获取： 
    1.1 字符串中包含的字符数，也就是字符串的长度。 
        int length():获取长度。 
    1.2 根据位置获取该位置上的某个字符。 
        char charAt(int index):返回指定索引处的char值。 
    1.3 根据字符获取该字符在字符串的位置。 
        int indexOf(String str):返回的是str在字符串中第一次出现的位置。 
        int indexOf(int ch,int fromIndex):从fromIndex指定位置开始，获取ch在字符串中出现的位置。 
        int lastIndexOf(int ch):反向索引一个字符出现的位置 
  
 2、判断： 
    2.1  字符串中是否包含某一个子串。 
        boolean contains(str); 
        特殊之处：indexOf(str):可以索引str第一次出现的位置，如果返回-1表示该str不在字符串中存在。 
                  所以，也可以用于对指定判断是否包含。 
                 if(str.indexOf("aa")!=-1)   
                  而且该方法既可以判断，又可以获取出现的位置 
    2.2 字符中是否有内容。 
        boolean isEmpty():原理就是判断长度是否为0. 
    2.3 字符串是否是以指定内容开头。 
        boolean startsWith(str); 
    2.4 字符串是否是以指定内容结尾。 
        boolean endsWith(str); 
    2.5判断字符串内容是否相同。复写Object类中的equals方法。 
        boolean equals(str); 
    2.6 判断内容是否相同，并忽略大小写 
        boolean equalsIgnoreCase(); 
         
 3、转换 
    3.1 将字符数组转换成字符串。 
        构造函数： String(char[]) 
                  String(char[],offset,count):将字符数组中的一部分转换成字符串。 
        静态方法： 
                 static String copyValueOf(char[]); 
                 static String copyvalueOf(char[] data, int offset, int count); 
    3.2 将字符串转换成字符数组（重点）。 
                char[] toCharArray(); 
    3.3 将字节数组转换成字符串。 
                 String(byte[]) 
                 String(byte[],offset,count):将字节数组中的一部分转换成字符串。 
    3.4 将字符串转换成字节数组 
    3.5 将基本数据类型转换成字符串。 
        String valueOf(int); 
        String valueOf(double); 
         
        特殊：字符串和字节数组在转换过程中是可以指定编码表的。 
         
 4、替换 
        String replace(oldchar,newchar); 
 5、切割 
        String[] split(regex); 
 6、子串            获取字符串中的一部分 
        String substring(begin); 
        String substring(begin,end); 
 7、转换，去除空格，比较 
    7.1 将字符串转成大写或者小写。 
        String toUpperCase(); 
        String toLowerCase(); 
    7.2 将字符串两端的多个空格去除。 
        String trim(); 
    7.3 将两个字符串进行自然顺序的比较。 
 */  
  
public class StringDemo1 {   
    //转换，去除空格，比较  
    public static void method_7(){  
        String s="Hello Java";  
        sop("原字符串为："+s);  
        sop(s.toUpperCase());  
        sop(s.toLowerCase());  
        sop(s.trim());  
          
        String s1="acc";  
        String s2="aaa";  
        sop(s1.compareTo(s2));  
    }  
    //子串         获取字符串中的一部分  
    public static void method_sub(){  
        String s="abcdefghijklmnopqrstuvwxyz";  
        sop("原字符串为");  
        sop(s);  
        String s1=s.substring(9); //从指定位置到结尾。如果角标不存在，则会出现字符串角标越界异常。  
        sop("获取的子串s1为：");  
        sop(s1);  
        String s2=s.substring(7,20); //包含头，不包含尾。 获取整个字符串：s.substring(0,s.length());  
        sop("获取的子串s2为：");  
        sop(s2);  
    }  
    //切割  
    public static void method_split(){  
        String s="zhangsan,lisi,wangwu";  
        String[] arr=s.split("a");  
        sop("原字符串为：");  
        sop(s);  
        sop("切割后的字符串为：");  
        for(int x=0;x<arr.length;x++)  
        {  
            System.out.print(arr[x]+" ");  
        }  
        System.out.println();  
    }  
    //判断  
    public static void method_is(){  
        String str="ArrayDemo.java";  
        String str1="arraydemo.java";  
        //判断文件名称是否以Array开头  
        sop(str.startsWith("Array"));  
        //判断文件名称是否是以.java结尾  
        sop(str.endsWith(".java"));  
        //判断文件名称中是否包含Demo  
        sop(str.contains("Demo"));  
        //判断两个文件名是否相同（区分大小写）  
        sop(str.equals(str1));  
        //判断两个文件名是否相同（不区分大小写）  
        sop(str.equalsIgnoreCase(str1));  
    }  
    //获取  
    public static void method_get(){  
        String str="abcdeakpf";  
        sop("字符串为："+str);  
        //长度  
        sop("字符串的长度为："+str.length());  
        //根据索引获取字符  
        sop("角标为四的位置上的字符为："+str.charAt(4));//当访问到字符串中不存在的角标时，会发生 StringIndexOutOfBoundsException异常  
        //根据字符获取索引  
        sop("从角标为3的位置开始往后索引 a 出现的位置为："+str.indexOf('a',3));//如果没有找到返回-1  
        //反向索引一个字符出现的位置  
        sop("从字符串右面开始索引第一个a出现的位置为："+str.lastIndexOf("a"));  
    }  
    //转换  
    public static void method_trans(){  
        char[] arr={'a','b','c','d','e','f','g','h'};  
        String str="jkasdhavsgjv";  
        char[] a=str.toCharArray();  
        //字符串操作  
        System.out.print("将字符串转换为字符数组为：[");  
        for(int x=0;x<a.length;x++)  
        {  
            if(x<a.length-1)  
                System.out.print(a[x]+",");  
            else  
                System.out.print("]");  
        }  
        System.out.println();  
        //字符数组操作  
        System.out.print("字符数组为：[");  
        for(int x=0;x<arr.length;x++)  
        {  
            if(x<arr.length-1)  
                System.out.print(arr[x]+",");  
            else  
                System.out.print("]");  
        }  
        System.out.println();  
        String s=new String(arr);  
        sop("转换成字符串为："+s);  
        //获取从角标为1的位置的字符开始三个字符  
        String s1=new String(arr,1,3);  
        sop("从角标为1的位置的字符开始三个字符组成的字符串为："+s1);  
    }  
    //替换  
    public static void method_replace(){  
          
        String s="      hello java     ";  
          
        String s1=s.replace('a', 'n'); //如果要替换的字符不存在，则返回的还是原字符串  
          
        sop("原来的字符串为："+s);  
          
        sop("替换字符后的字符串为："+s1);  
          
    }  
    //主函数  
    public static void main(String[] args) {  
        method_get();  
        method_is();  
        method_trans();  
        method_replace();  
        method_split();  
        method_sub();  
        method_7();  
    }  
    public static void sop(Object obj){  
        System.out.println(obj);  