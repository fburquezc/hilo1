
import java.util.Random;

public class TareaImprimir  implements Runnable{
    
    private final int tiempoInactividad;
    
    private final String nombreTarea;
    private final static Random generador = new Random();
    
    //constructor
    public TareaImprimir(String nombre){
        nombreTarea = nombre;
        
        tiempoInactividad = generador.nextInt(15000);
    }
    
    //metodo run
    @Override
    public void run(){
        
        try{
            
            System.out.printf("%s va estar inactivo durante %d milisegundos...\n", nombreTarea, tiempoInactividad);
            System.out.printf("   Inicia inactividad de %s\n", nombreTarea);
            Thread.sleep(tiempoInactividad);
            System.out.printf("   Termina inactividad de %s\n", nombreTarea);
            
        }//fin try
        catch(InterruptedException e){
            System.out.printf("%s  -  termino de forma prematura por interrupcion ...\n", nombreTarea);
        }//fin catch
        
        System.out.printf("%s termino su actividad de imprimir...\n", nombreTarea);
    
    }//fin de run
    
}
