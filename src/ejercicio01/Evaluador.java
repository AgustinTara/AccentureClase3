package ejercicio01;
import java.util.ArrayList;
import java.util.function.Function;

public class Evaluador {
    private ArrayList<Piloto> lst;

    public Evaluador(ArrayList<Piloto> lst) {
        this.lst = lst;
    }
    
    // java.util.function.BiFunction
            
    public ArrayList<Piloto> obtenerTodosPeroParametrizar(Function<Piloto, Boolean> cri) {
        ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();		
        for(Piloto p: lst){
            if (cri.apply(p)) {
                pilotoRet.add(p);
            }
        }
        return pilotoRet;
    }
    public ArrayList<Piloto> obtenerTodosPeroParametrizar(boolean leGustaVolar, boolean tieneChoques) {
        ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();		
        for(Piloto p: lst){
            if ((p.leGustaVolar == leGustaVolar) && 
                    ((p.cantidadDeChoques != 0) == tieneChoques)) {
                pilotoRet.add(p);
            }
        }
        return pilotoRet;
    }
    public ArrayList<Piloto> leGustaVolarNoTieneChoques(){
        ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();		
        for(Piloto p: lst){
                if(p.leGustaVolar && p.cantidadDeChoques == 0){				
                        pilotoRet.add(p);
                }
        }
        return pilotoRet;
    }
    public ArrayList<Piloto> leGustaVolarTieneChoques(){
            ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();
            for(Piloto p: lst){
                if(p.leGustaVolar && p.cantidadDeChoques > 0){				
                        pilotoRet.add(p);
                }
            }
            return pilotoRet;
    }
    public ArrayList<Piloto> noLeGustaVolarNoTieneChoques(){
            ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();
            for(Piloto p: lst){
                    if(!p.leGustaVolar && p.cantidadDeChoques == 0){				
                            pilotoRet.add(p);
                    }
            }
            return pilotoRet;
    }
    public ArrayList<Piloto> noLeGustaVolarTieneChoques(){
            ArrayList<Piloto> pilotoRet = new ArrayList<Piloto>();
            for(Piloto p: lst){
                    if(!p.leGustaVolar && p.cantidadDeChoques > 0){				
                            pilotoRet.add(p);
                    }
            }
            return pilotoRet;
    }
}
