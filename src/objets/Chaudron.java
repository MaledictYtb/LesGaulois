package objets;

public class Chaudron {

	private int quantitePotion;
	private int forcePotion;

	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		return forcePotion != 0;
	}
	
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public int prendreLouche() {
		forcePotion -= 1;
		if (forcePotion <= 0) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
