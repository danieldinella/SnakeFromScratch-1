import java.util.LinkedList;

public class Serpente extends Thread
{
	private boolean inVita;
	
	private LinkedList<PuntoDelCampo> corpo ;

	//private PuntoDelCampo posTesta;

	private PuntoDelCampo direzione;

	private Partita partita;
	
    public Serpente ( Partita p )
	{
		partita = p;
        direzione = NORD;
        
        corpo = new LinkedList<PuntoDelCampo>();
        
		PuntoDelCampo punto;
		
		punto=new PuntoDelCampo(19, 0);
		corpo.addFirst( punto );
		partita.getCampoDiGioco().getQuadratino(punto).setToSerpente();
		
		punto=new PuntoDelCampo(18, 0);
		corpo.addFirst( punto );
		partita.getCampoDiGioco().getQuadratino(punto).setToSerpente();
		
        punto=new PuntoDelCampo(17, 0);
		corpo.addFirst( punto );
		partita.getCampoDiGioco().getQuadratino(punto).setToSerpente();
		
		inVita = true;
	}

	public void avanza ()
	{
		PuntoDelCampo posTesta = corpo.getFirst();
		
		PuntoDelCampo nuovaPos = PuntoDelCampo.somma(posTesta, direzione);

        CampoDiGioco campo = partita.getCampoDiGioco();

		if (campo.getQuadratino(nuovaPos).isCibo())
		{
			System.out.print("GnamGnam ");
			
			corpo.addFirst(nuovaPos);
			campo.getQuadratino(nuovaPos).setToSerpente();
			
			partita.generaCibo();
		}

		else if (campo.getQuadratino(nuovaPos).isPrato())
		{
			corpo.addFirst(nuovaPos);
			campo.getQuadratino(nuovaPos).setToSerpente();
			
			
			campo.getQuadratino(corpo.getLast()).setToPrato();
			corpo.removeLast();


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
				sleep(100);
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
