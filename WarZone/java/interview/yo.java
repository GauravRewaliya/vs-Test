class Sample{
    // static List l = new ArrayList<Char>();
    static void printAll(StringBuffer n  ,StringBuffer ans ,int ind)
    {
        for(int i=ind;i<n.length();i++)
        {
            ans.append(n.charAt(i));
            n.deleteCharAt(i);

        }
    }

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    String no =""+new sc.nextInt();
    StringBuffer n = new StringBuffer();
    // for(int i=0;i<no.length();i++)
    //  {
    //     l.add(no.charAt(i));
    //  }
        StringBuffer ans = new StringBuffer();
      int ind = 0;  
    printAll(n,ans ,ind);
    //printAll(no);
    }
}

//int no << 123
//