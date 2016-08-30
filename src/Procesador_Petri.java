import java.util.Arrays;

public class Procesador_Petri {
		private int[] M;     //Marcado inicial.
		private int[][] I;   //Matriz de incidencia.
		private int[] U;     //Disparo que se pretende realizar.
		private boolean disparo_posible;
		//private int[] aux = {0,0};
		
		public Procesador_Petri(int[] M, int[][] I ){
			this.M=M;
			this.I=I;
			disparo_posible = true;
		}
		
		public boolean ejecutar (int[] U){
			int fil=I.length;                     // I.length = filas
			int col=I[0].length;                  //I[0].length = columnas
			
			int[] aux;
			aux=new int[fil];                     //aux=resultado de la multiplicacion entre matrices
			
			disparo_posible = true;
			
			/*Multiplicacion de matrices (I*U)*/
			for(int i=0; i<fil; i++){
				for (int j=0; j<col; j++){
					aux[i]+=I[i][j]*U[j];
				}
			}
			
			/*Comprobar si el disparo no es posible*/
			for(int j=0; j<col; j++){
				if(M[j]+aux[j]==-1){
					disparo_posible = false;
					break;
				}
			}
			
			/*Si el disparo es posible*/
			if(disparo_posible==true){
				/*Suma de vectores (M+(I*U))*/
				for(int j=0; j<col; j++){
					M[j]=M[j]+aux[j];
					System.out.println(M[j]);
				}
			}	
			
			System.out.println(disparo_posible);
			return disparo_posible;
		}
		
		public int[] trans_sens(){
			/*Ver transiciones sensibilizadas (I*M)*/
			
			int fil=I.length;                     // I.length = filas
			int col=I[0].length;                  //I[0].length = columnas
			
			int[] aux2;
			aux2=new int[fil];
			
			for(int i=0; i<fil; i++){
				for (int j=0; j<col; j++){
					aux2[i]+=I[i][j]*M[j];
				}
				System.out.println(aux2[i]);
			}
			return aux2;
		}
}
