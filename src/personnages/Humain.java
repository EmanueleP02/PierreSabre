package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
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
        parler("(" + this.getNom() + ")" + " - " + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("(" + this.getNom() + ")" + " - " + "Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String achat, int prix) {
        if (argent >= prix) {
            perdreArgent(prix);
            parler("(" + this.getNom() + ")" + " - " + "J'ai acheté " + achat + " pour " + prix + " euros.");
        } else {
            parler("(" + this.getNom() + ")" + " - " + "Je n'ai pas assez d'argent pour acheter " + achat + ".");
        }
    }

    private void parler(String texte) {
        System.out.println(nom + " : " + texte);
    }
}

