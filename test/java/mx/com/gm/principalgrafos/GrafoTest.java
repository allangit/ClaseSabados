
package mx.com.gm.principalgrafos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GrafoTest {
    
    public GrafoTest() {
    }
    @Test
    public void agregarArista(){
        
        Grafo g=new Grafo(5);
        g.agregarArista(1, 2);
        assertTrue(g.obtenerArtista(1, 2));      
    }
    
    @Test
    public void verificarAristaOpuesta(){
        
        Grafo g=new Grafo(5);
        g.agregarArista(1, 2);
        assertTrue(g.obtenerArtista(2, 1));
    }
}
