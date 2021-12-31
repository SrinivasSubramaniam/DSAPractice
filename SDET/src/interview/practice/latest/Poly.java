package interview.practice.latest;

interface GFG
{
    void myMethod();
    void getInfo();
}
  
abstract class Geeks implements GFG
{
    void getData()
    {
        System.out.println("GFG");
    }
    public void getInfo()
    {
        System.out.println("Abstract Geeks");
    }
}
  
public class Poly extends Geeks
{
    public void myMethod()
    {
        System.out.println("GeeksforGeeks");
    }
    public void getInfo()
    {
        System.out.println("Geeks");
    }
    public void getChildInfo()
    {
        System.out.println("Child info Geeks");
    }
      
    public static void main(String[] args)
    {
        Geeks obj = new Poly();
        obj.getInfo();
    }
}