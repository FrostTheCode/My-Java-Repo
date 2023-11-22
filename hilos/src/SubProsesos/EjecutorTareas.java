package SubProsesos;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class EjecutorTareas
{
public static void main( String[] args )
{
// crea y nombra cada objeto Runnable
TareaImprimir tarea1 = new TareaImprimir( "tarea1" );
TareaImprimir tarea2 = new TareaImprimir( "tarea2" );
TareaImprimir tarea3 = new TareaImprimir( "tarea3" );
System.out.println( "Iniciando Executor" );

}
}