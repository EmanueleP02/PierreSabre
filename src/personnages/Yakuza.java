package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	public Yakuza(String nom, int argent, String clan) {
	        super(nom,"thé",argent);
	        this.reputation = 0;
	        this.clan = clan;
	    }

	    public int Extorquer(Commercant victime) {
	    	this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	        int argentvole = victime.getArgent();
	        victime.seFaireExtorquer();
	        this.gagnerArgent(argentvole);
	        this.reputation += 1;
	        this.parler("J’ai piqué les " + argentvole + " sous de "+ victime.getNom() + ", ce qui me fait " + this.getArgent() +" sous dans ma poche. Hi ! Hi !");
	        return argentvole;
	    }

	    public void recevoir(int argent) {
	        this.gagnerArgent(argent);
	        this.parler(this.getArgent() + " sous! Je te remercie gÃ©nÃ©reux donateur!");
	    }
}
