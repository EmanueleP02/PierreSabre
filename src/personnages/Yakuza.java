package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	public Yakuza(String nom, String boisson, int argent, String clan) {
	        super(nom,boisson,argent);
	        this.reputation = 4;
	        this.clan = clan;
	    }
    public String getClan() {
        return clan;
    }
    public int getRep() {
    	return reputation;
    }
	public int Extorquer(Commercant victime) {
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	    int argentvole = victime.getArgent();
	    victime.seFaireExtorquer();
	    this.gagnerArgent(argentvole);
	    this.reputation++;
	    this.parler("J’ai piqué les " + argentvole + " sous de "+ victime.getNom() + ", ce qui me fait " + this.getArgent() +" sous dans ma poche. Hi ! Hi !");
	    return argentvole;
	}

	public int perdre() {
		int argentperdu = this.getArgent();
	    this.perdreArgent(argentperdu);
	    if (this.reputation > 0) {
	        this.reputation--;
	    }
	    this.parler("J’ai perdu mon duel et mes " + argentperdu + " sous, snif... J'ai déshonoré le clan de " + this.getClan());
	    return argentperdu;
	}
	public int gagner(int gain) {
	    this.gagnerArgent(gain);
	    this.reputation += 1;
	    this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	    return gain;
	} 
}
