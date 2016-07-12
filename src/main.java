import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] M = {1,0};
		int[][] I = {{-1, 1},
				     { 1,-1}};
		Procesador_Petri procesador = new Procesador_Petri(M,I);
		
		int[] U = {1,0};
		procesador.ejecutar(U);
	}

}
