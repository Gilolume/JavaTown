
public class Humain 
{
	private String nom;
	private String boissonFavorite = "Eau";
	
	
	
	public Humain(String unNom, String uneBoissonFavorite)
	{
		this.nom = unNom;
		this.boissonFavorite = uneBoissonFavorite;
	}

	public String parler(String texte)
	{
		return this.nom + " - " + texte;
	}

	public String quelEstTonNom()
	{
		return this.nom;
	}
	
	public String quelEstTaBoisson()
	{
		return this.boissonFavorite;
	}
	
	public String presentation()
	{
		return "Bonjour, je me nomme "+ quelEstTonNom() +", ah merci pour le bon verre de " + quelEstTaBoisson() + " ! GLOUPS ! "; 
	}

}
