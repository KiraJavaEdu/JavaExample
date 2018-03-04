package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAndTimes {
	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);  //2018-02-19
		//重要，月份是从1开始的了！！！
		LocalDate specificDate=LocalDate.of(2000, 1, 1);
		System.out.println(specificDate);  //2000-01-01

		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);  //00:08:43.167667
		LocalTime specificTime=LocalTime.of(14, 10,12);
		System.out.println(specificTime);  //14:10:12

		LocalDateTime currentDT=LocalDateTime.now();
		//输出ISO格式的日期时间：2018-02-19T00:08:43.167827
		System.out.println(currentDT);
		LocalDateTime specificDT=LocalDateTime.of(specificDate, specificTime);
		System.out.println(specificDT); //2000-01-01T14:10:12
	}
	

}
