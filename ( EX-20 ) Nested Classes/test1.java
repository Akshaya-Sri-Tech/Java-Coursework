//static nested class
class Outer
{
    static class Inner             
    {
        public void display()
        {
            System.out.println("This is nested class function");
        }
    }
}

public class test1
{
    public static void main(String args[])
    {
        Outer.Inner inn = new Outer.Inner();    
        inn.display();                          
    }
}