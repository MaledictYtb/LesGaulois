package objets;

import personnages.Gaulois;

public class Village {

	private String nom;
	private int nbVillageois = 0;

	private Gaulois[] villageois = new Gaulois[30];

	private Gaulois chef;

	public Village(String nom, Gaulois chef, int maxVillageois) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		villageois = new Gaulois[maxVillageois];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		}
		System.out.println("Il n'y a pas autant d'habitants dans notre vilage !");
		return null;
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + getNom() + "\" du chef " + getChef().getNom()
				+ " vivent les légendaires gaulois : ");

		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(" - " + villageois[i].getNom());
		}

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 0);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);

		village.afficherVillageois();

		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();

	}

}
