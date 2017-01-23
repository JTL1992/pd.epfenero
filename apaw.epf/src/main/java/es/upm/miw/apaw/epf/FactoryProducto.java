package es.upm.miw.apaw.epf;

import java.util.HashMap;

public class FactoryProducto {
    
    private static FactoryProducto factoryProducto = new FactoryProducto();
    
    private HashMap<String, Producto> productos;
    
    private FactoryProducto() { 
        productos = new HashMap<String, Producto>();        
    }
    
    public static FactoryProducto getFactory(){
        return FactoryProducto.factoryProducto;
    }
    
    public Producto getProducto(String name){
        if (!productos.containsKey(name)) {
            productos.put(name, new Producto(name, 5.0));
        }
        return productos.get(name);
    }
}
