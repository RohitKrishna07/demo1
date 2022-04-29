import java.util.*;
class failsafeex{
    public Static void main(String[] args)
    {
        CopyOnWriteArrayList al=new CopyOnWriteArrayList();
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            String s= (String)itr.next();
            System.out.println(s);
            al.add("krishna");
        }
    }
}