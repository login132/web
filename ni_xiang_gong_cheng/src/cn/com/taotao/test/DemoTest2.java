package cn.com.taotao.test;

import org.junit.Test;

public class DemoTest2 {
	
	@Test
	public void demo1(){
		
		int[] arr={-1,30,28,10,20};
		
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				
				
			if(arr[j]<arr[j+1]){
					int temp=arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=temp;
					
				}
				
				
			}
			
		}
		
		for(int x=0;x<=arr.length-1;x++){
			
			System.out.println(arr[x]);
			
		}
		
		
	}
	
	@Test
	public void demo2(){
		
		int [] arr={-1,30,28,10,20};
		
		for(int i=0;i<arr.length-1;i++){
			 
			 for(int j=0;j<arr.length-1-i;j++){
				 
				  if(arr[j]>arr[j+1]){
                      
					  int temp=arr[j+1];
					  arr[j+1]=arr[j];
					  arr[j]=temp;
					  
				  }
				 
			 }
		}
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}

	private DemoTest2() {
	   }
   private static DemoTest1 demo1;
   public static DemoTest1 getDemo1Test(){
	   if(demo1 == null){
		   synchronized(DemoTest1.class) {
			   if(demo1 == null){
				   demo1=new DemoTest1();
			    }
		    }
	   }
	   return demo1;
      }
}
































