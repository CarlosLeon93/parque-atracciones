package parque.pulseras;


/**
 * <p>
 * Clase que implementa las interfaces de supervisión ({@link SupervisiónPulseras}), control ({@link ControlPulseras}) y uso ({@link UsoPulseras}) sobre el repositorio de <i><b>pulseras activas</b></i>.
 * </p>
 * <p>
 * El repositorio de <i><b>pulseras activas</b></i> almacena información, en tiempo real, sobre el número de tiques asociados a cada {@link Pulsera}.  
 * </p>
 * @author DTE-SSOO 2019-20 
 */
public class GestorPulseras
implements UsoPulseras, ControlPulseras, SupervisiónPulseras
{

	/**
	 * @param maxTiquesPulsera número máximo de tiques con los que se puede obtener ( {@link #obtenerPulsera()}) una {@link Pulsera}
	 */
	private int vendidas = 0;
	public GestorPulseras ( int maxTiquesPulsera )
	{
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.UsoPulseras#obtenerPulsera()
	 */
	@Override
	public Pulsera obtenerPulsera ()
	{
		vendidas+=1;
		return new Pulsera();
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.ControlPulseras#restarTique(parque.pulseras.Pulsera)
	 */
	@Override
	public void restarTique ( Pulsera p )
	{
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.ControlPulseras#sumarTique(parque.pulseras.Pulsera)
	 */
	@Override
	public void sumarTique ( Pulsera p )
	{
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.SupervisiónPulseras#tiquesVendidos()
	 */
	@Override
	public int tiquesVendidos ()
	{
		return 0;
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.SupervisiónPulseras#pulserasVendidas()
	 */
	@Override
	public int pulserasVendidas ()
	{
		return vendidas;
	}

	/* (non-Javadoc)
	 * @see parque.pulseras.UsoPulseras#quedanTiques(parque.pulseras.Pulsera)
	 */
	@Override
	public boolean quedanTiques ( Pulsera p )
	{
		return false;
	}
}
