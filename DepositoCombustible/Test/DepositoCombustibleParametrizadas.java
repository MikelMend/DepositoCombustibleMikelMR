import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;


    @RunWith(Parameterized.class)
    public class DepositoCombustibleParametrizadas {

	
  	    public double deposito;
  	    public double cantidad;
  	    public double nivelDeposito;
  	    
  	    
		
		public DepositoCombustibleParametrizadas (  double cantidadConsumida, double resCanDepo ) {
			this.deposito = 100;
			this.cantidad = cantidadConsumida;
			this.nivelDeposito = resCanDepo;
		}
		
		@Parameters
	    public static Collection<Object[]> deposito(){
	    	return Arrays.asList (new Object[][] {
	    		{30,70},{100,0},{80,20}});
	    	}
	    
	@Test
	public void testConsumir(double nivelDeposito) {
		DepositoCombustible depco = new DepositoCombustible (deposito, deposito);
		depco.consumir(cantidad);
		double resCanDepo = depco.getDepositoNivel();
		assertEquals(resCanDepo, nivelDeposito,0);
		
		
	}
}

