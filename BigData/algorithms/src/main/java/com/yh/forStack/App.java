package com.yh.forStack;

public class App {

  public static void main(String[] args) {
    MyStack <String> stack = new MyStack<String>();
    int size = stack.size();
    System.out.println(size);

    for(int i = 0 ;i<40 ; i++){
      stack.push("jrbing");
    }
    System.out.println(stack.size());
    System.out.println(stack.pop());
  }
}
