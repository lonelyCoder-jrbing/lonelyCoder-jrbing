package com.yh.forBag;

import java.util.Iterator;

public class App {

  public static void main(String[] args) {
    MyBag<String> bag = new MyBag<String>();
//     for(int i = 0 ;i<10;i++){
//       bag.add("jrbing");
//     }
    bag.add("jrbing");
    bag.add("byy");
    bag.add("shengyi");

    Iterator<String> iterator = bag.iterator();
    while (iterator.hasNext()){
       String next = iterator.next();
       System.out.println(next);
     }

  }



}
