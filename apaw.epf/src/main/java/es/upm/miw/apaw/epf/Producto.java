package es.upm.miw.apaw.epf;

public class Producto extends ComponenteProducto{

    private String name;
    
    private double price;
    
    public Producto(String name, double price) {
        this.name = name;   
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void add(ComponenteProducto componenteProducto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(ComponenteProducto componenteProducto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String print() {
        return "#"+name;
    }

}
