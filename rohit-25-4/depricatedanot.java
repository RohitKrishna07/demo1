
class employee {
	void e1()
	{
		System.out.println("This is an employee e1");
	}
	@Deprecated  
	void e2()
	{
		System.out.println("This is an employee e2");
	}
	
}

public class depricatedanot {
	public static void main(String[] args)
	{
		employee e=new employee();
		e.e2();
	}

}
