package parque.agentes;

import parque.acceso.UsoAcceso;
import parque.atracciones.UsoAtracción;
import parque.pulseras.GestorPulseras;
import parque.pulseras.UsoPulseras;

/**
 * <p>
 * Clase que simula el comportamiento de un <b>cliente</b> del parque de atracciones.
 * </p>
 * @author DTE-SSOO 2019-20 
 */
public class Cliente
extends Thread
{
	/**
	 * @param uPulseras {@link parque.pulseras.UsoPulseras} interfaz de uso del sistema de gestión de pulseras.
	 * @param uAtracciones {@link parque.atracciones.UsoAtracción} interfaz de uso de cada una de las atracciones disponibles en el parque en el momento de apertura.
	 * @param uAcceso {@link parque.acceso.UsoAcceso} interfaz de uso del dispositivo de control de acceso al parque.
	 */
	private UsoPulseras uPulseras;
	public Cliente ( UsoPulseras uPulseras)
	{
		this.uPulseras = uPulseras;
	}


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run ()
	{
		for(int contador=0; contador<10; contador++) {
			uPulseras.obtenerPulsera();
			System.out.println("Cliente " + contador);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
