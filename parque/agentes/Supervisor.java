package parque.agentes;

import parque.pulseras.SupervisiónPulseras;
import parque.atracciones.SupervisiónConcurso;
import parque.atracciones.SupervisiónViajes;
import parque.acceso.SupervisiónAcceso;

/**
  * <p>
 * Clase que simula el comportamiento del <b>Supervisor</b> del parque de atracciones.
 * </p>
 * @author DTE-SSOO 2019-20 
 */
public class Supervisor
extends Thread
{

	/**
	 * @param sPulseras {@link parque.pulseras.SupervisiónPulseras} interfaz de supervisión del <code>sistema de gestión de pulseras</code>
	 * @param sConcurso {@link parque.atracciones.SupervisiónConcurso} interfaz de supervisión de la atracción <code>Tiro a canasta</code>
	 * @param sViajes {@link parque.atracciones.SupervisiónViajes} interfaz de supervisión de la atracción <code>Sillas voladoras</code>
	 * @param sAcceso {@link parque.acceso.SupervisiónAcceso} interfaz de supervisión del <code>dispositivo de control de acceso</code>
	 * @param numClientes número de clientes que podrán acceder al parque
	 */
	private SupervisiónPulseras sPulseras;
	private int numClientes;
	public Supervisor (
		SupervisiónPulseras sPulseras,
		int numClientes )
	{
		this.numClientes = numClientes;
		this.sPulseras = sPulseras;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run ()
	{
		for(int contador=0; contador<10; contador++) {
			System.out.println("Se han vendido " + sPulseras.pulserasVendidas() + " Pulseras");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
