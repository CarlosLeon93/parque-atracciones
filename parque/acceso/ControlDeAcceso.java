package parque.acceso;


/**  
 * <p>
 * Clase que implementa las interfaces de supervisión ({@link SupervisiónAcceso}) y uso ({@link UsoAcceso})del <code>dispositivo de control de acceso</code>.
 * </p>
 *
 * @author DTE-SSOO 2019-20 
 */
public class ControlDeAcceso
implements SupervisiónAcceso, UsoAcceso
{
	/**
	 * @param aforo número máximo de agentes {@link parque.agentes.Cliente} que pueden estar simultáneamente dentro del parque
	 */
	public ControlDeAcceso ( int aforo )
	{
	}

	/* (non-Javadoc)
	 * @see parque.acceso.UsoAcceso#entrar()
	 */
	@Override
	public void entrar () throws InterruptedException
	{
	}

	/* (non-Javadoc)
	 * @see parque.acceso.UsoAcceso#salir()
	 */
	@Override
	public void salir ()
	{
	}

	/* (non-Javadoc)
	 * @see parque.acceso.SupervisiónAcceso#clientesDentro()
	 */
	@Override
	public int clientesDentro ()
	{
		return 0;
	}

	/* (non-Javadoc)
	 * @see parque.acceso.SupervisiónAcceso#clientesHanSalido()
	 */
	@Override
	public int clientesHanSalido ()
	{
		return 0;
	}
}
