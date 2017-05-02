package cn.com.taotao.test;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class DemoTest2{


	
	@Test
	public void demo1(){
		
		TreeSet<?> set=new TreeSet<DemoTest1>(new Comparator<DemoTest1>() {

			@Override
			public int compare(DemoTest1 o1, DemoTest1 o2) {
				
				int num=o1.getAge()-o2.getAge();
				
				return num==0?o1.getName().compareTo(o2.getName()):num;
			}
			
		});
		 
		
	}
  

}
