package lockC;

 // BuferSincronizado.java
 // Sincroniza el acceso a un entero compartido, usando las interfaces
 // Lock y Condition
 import java.util.concurrent.locks.Lock;
 import java.util.concurrent.locks.ReentrantLock;
 import java.util.concurrent.locks.Condition;
 import java.nio.Buffer;

 public class BuferSincronizado implements Bufer {
 // Bloqueo para controlar la sincronizaci�n con este b�fer
 private final Lock bloqueoAcceso = new ReentrantLock();

 // condiciones para controlar la lectura y escritura
 private final Condition puedeEscribir = bloqueoAcceso.newCondition();
 private final Condition puedeLeer = bloqueoAcceso.newCondition();

 private int bufer = -1; // compartido por los subprocesos productor y consumidor
 private boolean ocupado = false; // indica si el b�fer est� ocupado

 // coloca un valor int en el b�fer
 public void establecer( int valor ) throws InterruptedException
 {
 bloqueoAcceso.lock(); // bloquea este objeto

 // imprime informaci�n del subproceso y del b�fer, despu�s espera
 try
 {
 // mientras b�fer no est� vac�o, coloca el subproceso en espera
 while ( ocupado )
 {
	 System.out.println("cuanto");
 System.out.println( "Productor trata de escribir.");
 mostrarEstado( "Bufer lleno. Productor espera." );
 puedeEscribir.await(); // espera hasta que bufer est� vac�o
 } // fin de while

 bufer = valor; // establece el nuevo valor de b�fer

 // indica que el productor no puede almacenar otro valor
 // hasta que el consumidor obtenga el valor actual del b�fer
 ocupado = true;

 mostrarEstado( "Productor escribe " + bufer );

 // indica al subproceso en espera que lea del b�fer
 puedeLeer.signal();
 } // fin de try
 finally
 {
 bloqueoAcceso.unlock(); // desbloquea este objeto
 } // fin de finally
 } // fin del m�todo establecer

 // devuelve el valor del b�fer
 public int obtener() throws InterruptedException
 {
 int valorLeido = 0; // inicializa el valor que se ley� del b�fer
 bloqueoAcceso.lock(); // bloquea este objeto

 // imprime informaci�n del subproceso y del b�fer, despu�s espera
 try
 {
 // mientras no haya datos qu� leer, coloca el subproceso en espera
while ( !ocupado )
 {
 System.out.println( "Consumidor trata de leer." );
 mostrarEstado( "Bufer vacio. Consumidor espera." );
 puedeLeer.await(); // espera hasta que bufer est� lleno
 } // fin de while

 // indica que el productor puede almacenar otro valor
 // porque el consumidor acaba de obtener el valor del b�fer
 ocupado = false;

 valorLeido = bufer; // obtiene el valor del b�fer
 mostrarEstado( "Consumidor lee " + valorLeido );

// indica al subproceso que espera a que el b�fer est� vac�o
 puedeEscribir.signal();
 } // fin de try
finally
 {
 bloqueoAcceso.unlock(); // desbloquea este objeto
 } // fin de finally

 return valorLeido;
} // fin del m�todo obtener

 // muestra la operaci�n actual y el estado del b�fer
 public void mostrarEstado( String operacion )
 {
System.out.printf( "%-40s%d\t\t%b\n\n", operacion, bufer,
ocupado );
 } // fin del m�todo mostrarEstado
 } // fin de la clase BuferSincronizado
