import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Procesador_Petri {

	@Test
	public void sens() {
		boolean ejecutado;
		
		int[] M = {1,0};
		int[][] I = {{-1, 1},
				     { 1,-1}};
		Procesador_Petri procesador = new Procesador_Petri(M,I);
		
		int[] U = {1,0};
		ejecutado=procesador.ejecutar(U);
		
		assertEquals(true,ejecutado);
	}
	@Test
	public void no_sens() {
		boolean ejecutado;
		
		int[] M = {1,0};
		int[][] I = {{-1, 1},
				     { 1,-1}};
		Procesador_Petri procesador = new Procesador_Petri(M,I);
		
		int[] U = {0,1};
		ejecutado=procesador.ejecutar(U);
		
		assertEquals(false,ejecutado);
	}
	@Test
	public void transSens() {
		
		int[] M = {0,1};
		int[][] I = {{-1, 1},
				     { 1,-1}};
		Procesador_Petri procesador = new Procesador_Petri(M,I);
		int[] ej=procesador.trans_sens();
		int[] U = {1,-1};
	
		
		assertArrayEquals(U,ej);
	}

}
