package WEEK_2;

import java.util.*;

public class Stack_Imp_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // input the size of stack
        int n=in.nextInt();
        // create a stack
        Stack1 st=new Stack1(n);
        // push elements
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);        // Size=4 Output >> "Stack Overflow!!"

        // pop function
        System.out.println(st.pop());           // Output >> 16
        // top element
        System.out.println(st.peek());          // Output >> 15
        // empty stack
        System.out.println(st.isEmpty());       // Output >> false
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());       // Output >> true
        in.close();

    }
}
class Stack1{
    int [] arr;
    int cap;
    int top;

    // create a Stack constructor
    Stack1(int n){
        arr=new int[n];
        cap=n;
        top=-1;
    }

    // push function
    public void push(int ele){
        // if the stack is already full output Stack Overflow
        if(top==cap-1){
            System.out.println("Stack Overflow!!");
            return;
        }
        // add the element at the top..
        top++;
        arr[top]=ele;
    }

    // pop function
    public int pop(){
        // if the stack is empty and we try to take out element output Stack UnderFlow..
        if(top==-1){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        // if stack is non empty return top element and decrease by 1
        return arr[top--];
    }

    // peek function
    public int peek(){
        // if the stack is empty and we try to find top element output Stack is Empty..
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        // else return the top element
        return arr[top];
    }

    // empty stack
    public boolean isEmpty(){
        // if top is -1 i.e size is 0 return true
        if(top==-1){
            return true;
        }
        // else return false
        return false;
    }

}
