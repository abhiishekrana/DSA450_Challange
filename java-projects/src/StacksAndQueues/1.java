/******************************************************************************
Introduction to Stack – Data Structure and Algorithm Tutorials

*******************************************************************************/
class Stack{
    static final int MAX=1000;
    int top;
    int[] arr = new int[MAX];
    
    Stack(){
        top=-1;
    }
    boolean isEmpty(){
        return top<0;
    }
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("UnderFlow");
            return false;
        }
        else{
            arr[++top]=x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("UnderFlow");
            return 0;
        }else{
            int y=arr[top--];
            return y;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("UnderFlow");
            return 0;
        }else{
            int y=arr[top];
            return y;
        }
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(" "+ arr[i]);
        }
    }
}

public class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
