import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] M = {1,0};
		int[][] I = {{-1, 1},
				     { 1,-1}};
		Procesador_Petri procesador = new Procesador_Petri(M,I);
		
		int[] U = {1,0};
		//procesador.ejecutar(U);
		procesador.trans_sens();
		/*Procesos p1 = new Procesos(1);
		Procesos p2 = new Procesos(2);
		p1.start();
		p2.start();*/
	}

}
