package SycProses;

import java.lang.Runnable;
public class EscritorArreglo implements Runnable
{
private final ArregloSimple arregloSimpleCompartido;
private final int valorInicial;
public EscritorArreglo( int valor, ArregloSimple arreglo )
{
valorInicial = valor;
arregloSimpleCompartido= arreglo;
} // fin del constructor
public void run()
{
for ( int i = valorInicial; i < valorInicial + 3; i++ )
{
arregloSimpleCompartido.agregar( i ); // agrega un elemento al arreglo compartido
} // fin de for
} // fin del método run
} // fin de la clase EscritorArreglo

