package es.upm.miw.apaw.epf;

import java.util.ArrayList;

public abstract class CompositeProducto extends ComponenteProducto{
    
    protected ArrayList<ComponenteProducto> composites;
    
    protected String name;
    
    public CompositeProducto(String name) {
        this.name = name;
        composites = new ArrayList<ComponenteProducto>();
    }
    
    protected String getName() {
        return name;
    }
    
    @Override
    public String print() {
        String result = "";        
        for (ComponenteProducto componenteProducto : composites) {
            result += componenteProducto.print();
        }       
        return result;
    }

}
