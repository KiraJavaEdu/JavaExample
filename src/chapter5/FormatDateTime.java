package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDateTime {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		DateTimeFormatter dt=DateTimeFormatter.ISO_DATE;
		//输出样例：2018-02-19
		System.out.println(dt.format(currentDate));
		
		LocalTime currentTime=LocalTime.now();
		DateTimeFormatter tf=DateTimeFormatter.ISO_TIME;
		//输出样例：00:16:24.569061
		System.out.println(tf.format(currentTime));
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ISO_DATE_TIME;
		//输出样例：2018-02-19T00:16:24.571106
		System.out.println(dtf.format(currentDateTime));
		
		DateTimeFormatter f_long=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		//输出样例：2018年2月19日
		System.out.println(f_long.format(currentDateTime));
		
		DateTimeFormatter f_short=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//输出样例：2018/2/19
		System.out.println(f_short.format(currentDateTime));
		
		//使用特定文化的格式化
		String fr_short=f_short.withLocale(Locale.ENGLISH).format(currentDateTime);
		String fr_long=f_long.withLocale(Locale.ENGLISH).format(currentDateTime);
		//输出样例：2/19/18
		System.out.println(fr_short);
		//输出样例：February 19, 2018
		System.out.println(fr_long);
		
		//自定义日期输出格式
		DateTimeFormatterBuilder b=new DateTimeFormatterBuilder()
		.appendValue(ChronoField.MONTH_OF_YEAR)
		.appendLiteral("||")
		.appendValue(ChronoField.DAY_OF_MONTH)
		.appendLiteral("||")
		.appendValue(ChronoField.YEAR);
		//输出样例：2||19||2018
		DateTimeFormatter f=b.toFormatter();
		System.out.println(f.format(currentDateTime));
		
	}

}
