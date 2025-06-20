// Source code is decompiled from a .class file using FernFlower decompiler.
package models;

public class NodeGeneric<T> {
   private T value;
   private NodeGeneric<T> next;

   public NodeGeneric(T value) {
      this.value = value;
      this.next = null;
   }

   public T getValue() {
      return this.value;
   }

   public void setValue(T value) {
      this.value = value;
   }

   public NodeGeneric<T> getNext() {
      return this.next;
   }

   public void setNext(NodeGeneric<T> next) {
      this.next = next;
   }
}
