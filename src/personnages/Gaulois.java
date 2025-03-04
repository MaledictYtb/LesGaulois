package personnages;

import objets.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force * effetPotion / 3;
		if (effetPotion > 1) {
			effetPotion--;
		}
		romain.recevoirCoup(forceCoup);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {

		System.out.println();
		System.out.print(prendreParole());
		System.out.print(" \"Bonjour, je m'appelle " + nom + ". ");

		if (village != null && village.getChef() == this) {
			System.out.print("Je suis le chef du village " + village.getNom() + "\"");
		}
		if (village != null && village.getChef() != this) {
			System.out.print("J'habite le village " + village.getNom() + "\"");
		}
		if (village == null) {
			System.out.print("Je voyage de villages en villages.\"");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

}
