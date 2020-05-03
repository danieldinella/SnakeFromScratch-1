
public class Serpente extends Thread
{
	private boolean inVita;

	private PuntoDelCampo posTesta;

	private PuntoDelCampo direzione;

	private Partita partita;
	
    public Serpente ( Partita p )
	{
		partita = p;
        direzione = NORD;
		posTesta = new PuntoDelCampo(19, 0);
		p.getCampoDiGioco().getQuadratino(posTesta).setToSerpente();
		inVita = true;
	}

	public void avanza ()
	{
		PuntoDelCampo nuovaPos = PuntoDelCampo.somma(posTesta, direzione);

        CampoDiGioco campo = partita.getCampoDiGioco();

		if (campo.getQuadratino(nuovaPos).isCibo())
		{
			System.out.print("GnamGnam ");
			campo.getQuadratino(posTesta).setToPrato();
			campo.getQuadratino(nuovaPos).setToSerpente();
			posTesta.spostaAl(nuovaPos);
			partita.generaCibo();
		}

		else if (campo.getQuadratino(nuovaPos).isPrato())
		{
			campo.getQuadratino(posTesta).setToPrato();
			posTesta.spostaAl(nuovaPos);
			campo.getQuadratino(nuovaPos).setToSerpente();

		} else // if ( campo.getQuadratino(x,y).isSerpente() )// il caso rimasto è che sia
				// serpente!!
		{
			inVita = false;
			System.out.print("MORTOOOOOOOOOO ");
		}

	}

	public void run ()
	{

		while (inVita)
		{
			try
			{
				sleep(200);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			avanza();

		}

	}

	public boolean staAndandoSud ()
	{
		return (direzione == SUD);
	};

	public boolean staAndandoNord ()
	{
		return (direzione == NORD);
	};

	public boolean staAndandoEst ()
	{
		return (direzione == EST);
	};

	public boolean staAndandoOvest ()
	{
		return (direzione == OVEST);
	};

	public void vaiVersoSud ()
	{
		direzione = SUD;
	};

	public void vaiVersoNord ()
	{
		direzione = NORD;
	};

	public void vaiVersoEst ()
	{
		direzione = EST;
	};

	public void vaiVersoOvest ()
	{
		direzione = OVEST;
	};

	
	private static final PuntoDelCampo NORD  = new PuntoDelCampo (-1, 0);
	private static final PuntoDelCampo SUD   = new PuntoDelCampo ( 1, 0);
	private static final PuntoDelCampo EST   = new PuntoDelCampo ( 0, 1);
	private static final PuntoDelCampo OVEST = new PuntoDelCampo ( 0,-1);
}
