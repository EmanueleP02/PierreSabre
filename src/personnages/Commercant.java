package personnages;

public class Commercant {
    public Commercant(String nom, int argent) {
        this.;
    }

    public int seFaireExtorquer() {
        int argentPerdu = this.getArgent();
        this.perdreArgent(argentPerdu);
        this.parler("J’ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        this.gagnerArgent(argent);
        this.parler(this.getArgent() + " sous! Je te remercie généreux donateur!");
    }
}
