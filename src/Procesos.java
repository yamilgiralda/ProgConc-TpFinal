
public class Procesos extends Thread{
	private int name;
	public Procesos(int name) {
		this.name = name;
 	}
	public void run(){
		while(true){
			System.out.println( "soy "+ name);
		}
	}
}
