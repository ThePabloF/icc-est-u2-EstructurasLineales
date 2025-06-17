// Source code is decompiled from a .class file using FernFlower decompiler.
package controllers;

import java.util.EmptyStackException;

import javax.management.StringValueExp;

import models.NodeGeneric;

public class ColaG<T> {
   private NodeGeneric<T> primero = null;
   private NodeGeneric<T> ultimo = null;
   private int size = 0;

   public ColaG() {
   }

   public void add(T value) {
      NodeGeneric<T> newNode = new NodeGeneric(value);
      if (this.isEmpty()) {
         this.primero = newNode;
         this.ultimo = newNode;
      } else {
         this.ultimo.setNext(newNode);
         this.ultimo = newNode;
      }

      ++this.size;
   }

   public T remove() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         T value = this.primero.getValue();
         this.primero = this.primero.getNext();
         --this.size;
         return value;
      }
   }

   public T peek() {
      if (this.isEmpty()) {
         throw new EmptyStackException();
      } else {
         return this.primero.getValue();
      }
   }

   public boolean isEmpty() {
      return this.primero == null;
   }

   public void printCola() {
      for(NodeGeneric<T> actual = this.primero; actual != null; actual = actual.getNext()) {
         System.out.println(actual.getValue());
      }

   }
     
   public int findByname(String name){
      int posicion = 0;
      NodeGeneric<T> node = primero;

      while (node!= null) {
         if (node.getValue().toString().equals(name)) {
            return posicion;
         }
         node = primero.getNext();
         posicion++;
      }
      return -1;
   }

   public int size() {
      return this.size;
   }
}
