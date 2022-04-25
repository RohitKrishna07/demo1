import java.util.*;  
class suppressanot{  
	@SuppressWarnings("uncheked")  
	public static void main(String args[]){  
		ArrayList list=new ArrayList();  
		list.add("rohit");  
		for(Object obj:list)  
			System.out.println(obj);  

	}}