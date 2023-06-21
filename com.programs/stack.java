package com.programs;
import java.util.*;
class printException extends Exception{
        public String getMessage() {
                return "Exception: Peek cannot be done as Stack is Empty";
        }
}
class printOverflow extends Exception{
        public String getMessage(){
                return "Exception: PUSH operation cannot be done as ArrayIndexOutOfBounds";
        }
}
class printUnderflow extends Exception{
        public String getMessage(){
                return "Exception: POP operation cannot be done at Index -1";
        }
}
public class stack{
        static int top  = -1;
        static int[] st = new int[1024];
        /*static String getMessage(String s){
                return s;
        }*/
        public static void push(int var)throws Exception{
                if(top==10)
                        throw new printOverflow();
                else
                        st[++top] = var;
        }
        public static void pop()throws Exception{
                if(top==-1)
                        throw new printUnderflow();
                else
                        --top;
        }
        public static int peek()throws Exception{
                if(top==-1)
                        throw new printException();
                return st[top];
        }
        public static void display(){
                if(top==-1)
                        System.out.println("Stack is Empty");
                else{
                        System.out.print("[");
                        for(int i=0;i<=top;i++)
                                if(i<top)
                                        System.out.print(st[i]+",");
                        System.out.println(st[top]+"]");
                }
        }
}
