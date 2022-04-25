
class employee {
	void Display()
	{
		System.out.println("This is an employee class");
	}
}
class dept extends employee
{
	@Override  
	void display()
	{
		System.out.println("This is an employee");
	}
}
class overrideanot
{
	public static void main(String[] args)
	
	{
		dept d= new dept();
		d.Display();
	}
}