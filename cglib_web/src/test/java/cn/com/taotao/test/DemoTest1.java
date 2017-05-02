package cn.com.taotao.test;

import org.junit.Test;

public class DemoTest1 implements Comparable<DemoTest1>{
	
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int compareTo(DemoTest1 d) {
	int num=this.age-d.age;
		return num==0?this.name.compareTo(d.name):num;
	}
    
    
    

}
