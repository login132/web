package cn.com.taotao.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class DemoTest3 {
	
	@Test
	public void demo1() throws IOException{
		Map<String, Double> map = new HashMap<>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
		map.put("茄子", 2.0);
		map.put("黄瓜", 2.5);
		map.put("西红柿", 5.0);
		map.put("土豆", 3.0);
		map.put("豆角", 3.5);
		map.put("黄瓜", (map.get("黄瓜") + 1));
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个蔬菜名字：");
		String str = sc.nextLine();
		boolean flag = false; // 标记变量
		for (String string : map.keySet()) {
			if (str.equals(string)) {
				System.out.println(map.get(string));
				flag = true;
			}

			double value = map.get(string);
			if (value > 3) {
				bw.write(String.valueOf(value));
				bw.newLine();
			}

		}
		bw.close();
		if (!flag) {
			System.out.println(!flag);
			System.out.println("己经卖完了！，等下下再来吧！");
		}

	}
	
}
































