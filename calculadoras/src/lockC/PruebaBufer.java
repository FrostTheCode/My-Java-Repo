package lockC;

 import java.nio.Buffer;
// PruebaBuferCompartido2.java
 // Dos subprocesos que manipulan un búfer sincronizado.
 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Executors;

 public class PruebaBufer
 {
 public static void main( String[] args )
 {
 // crea nueva reserva con dos subprocesos
 ExecutorService aplicacion = Executors.newCachedThreadPool();

 // crea BuferSincronizado para almacenar valores int
 Buffer ubicacionCompartida = new BuferSincronizado();

 System.out.printf( "40s%s\t\t%s\n%-40s%s\n\n", "Operacion",
 "Bufer", "Ocupado", "---------", "------\t\t--------" );

 // ejecuta las tareas Productor y Consumidor
 aplicacion.execute( new Productor( ubicacionCompartida ) );
 aplicacion.execute( new Consumidor( ubicacionCompartida ) );

 aplicacion.shutdown();
} // fin de main
} // fin de la clase PruebaBuferCompartido2