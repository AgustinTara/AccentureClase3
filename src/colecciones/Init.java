package colecciones;
import java.util.ArrayList;


public class Init {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Usuario> lst = new ArrayList <Usuario>();
		
		lst.add(new Usuario("juan", "perez"));
		lst.add(new Usuario("jose", "gomez"));
		lst.add(new Usuario("santiago", "perez"));
		
		
		
		for(Usuario u: lst){
			System.out.println(u);
		}
	}


}
