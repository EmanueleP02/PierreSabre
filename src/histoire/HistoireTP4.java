package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
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
        Commercant marco = new Commercant("Marco", 40, 15)
        Yakuza yaku_le_noir = new Yakuza("Yaku Le Noir", 25, 30, "Warsong")

    
    }
}

