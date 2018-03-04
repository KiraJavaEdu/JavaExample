package chapter7;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class ReadLargeFile {
	public static void main(String[] args) {
		try(
			// 创建文件输入流
			FileInputStream fis = new FileInputStream("src/chapter7/ReadLargeFile.java");
			// 创建一个FileChannel
			FileChannel fcin = fis.getChannel())
		{
			// 定义一个ByteBuffer对象，用于重复取水
			ByteBuffer bbuff = ByteBuffer.allocate(256);
			// 将FileChannel中数据放入ByteBuffer中
			while( fcin.read(bbuff) != -1 )
			{
				// 锁定Buffer的空白区
				bbuff.flip();
				// 创建Charset对象
				Charset charset = Charset.forName("utf8");
				// 创建解码器(CharsetDecoder)对象
				CharsetDecoder decoder = charset.newDecoder();
				// 将ByteBuffer的内容转码
				CharBuffer cbuff = decoder.decode(bbuff);
				System.out.print(cbuff);
				// 将Buffer初始化，为下一次读取数据做准备
				bbuff.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
