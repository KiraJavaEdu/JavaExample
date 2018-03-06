package chapter5;

import java.util.ArrayList;
import java.util.List;

public class WhatIsStream {

	public static void main(String[] args) {
//		filterWithForLoop();
//
//		filterWithStreamAPI();
		
		filterWithParallelStreamAPI();
	}

	// 传统的使用for循环的编程方式
	static void filterWithForLoop() {
		int count = 0;
		List<Student> students = Student.getStudents();
		for (Student stu : students) {
			if (stu.getFrom().equals("北京"))
				count++;
		}
		System.out.println("来自于北京有学生有：" + count + "名");

	}

	// 使用Stream API的编程方式
	static void filterWithStreamAPI() {
		long count = Student.getStudents()
			.stream()
			.filter(stu -> stu.getFrom().equals("北京"))
			.count();
		System.out.println("来自于北京有学生有：" + count + "名");
	}

	// 使用Stream API的并行编程方式
	static void filterWithParallelStreamAPI() {
		System.out.println("线程："+Thread.currentThread().getId()
				+"启动处理工作");
		long count = Student
				.getStudents()
				.parallelStream()
				.peek(stu -> {
					System.out.println("线程" + Thread.currentThread().getId()
							+ "正在处理" + stu);
				}).filter(stu -> stu.getFrom().equals("北京")).count();
		System.out.println("线程："+Thread.currentThread().getId()+
				"显示处理结果：来自于北京有学生有" + count + "名");
	}
}

class Student {
	private String name = "";
	private String from = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Student(String name, String from) {
		this.name = name;
		this.from = from;
	}

	@Override
	public String toString() {

		return "("+ name + "," + from+")";
	}

	static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("张三", "北京"));
		students.add(new Student("李四", "上海"));
		students.add(new Student("王五", "北京"));
		students.add(new Student("赵六", "重庆"));
		students.add(new Student("韩七", "南京"));
		students.add(new Student("张八", "上海"));
		students.add(new Student("赵九", "北京"));
		students.add(new Student("朱十", "上海"));
		return students;
	}
}
