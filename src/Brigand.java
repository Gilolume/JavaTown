
public class Brigand extends Humain
{
	private String look = "méchant";
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
	
	public String kidnapperDame()
	{
		this.damesEnleves ++;
		return "Ah ah ! " + " nom de la dame " + ", tu est mienne désormais !";
	}
	
	public String emprisonner()
	{
		return "Damned, je suis fait ! " + "non du cowboy" + ", tu m'as eu !";
	}
}
