package chapter5;

public class StringBufferCompare {
    public static void main(String[] args){
        String toappend = "abcdefghijklmnopqrstuvwxyz";//26个字母，用于每次添加
        int times = 20000;//添加20000次
        //使用String类，将26个字母添加20000次
        long start = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i < times; i++){
            str += toappend;
        }
        long end = System.currentTimeMillis();
        System.out.println("String time = " + (end-start)+" ms");

        //使用StringBuffer类，将26个字母添加20000次
        start = System.currentTimeMillis();
        StringBuffer strbuf = new StringBuffer();
        for(int i = 0; i < times; i++){
            strbuf.append(toappend);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time = " + (end-start)+" ms");
    }
}
