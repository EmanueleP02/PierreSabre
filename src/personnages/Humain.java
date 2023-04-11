package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;
    private int nbConnaissance;
    private Humain[] conaissances; 
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
        this.nbConnaissance = 0;
        this.conaissances = new Humain[30];
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void perdreArgent(int perte) {
        argent -= perte;
    }

    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String achat, int prix) {
        if (argent >= prix) {
            perdreArgent(prix);
        } else {
            parler("Je n'ai pas assez d'argent pour acheter " + achat + ".");
        }
    }
    public void faireConnaissanceAvec(Humain autreHumain) {
    	this.direBonjour();
    	autreHumain.direBonjour();
    	this.memoriser(autreHumain);
    	autreHumain.memoriser(this);
    }
    public void memoriser(Humain autreHumain) {
    	this.nbConnaissance++;
    	if (this.nbConnaissance < this.conaissances.length) {
    		this.conaissances[this.nbConnaissance] = autreHumain;
    	}
    	else {
    		
    	}
    	autreHumain.memoriser(this);
    }
    public void parler(String texte) {
        System.out.println("("+nom+")" + " - " + texte);
    }
}

