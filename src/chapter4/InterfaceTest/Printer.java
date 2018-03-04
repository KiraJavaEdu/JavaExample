package chapter4.InterfaceTest;

// 让Printer类实现Output和Product接口
public class Printer implements Output , Product {
	private String[] printData = new String[MAX_CACHE_LINE];
	// 用以记录当前需打印的作业数
	private int dataNum = 0;
	public void out() {
		// 只要还有作业，继续打印
		while(dataNum > 0) {
			System.out.println("打印机打印：" + printData[0]);
			// 把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData , 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			// 把打印数据添加到队列里，已保存数据的数量加1。
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime() {
		return 45;
	}
}
