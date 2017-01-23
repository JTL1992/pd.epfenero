package es.upm.miw.apaw.epf;

public abstract class ComponenteProducto {
    
   public abstract void add(ComponenteProducto componenteProducto);
   
   public abstract void remove(ComponenteProducto componenteProducto);
   
   public abstract double getPrice();
   
   public abstract String print();
  
}
