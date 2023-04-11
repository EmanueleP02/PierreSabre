package personnages;

public class Ronin extends Humain{
	private int honneur;
	public Ronin(String nom, int argent) {
	        super(nom,"shochu",argent);
	        this.honneur = 1;
	    }
	public void donner(Commercant beneficiaire) {
		if (this.getArgent() > 0) {
	    	this.parler(beneficiaire.getNom() + " prend ces " + this.getArgent()/10 + " sous.");
	    	beneficiaire.recevoir(this.getArgent()/10);
	    	this.perdreArgent(this.getArgent()/10);
	    }
	}
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getRep()) {
			this.parler("Je t’ai eu petit yakusa!");
			this.honneur++;
			this.gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			
		}
		else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			this.honneur--;
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
	}
}

