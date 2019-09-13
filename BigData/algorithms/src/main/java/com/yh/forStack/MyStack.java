package com.yh.forStack;

import java.util.Iterator;
import java.util.Stack;


public class MyStack<Item> implements Iterable<Item>{

  private Node first;
  private int N;

  public Iterator<Item> iterator() {
    return null;
  }

  private class Node {

    Item item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;

  }

  public int size() {
    return N;

  }

  public void push(Item item) {
    //向栈顶添加元素
    //将原来的栈顶元素赋值为老的元素
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    N++;
  }

  public Item pop() {
    //从栈顶删除元素
    Item item = first.item;
    //这样做的目的是将曾经节点直接变为孤儿，java的内存管理系统最终将会回收他所占用的内存。
    //这个删除操作只是一个赋值语句，因此和链表的长度是无关的。
    first.next = first;
    N--;
    return item;
  }

}
