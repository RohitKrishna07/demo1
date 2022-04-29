class failfastex{
    public static void main(String[] args)
    {
        ArrayList al= new ArrayList();
        al.add("rohit");
        al.add("sameer");
        al.add("pavan");
        al.add("zakeer");

        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
            System.out.println(al.get(itr.next()));
            al.add("rushi");
        }

    }
}