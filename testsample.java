import java.util.ArrayList;
import java.util.Iterator;

interface name{
	void display();
}
class test implements name{
	public void display() {
		System.out.println("list of names are:");
	}
	
}
public class testsample {
	public static void main(String[] args)
	{
		ArrayList<String> l1= new ArrayList<String>();
		l1.add("rohit");
		l1.add("krishna");
		l1.add("sameer");
		l1.add("zakeer");
		l1.add("rushi");
		l1.add("kamal");
		l1.add("ravi");
		name n= new test();
		n.display();
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

.\sysadm
/$f#VWW216kxjKO

