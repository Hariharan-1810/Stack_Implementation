import stack_ds.stack;

public class Main2
{
    public static void main(String args[])
    {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.remid();
        s.display();
    }
}
