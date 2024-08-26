package stack_ds;

public class stack
{
    public class node
    {
        int data;
        node next;
    }

    node top, bot;
    int size;

    public void push(int num)
    {
        node nn = new node();
        nn.data = num;
        nn.next = null;

        if(top == null)
        {
            top = nn;
            bot = nn;
            size++;
        }
        else
        {
            nn.next = top;
            top = nn;
            size++;
        }
    }
        
    public int pop()
    {
        if(size == 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        int temp = top.data;
        top = top.next;
        size--;
        if(size == 0)
        {
            bot = null;
        }
        return temp;
    }
    
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty()
    {
        return (top == null);
    }
    
    public int getSize()
    {
        return size;
    }

    public void remid()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            int i = 0;
            int j = getSize();

            node temp = top;
            node pre = null;

            while(i < j/2)
            {
                pre = temp;
                temp = temp.next;
                i++;
            }
            if(pre!= null)
            {
                pre.next = temp.next;
            }
            else
            {
                top = temp.next;
            }
            size--;
        }
    }
    
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        node temp = top;
        System.out.print("Stack: ");
        while(temp!= null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}