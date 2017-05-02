package cn.com.taotao.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy {
	
	@Test
	public void demo1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		//1.首先创建内存中的动态的类Enhancer
		Enhancer hancer=new Enhancer();
		
		hancer.setSuperclass(EhcanerDemo.class);
		
		Callback callback=new MethodInterceptor() {
			
			@Override
			public Object intercept(Object obj, Method method, Object[] objs, MethodProxy methodProxy) throws Throwable {
				
			Object object=methodProxy.invokeSuper(obj, objs);
			
				return object;
			}
		};
		
		hancer.setCallback(callback);
		
	    Object ject=hancer.create();
	    
	    
	     Type type=ject.getClass().getGenericSuperclass();
	   
	    Class clazz=(Class) type;
	    
	   //EhcanerDemo demo=(EhcanerDemo) clazz.newInstance();
	   
	
	   //demo.demo2();
	  
	     System.out.println();
	    
		
	}

}































