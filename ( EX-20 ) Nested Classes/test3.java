class Outer
{
    int outVar = 10;
    public void display()
    {
        class Inner                      //local class inside a function
        {
            public void show()
            {
                System.out.println("This is local class function");
                outVar = 100 * 2;        //outer class variable can be accessed
            }
        }

        Inner inn = new Inner();        
        inn.show();       
    }
}

public class test3
{
    public static void main(String args[])
    {
        Outer out = new Outer();
        out.display();
    }
}