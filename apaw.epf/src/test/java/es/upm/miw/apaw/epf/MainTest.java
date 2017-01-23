package es.upm.miw.apaw.epf;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest{
    
    private ComponenteProducto bebidas, refrescos, desayunos, tapas;
    
    private ComponenteProducto cafe, te, coca_cola, fanta_naranja, tostada_con_tomate, cacahuetes, patatas;
    
    private ComponenteProducto comanda1;
    
    @Before
    public void init(){
        bebidas = new Familia("Bebidas");
        refrescos = new Familia("Refrescos");
        desayunos = new Familia("Desayunos");
        tapas = new Familia("Tapas");
        
        cafe = FactoryProducto.getFactory().getProducto("Café");
        te = FactoryProducto.getFactory().getProducto("Té");
        coca_cola = FactoryProducto.getFactory().getProducto("Coca-Cola");
        fanta_naranja = FactoryProducto.getFactory().getProducto("Fanta Naranja");
        tostada_con_tomate = FactoryProducto.getFactory().getProducto("Tostada con tomate");
        cacahuetes = FactoryProducto.getFactory().getProducto("Cacahuetes");
        patatas = FactoryProducto.getFactory().getProducto("Patatas");
        
        comanda1 = new Comanda("Comanda1");
        
        refrescos.add(coca_cola);
        refrescos.add(fanta_naranja);
        
        bebidas.add(refrescos);
        bebidas.add(cafe);
        bebidas.add(te);
        
        desayunos.add(cafe);
        desayunos.add(te);
        desayunos.add(tostada_con_tomate);
        
        tapas.add(cacahuetes);
        tapas.add(patatas);
        
        comanda1.add(te);
        comanda1.add(tostada_con_tomate);
        
    }
    
    @Test
    public void testProductoFlyweight() {
        assertSame(cafe, FactoryProducto.getFactory().getProducto("Café"));
    }
    
    @Test
    public void testBebidas(){
        assertEquals("#Coca-Cola#Fanta Naranja#Café#Té", bebidas.print());
    }
    
    @Test
    public void testRefrescos(){
        assertEquals("#Coca-Cola#Fanta Naranja", refrescos.print());
    }
    
    @Test
    public void testDesayunos(){
        assertEquals("#Café#Té#Tostada con tomate", desayunos.print());
    }
    
    @Test
    public void testTapas(){
        assertEquals("#Cacahuetes#Patatas", tapas.print());
    }
    
    @Test
    public void testComanda1(){
        assertEquals("#Té#Tostada con tomate", comanda1.print());
    }
    
    @Test
    public void testTotalPrice(){
        assertEquals(10, comanda1.getPrice(), 0.01);
    }
    
}
