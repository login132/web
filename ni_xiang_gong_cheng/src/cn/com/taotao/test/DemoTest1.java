package cn.com.taotao.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class DemoTest1 {

	 static  String string=new String();
	 @Test
	 public void demo1() throws Exception, XMLParserException{
		 
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("config/sqlConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
		 
	 }
	 
	 @Test
	 public void demo2(){
		
		  
		 
	 }
}


















