
import java.lang.Thread;

public class principal {


    public static void main(String[] args) {
        
        TareaImprimir t1 = new TareaImprimir("1er Proceso");
        
        // iniciamos com en la expo
        Thread proceso1;
        Thread proceso2;
        Thread proceso3;
        
        //creamos los objetos

        proceso1 = new Thread( t1 );
        proceso2 = new Thread( new TareaImprimir("2do Proceso") );
        proceso3 = new Thread( new TareaImprimir("3er Proceso") );
        
        //desplegamos
        System.out.printf("***************Los procesos han sido creados....\n\n");
        
        //incia los procesos con la funcion start()
        proceso1.start();
        proceso2.start();
        proceso3.start();
        
        //le indicamos al usuario que la funcion main ya termina
        System.out.printf("****Procesos iniciados..., la función main ha terminado...\n\n");
        
    }
}
