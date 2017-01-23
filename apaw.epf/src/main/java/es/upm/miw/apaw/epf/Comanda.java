package es.upm.miw.apaw.epf;

public class Comanda extends CompositeProducto{
    
    private double totalPrice;
    
    public Comanda(String name) {
        super(name);
        totalPrice = 0;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(ComponenteProducto componenteProducto) {
        totalPrice += componenteProducto.getPrice();
        composites.add(componenteProducto);       
    }

    @Override
    public void remove(ComponenteProducto componenteProducto) {
        totalPrice -= componenteProducto.getPrice();
        composites.remove(componenteProducto);
    }

    @Override
    public double getPrice() {
        return totalPrice;
    }

    @Override
    public String print() {
       return super.print();
    }
    
}
