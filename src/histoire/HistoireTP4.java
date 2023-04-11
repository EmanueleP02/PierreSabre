package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        System.out.println("(" + prof.getNom() + ") - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
        prof.acheter("boisson", 12);
        prof.boire();
        System.out.println("(" + prof.getNom() + ") - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
        prof.acheter("jeu", 2);
        System.out.println("(" + prof.getNom() + ") - J'ai " + prof.getArgent() + " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");
        Commercant marco = new Commercant ("Marco", 40);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        Yakuza yaku_le_noir = new Yakuza("Yaku le Noir", "boisson", 30, "Warsong");
        yaku_le_noir.direBonjour();
        yaku_le_noir.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
        yaku_le_noir.Extorquer(marco);
        Ronin roro = new Ronin("Roro", 60);
        roro.direBonjour();
        roro.donner(marco);
        roro.provoquer(yaku_le_noir);
    }
}

