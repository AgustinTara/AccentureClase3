package ejercicio01;
import java.util.ArrayList;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Piloto> lst = new ArrayList <Piloto>();
		Evaluador evaluador = new Evaluador(lst);
		
		lst.add(new Piloto("Jorge", "Gutierrez", true, 0 ));
		lst.add(new Piloto("Nicolas", "Perez", true, 10 ));
		lst.add(new Piloto("Santiago", "Freire", false, 0 ));
		lst.add(new Piloto("Ana", "Gutierrez", false, 1 ));
		lst.add(new Piloto("Victoria", "Gutierrez", true, 0 ));
		lst.add(new Piloto("Julia", "Freire", true, 0 ));
		lst.add(new Piloto("Carlos", "Gutierrez", true, 1 ));
		
                /*
		//le gusta volar y no tiene choques                
		for (Piloto p : evaluador.leGustaVolarNoTieneChoques()) {
                    System.out.println(p);
                }
                */
                                
		//le gusta volar y tiene choques
		for (Piloto p : evaluador.leGustaVolarTieneChoques()) {
                    System.out.println(p);
                }
                
                for (Piloto p : evaluador.obtenerTodosPeroParametrizar(true, true)) {
                    System.out.println(p);
                }
                
                for (Piloto p : evaluador.obtenerTodosPeroParametrizar(p -> (p.leGustaVolar && p.cantidadDeChoques > 0))) {
                    System.out.println(p);
                }
                
                lst.stream()
                        .filter(p -> (p.leGustaVolar && p.cantidadDeChoques > 0))
                        .filter(p -> p.cantidadDeChoques == 10)
                        .forEach(x -> System.out.println(x));
                
		
                /*
		//no le gusta volar y no tiene choques
		for (Piloto p : evaluador.noLeGustaVolarNoTieneChoques()) {
                    System.out.println(p);
                }
		
		//no le gusta volar y tiene choques
		for (Piloto p : evaluador.noLeGustaVolarTieneChoques()) {
                    System.out.println(p);
                }
		*/
		
	}

}
