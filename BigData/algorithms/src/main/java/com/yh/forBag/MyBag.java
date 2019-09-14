package com.yh.forBag;

import java.util.Iterator;
import java.util.ListIterator;

/*
Bag是一种不支持删除元素的、无序的、专注于取和存的集合类型。
 */
public class MyBag<Item> implements Iterable<Item> {

  //链表的首节点
  private Node first;
  //数量
  private Integer N=0;

  private class Node {

    Item item;
    Node next;
  }

  //使用头插法向背包中插入元素
  public void add(Item item) {
    Node OldFirst = first;
    first = new Node();
    first.item = item;
    first.next = OldFirst;
    N++;
  }

  public Boolean isEmpty() {
    return first == null;
  }

  public Integer size() {
    return N;
  }

  //获取迭代器对象
  public Iterator<Item> iterator() {
    return new ListerIterator<Item>();
  }

  private class ListerIterator<Item> implements Iterator<Item> {

    private Node current = first;

    public boolean hasNext() {
      return current != null;
    }

    public Item next() {
      Item item = (Item) current.item;
      current = current.next;
      return item;
    }

    public void remove() {

    }


  }

}
