package parque;

import parque.agentes.Cliente;
import parque.pulseras.GestorPulseras;
import parque.agentes.Supervisor;

/**  
 * <p>
 * Clase que implementa al simulador.
 * </p>
 * <pre>
 * 	<b>uso</b>: java SimuladorParque &lt;numClientes&gt; &lt;maxTiquesPulsera&gt; &lt;aforo&gt; &lt;plazasSillas&gt; &lt;numCanastas&gt;
 * 	 <b>&lt;numClientes&gt;</b> número de clientes que se intentarán acceder al parque este día
 * 	 <b>&lt;maxTiquesPulsera&gt;</b> número máximo de tiques que se podrán cargar en cada pulsera en el momento de su expedición
 * 	 <b>&lt;aforo&gt;</b> aforo máximo del parque
 * 	 <b>&lt;plazasSillas&gt;</b> número de canastas disponibles en la atracción de tiro a canasta
 * 	 <b>&lt;numCanastas&gt;</b> número de sillas del carrusel de las sillas voladoras
 * </pre>
 * 
 * @author DTE-SSOO 2019-20
 */
public class SimuladorParque
{
	/**
	 * @param args argumentos que espera la aplicación.
	 *  
	 */
	public static void main ( String[] args )
	{
		GestorPulseras gestor = new GestorPulseras(10);
		Cliente cliente = new Cliente(gestor);
		Supervisor supervisor = new Supervisor(gestor, 5);
		
		cliente.start();
		supervisor.start();
	}
}
