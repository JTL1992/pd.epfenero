package es.upm.miw.apaw.epf;

public class Familia extends CompositeProducto{

    public Familia(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(ComponenteProducto componenteProducto) {
        composites.add(componenteProducto);
    }

    @Override
    public void remove(ComponenteProducto componenteProducto) {
        composites.remove(componenteProducto);
    }

    @Override
    public double getPrice() {
        return 0;
    }
    
    @Override
    public String print() {
       return super.print();
    }

}
