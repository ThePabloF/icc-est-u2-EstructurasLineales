// Source code is decompiled from a .class file using FernFlower decompiler.
package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Cola {
   private Node primero = null;
   private Node ultimo = null;
   public int size = 0;

   public Cola() {
   }

   public void add(int value) {
      Node newnode = new Node(value);
      if (this.isEmpty()) {
         this.primero = newnode;
         this.ultimo = newnode;
      } else {
         this.ultimo.setNext(newnode);
         this.ultimo = newnode;
      }

      ++this.size;
   }

   public int remove() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         int value = this.primero.getValue();
         this.primero.getNext();
         --this.size;
         return value;
      }
   }

   public int peek() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         int value = this.primero.getValue();
         return value;
      }
   }

   public Boolean isEmpty() {
      return this.primero == null ? true : false;
   }

   public int size() {
      return this.size;
   }

   public void printCola() {
      for(Node actual = this.primero; actual != null; actual = actual.getNext()) {
         System.out.println(actual.getValue());
      }

   }
}
