
public class Brigand extends Humain
{
	private String look = "m�chant";
	private int damesEnleves;
	private int recompence = 100;
	private boolean prison;
	
	public Brigand(String unNom, String uneBoissonFavorite, int nbDamesEnleves, boolean laPrison)
	{
		super(unNom, uneBoissonFavorite);
		this.damesEnleves = nbDamesEnleves;
		this.prison = laPrison;
	}
	
	public Brigand(String unNom, String uneBoissonFavorite, int nbDamesEnleves, int uneRecompense, boolean laPrison)
	{
		super(unNom, uneBoissonFavorite);
		this.damesEnleves = nbDamesEnleves;
		this.recompence = uneRecompense;
		this.prison = laPrison;
	}
	public Brigand(String unNom, String uneBoissonFavorite, String unLook, int nbDamesEnleves, boolean laPrison)
	{
		super(unNom, uneBoissonFavorite);
		this.look = unLook;
		this.damesEnleves = nbDamesEnleves;
		this.prison = laPrison;
	}
	public Brigand(String unNom, String uneBoissonFavorite, String unLook, int nbDamesEnleves, int uneRecompense, boolean laPrison)
	{
		super(unNom, uneBoissonFavorite);
		this.look = unLook;
		this.damesEnleves = nbDamesEnleves;
		this.recompence = uneRecompense;
		this.prison = laPrison;
	}
	
	public String kidnapperDame(Dame uneDame)
	{
		this.damesEnleves ++;
		return "Ah ah ! " + uneDame.quelEstTonNom() + ", tu est mienne d�sormais !";
	}
	
	public String emprisonner(Cowboy unCowboy)
	{
		this.prison = true;
		return "Damned, je suis fait ! " + unCowboy.quelEstTonNom() + ", tu m'as eu !";
	}
}
