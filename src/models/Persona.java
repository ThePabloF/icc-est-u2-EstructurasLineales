// Source code is decompiled from a .class file using FernFlower decompiler.
package models;

public class Persona {
   private String nombre;

   public Persona(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String toString() {
      return "Persona [nombre=" + this.nombre + "]";
   }
}
