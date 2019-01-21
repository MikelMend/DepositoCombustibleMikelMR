import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeposito {

	@Test
	public void testgetDepositoNivel() {
		DepositoCombustible depco = new DepositoCombustible (40,25);
		double depNivel = depco.getDepositoNivel();
				assertNotSame(depNivel,25);
		
	}

	@Test
	public void testgetDepositoMax() {
		DepositoCombustible depco = new DepositoCombustible (40,40);
		double depMax = depco.getDepositoMax();
		       assertEquals(40,depMax, 0.1);
		
	}

	@Test
	public void testestaVacio() {
		DepositoCombustible depco = new DepositoCombustible (0,0);
		boolean depNivel = depco.estaVacio();
		        assertSame(depNivel,0);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible depco = new DepositoCombustible (40,40);
		boolean depNivel = depco.estaLleno();
				assertSame(depNivel,40);
		
	}

}
