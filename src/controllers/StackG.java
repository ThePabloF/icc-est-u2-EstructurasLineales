// Source code is decompiled from a .class file using FernFlower decompiler.
package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class StackG<T> {
   private NodeGeneric<T> top = null;
   private int size = 0;

   public StackG() {
   }

   public void push(T value) {
      NodeGeneric<T> newNode = new NodeGeneric(value);
      newNode.setNext(this.top);
      this.top = newNode;
      ++this.size;
   }

   public T pop() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         T value = this.top.getValue();
         this.top = this.top.getNext();
         --this.size;
         return value;
      }
   }

   public boolean isEmpty() {
      return this.top == null;
   }

   public T peek() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         return this.top.getValue();
      }
   }

   public void printStack() {
      for(NodeGeneric<T> current = this.top; current != null; current = current.getNext()) {
         System.out.println(current.getValue());
      }

   }

   public int size() {
      return this.size;
   }
}
