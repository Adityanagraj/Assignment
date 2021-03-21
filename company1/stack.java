package com.company;

public class stack {
    static final int MAX = 5;
    static int top;
    static int a[] = new int[MAX];
    stack()
    {
        top = -1;
    }
    static boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    static int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    static int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
     push(100);
     push(200);
     push(300);
     push(400);
     System.out.println("element popped "+pop());
     System.out.println("element popped "+pop());
     System.out.println("top element "+peek());
    }
}
