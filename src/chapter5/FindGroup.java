package chapter5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        // 使用字符串模拟从网络上得到的网页源码
        String str = "我想求购一台IphoneX,请联系我13500006666"
                + "交个朋友，电话号码是13611125565"
                + "出售二手笔记本电脑，联系方式15899903312";
        // 创建一个Pattern对象，并用它建立一个Matcher对象
        // 该正则表达式只抓取13X和15X段的手机号码
        Matcher m = Pattern.compile("((13)|(15))\\d{9}")
                .matcher(str);
        // 将多有符合正则表达式的子串（电话号码）全部输出
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
