interface Shape
{
    void showColor();
}

public class test4
{
    public static void main(String args[])
    {
        Shape s = new Shape(){
            public void showColor(){
                System.out.println("Red");   
            }
        };
        s.showColor();
    }
}