package sec07.chap03.ex05;

public class Main {
    public static void main(String[] args) {
        Horse<Unit> avante = new Horse<>();
        avante.setRider(new Unit());
        avante.setRider(new Knight());
        avante.setRider(new MagicKnight());

        Horse<Knight> sonata = new Horse<>();
        sonata.setRider(new Knight());
        sonata.setRider(new MagicKnight());

        Horse<MagicKnight> grandeur = new Horse<>();
        grandeur.setRider(new MagicKnight());

       /* Horse<Unit> wrongHorse1 = new Horse<Knight>();
        Horse<Knight> wrongHorse2 = new Horse<Unit>();
        avante = sonata;
        sonata = grandeur;*/

        Horse<? extends Knight> knightHorse;
        knightHorse = new Horse<Knight>();
        knightHorse = new Horse<MagicKnight>();
        knightHorse = sonata;
        knightHorse = grandeur;

        Horse <? super Knight> nonLuxuryHorse;
        nonLuxuryHorse = avante;
        nonLuxuryHorse = sonata;

        Horse<?> anyHorse;
        anyHorse = avante;
        anyHorse = sonata;
        anyHorse = grandeur;

        HorseShop.intoBestSellers(avante);
        HorseShop.intoBestSellers(sonata);

        HorseShop.intoPremiums(sonata);
        HorseShop.intoPremiums(grandeur);

        HorseShop.intoEntryLevels(avante);
        HorseShop.intoEntryLevels(sonata);
        Horse horse = new Horse();
        horse = avante;

    }
}
