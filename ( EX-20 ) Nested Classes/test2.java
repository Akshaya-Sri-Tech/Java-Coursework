//non-static nested class (Inner class)
class Outer
{
    int outVar = 10;
    class Inner             
    {
        public void display()
        {
            System.out.println("This is nested class function");
            outVar = 100;
        }
    }
}

public class test2
{
    public static void main(String args[])
    {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();      
        inn.display();                         
    }
}