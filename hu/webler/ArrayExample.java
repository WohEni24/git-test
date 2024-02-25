package hu.webler;

public class ArrayExample {

    // Mikor jó egy tömb?
    /*
   - mozi székek száma fix
   - repülő gépek ülések száma fix
   - jegy eladások ilyen fix dolgokra
     */
    public static void main(String[] args) {
        //Tömbök jele: [  ], jele előtt pedig a típusa van!
        // Tömb mindig fix méretű, előre rögzíteni kell a méretét! mérete nem változtaható! ha nagyobb kell, újat csinálsz és növeled a méretét valamint átírni
        int[] numbers = {100, 2, -3, 4}; //  a hosszát úgy is meghatározhatod, hogy elemeket adsz bele egyből! erg ez négy hosszú tömb
        int[] otherNumbers = new int[10];


        System.out.println("numbers hossza: " + numbers.length);
        System.out.println("Other numbers hossza: " + otherNumbers.length);

        boolean[] isValid = {true, true, false, false, false, true};
        String[] names = {"Anna, Béla, Cecília, Magdolna"};
        String[] text = new String[3];
        text[0] = "hello";
        text[1] = "webler";
        text[2] = "kurzus";
        System.out.println(text[0] + " " + text[1] + " " + text[2]);
        String[] weblerCurse = new String[5];
        weblerCurse[0] = " ";
        weblerCurse[1] = "!";
        weblerCurse[2] = "webler";
        weblerCurse[3] = "kurzus";
        weblerCurse[4] = "hello";
        System.out.println(weblerCurse[4] + weblerCurse[0] + weblerCurse[2] + weblerCurse[0] + weblerCurse[3] + weblerCurse[1]);
        String[] array= new String[32];
        array[2] = "szöveg";
        array[3] = "new string";
        System.out.println(array[2]);
    }
}
