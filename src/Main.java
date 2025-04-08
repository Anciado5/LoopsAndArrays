

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("\n\n===========================LOOP AND ARRAYS===================================");

//        1 uzduotis: Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        System.out.println("\n1 uzduotis =============================>>>>");

        for (int i = 1; i <= 10; i++) {
            System.out.println("labas");//printina is naujos eilutes ==> vienoj eilutei printina PRINT
        }
        System.out.println("=========================================");

//        2 uzduotis: Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        System.out.println("\n2 uzduotis =============================>>>>");

        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
        System.out.println("=========================================");

//        3 uzduotis: Sukurkite masyvą iš dešimties augalų pavadinimų.

        String[] plants = {"Monstera", "Fikusas", "Agava", "Dracena", "Kaladis", "Amarilis", "Kaktusas", "Orchideja", "Palme", "Skindapas"};
            // [] skliaustai reiskia masyva ==> rinkinys, jis visada rasomas figuriniuose skliaustuose {}, visi elementai viduj atskiriami per kableli
            // gali nuti ir skaiciu masyvas int, double, boolean ir bet kokio kito tipo

//        4 uzduotis: Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        System.out.println("\n4 uzduotis =============================>>>>");

        for (int i = 0; i < plants.length; i++) { //plants - tai masyvas, lenth -> pasako, kiek objektu yra masyve, siuo atveju kiek augalu pavadinimu
            System.out.println(plants[i]); //printLN visad spausdina is naujos eilutes
                                    // [] lauztiniuose skliaustuose rasoma kelinta masyvo elementa norime gauti, siuo atveju visus, todel "i"
        }
        System.out.println("=========================================");

//        5 uzduotis: Atspausdinkite 3čio uždavinio kiekvieną augalą
//        pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        System.out.println("\n5 uzduotis =============================>>>>");

        for (int i = plants.length - 1; i >= 0; i--) {// plants.lenght-1 ==> nes reikia suzinoti paskutinio elemento indeksa, pirmo elemento masyve indeksas VISADA yra 0, todel paskutinio elemento indeksas yra VISADA lenght -1
            System.out.println(plants[i]);             // i>=0 ==> kadangi indeksas mazeja, paskutinis elementas atbuliniame cikle yra 0,
        }                                               // i-- ==> cia kaip ir i++, tik mazejantis
        System.out.println("=========================================");

//        6 uzduotis: Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        System.out.println("\n6 uzduotis =============================>>>>");

        for (int y = 10; y <= 50; y++) { //ciklas sukasi nuo 10 iki 50
            if (y % 2 == 0) { //salyga ==> jei skaicius dalinasi is 2 be liekanos
                System.out.println(y); //spausdinam skaiciu
            }
        }
        System.out.println("=========================================");

//        7 uzduotis: Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
//        Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.( naudokite continue.)
//        (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        System.out.println("\n7 uzduotis =============================>>>>");

        for (int y = 10; y <= 50; y++) {
            if (y % 10 == 0) {
                continue; //continue reiskia, pabaigti darba su situo ciklo elementu, nevykdant tolimesnio kodo ir pereiti prie kito ciklo
            }
            if (y % 2 == 0) { //galima rasyti be pirmo ifo ir be continue ==> parasyti viska viennoje if salygoje ==> if (y % 2 == 0 && y % 10 != 0)
                System.out.println(y);
            }
        }

        System.out.println("=========================================");

//        8 uzduotis: Sukurkite ciklą kuris suktųsi nuo 0 iki 20.
//        Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;

        System.out.println("\n8 uzduotis =============================>>>>");

        int countEven = 0;
        for (int i = 0; i <= 20; i++){
            System.out.println(i);
            if (i % 2 == 0){
                countEven++;
            }

        }
        System.out.print("Kintamojo i porines reiksmes - ");
        System.out.println(countEven);
        System.out.println("=========================================");

//        9 uzduotis: Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių
//        trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai.
//        (du skaičiavimai)

        System.out.println("\n9 uzduotis =============================>>>>");

        int less5 = 0; //sioj salygoj reikia klininti klikerius
        int more7 = 0;

        String[] plants1 = {"Monstera", "Fikusas", "Agava", "Dracena", "Kaladis", "Amarilis", "Kaktusas", "Orchideja", "Palme", "Skindapas"};

        for (int i = 0; i < plants1.length; i++){
            System.out.println(plants1[i].length());// plants1[i] yra tekstas => i-tasis masyvo elementas (siuo atveju augalu pavadinimas kazkuris tai is eiles), o length() ==> to pavadinimo raidziu kieki
            if (plants1[i].length() < 5){ //plants1[i].length() reiskia augalo pavadinimo raidziu kieki
                less5++;
            }
            if (plants1[i].length() > 7){
                more7++;
            }
        }
        System.out.println("Zodziu trumpesniu uz 5 yra " + less5);
        System.out.println("Zodziu ilgesniu uz 7 yra " + more7);
        System.out.println("=========================================");

//        10 uzduotis: Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai
//        bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)

        System.out.println("\n10 uzduotis =============================>>>>");

        int between = 0;

        String[] plants11 = {"Monstera", "Fikusas", "Agava", "Dracena", "Kaladis", "Amarilis", "Kaktusas", "Orchideja", "Palme", "Skindapas"};

        for (int i = 0; i < plants11.length; i++){
            System.out.println(plants11[i].length());
            if (plants11[i].length() > 5 && plants11[i].length() < 10){
                between++;
            }
        }
        System.out.println("Zodziu tarp 5 ir 10 yra " + between);
        System.out.println("=========================================");

        System.out.println("\n===========================SUNKESNI===================================");

//        1 uzduotis: Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
//        atspausdinkite juos atskirtus tarpais ir suskaičiuokite
//        kiek tarp jų yra didesnių už 150.
//        Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

        System.out.println("\n1 uzduotis =============================>>>>");

        int more150 = 0;

        for (int x = 0; x <= 300; x++){
            int randomNum = (int) Math.round( Math.random() * 300);
            if (randomNum > 150){
                more150++;}
            if (randomNum > 275){
                System.out.print("[" + randomNum + "]" + " ");
            }
            else{
                System.out.print(randomNum + " ");
            }
        }
        System.out.println("\n\nSkaiciu, didesniu kaip 150 yra " + more150);

        System.out.println("\n\n=========================================");


//        2 uzduotis: Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000,
//        kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais.
//        Po paskutinio skaičiaus kablelio neturi būti.

        System.out.println("\n2 uzduotis =============================>>>>");

//        mano budas//
        for (int i = 1; i <=3000 ; i++) { //sukasi ciklas nuo 1 iki 3000
            if (i % 77 == 0){ //salyga --> 1) jeigu skaicius dalinasi is 77 be liekanos
                if (i != 77){ //3)papildomai jeigu skaicius nera 77
                    System.out.print(", "); //pries skaiciu bus isspausdintas kablelis --> NES KABLELIO SOUT YRA ANKSCIAU NEGU SKAICIAUS SOUT
                }
                System.out.print(i); //2) spausdink skaiciu
            }
        }
        System.out.println();

//        kitas budas:
        String row = "";
        for (int i = 77; i < 3000; i++) {
            if (i % 77 == 0) {
                row += i + ", ";
            }
        }
        System.out.println(row.substring(0,row.length() -2));

        System.out.println("\n\n=========================================");

//        3 uzduotis: Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.

        System.out.println("\n3 uzduotis =============================>>>>");

        int n = 25; //n --> krastines ilgis 25 zvaigzdutes
        for (int x = 1; x <= n; x++) { //sukasi ciklas --> bega per 25 EILUTES
            System.out.println(); //eilutes pradzioj 25 kartus spausdiname ENTER
            for (int y = 1; y <= n; y++) { //sukasi ciklas (stulpelyje)
                System.out.print("*"); //25 kartus isspausdina * toje pacioje eiluteje
                }
        }

        System.out.println("\n\n=========================================");

//        4 uzduotis: Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.

        System.out.println("\n4 uzduotis =============================>>>>");

        int n1 = 25; //krastine 25 zvaigzdutes
        for (int x = 1; x <= n1; x++) {
            System.out.println();
            for (int y = 1; y <= n1; y++) {
                if (x == y || x + y == n1 + 1){ //papildoma salyga --> ieskome istrizaines,1) koordinate X turi buti lygi koordinatei Y ||arba|| 2) istrizainiu koordinaciu suma + 1
                    System.out.print("@");} // atitikus salygai spausdiname @
                    else{
                        System.out.print("*"); //neatitikus salygos, visur kitur spausdiname *
                    }
            }
        }

        System.out.println("\n\n=========================================");

//        5 uzduotis: Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.
//        Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas.
//        Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
//        a) Iškritus herbui;
//        b) Tris kartus iškritus herbui;
//        c) Tris kartus iš eilės iškritus herbui;

        System.out.println("\n5 uzduotis =============================>>>>");

        System.out.println("\na) Iskritus herbui =============================>>>>");

        boolean Herbas0 = false;

        while (!Herbas0){ //jeigu dar nebuvo ismestas herbas
            int coin = (int) Math.round( Math.random()); //metam moneta --> jinai ismeta 0 arba 1
            if (coin == 0){ //jeigu ismeta 0
                Herbas0 = true; //radom herba
                System.out.println("H");
            }
            else{ //jeigu neradom herbo
                System.out.println("S");
            }
        }

        System.out.println("\nb) Tris kartus iškritus herbui =============================>>>>");

        int Herbas00 = 0; //klikeris kiek krtu iskrenta herbas

        while (Herbas00 != 3){ //ciklas sukasi tol, kol neismetem 3 herbu
            int coin = (int) Math.round( Math.random()); //metam moneta --> jinai ismeta 0 arba 1
            if (coin == 0){ //jeigu 0
                System.out.println("H"); //spausdiname H
                Herbas00++; //ir kliktelname
            }
            else{  //jeigu neradome herbo (iskrito skaicius)
                System.out.println("S"); //spausdinam S
            }
        }

        System.out.println("\nc) Tris kartus iš eilės iškritus herbui =============================>>>>");

        int Herbas003 = 0; //klikeris kiek krtu IS EILES iskrenta herbas

        while (Herbas003 != 3){ //ciklas sukasi tol, kol neismetem IS EILES 3 herbu
            int coin = (int) Math.round( Math.random()); //metam moneta --> jinai ismeta 0 arba 1
            if (coin == 0){ //jeigu 0
                System.out.println("H"); //spausdiname H
                Herbas003++; //ir kliktelname
            }
            else{  //jeigu neradome herbo (iskrito skaicius)
                System.out.println("S"); //spausdinam S
                Herbas003 = 0; //nusinulina klikeris
            }
        }
        System.out.println("\n\n=========================================");

//        6 uzduotis: Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25.
//        Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: ​laimėtojo vardas​”.
//        Taškų kiekį generuokite funkcija ​Math.random()​. Žaidimą laimi tas, kas greičiau surenka 222 taškus.
//        Partijas kartoti tol, kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.

        System.out.println("\n6 uzduotis =============================>>>>");

        int KazioPoints = 0;
        int PetroPoints = 0;

        while (KazioPoints < 222 && PetroPoints < 222) { // ciklas sukasi tol. kol nesurenka 222 tasku --> negali buti <= nes tada, net ir surinkus 222 taskus ciklas suktusi dar karta
            int Kazys = (int) Math.round(Math.random() * 10) + 10; // zaidzia partijas ir renka taskus
            int Petras = (int) Math.round(Math.random() * 20) + 5; // zaidzia partijas ir renka taskus
            KazioPoints = KazioPoints + Kazys; // prie pries tai buvusios reiksmes pridek buvusia reiksme
            PetroPoints += Petras; // += reiskia -->prie pries tai buvusios reiksmes pridek nauja reiksme
            System.out.print("Kazys " + " " + KazioPoints + "(+" + Kazys + ") " + "Petras " + " " + PetroPoints + "(+" + Petras + ")" + " Partija laimejo: ");
            if (Kazys > Petras){
                System.out.println("Kazys");
            }
            else if(Petras > Kazys){
                System.out.println("Petras");
            }
            else{
                System.out.println("***LYGIOSIOS***");
            }
        }
        System.out.print("Zaidima laimejo: ");
        if (KazioPoints > PetroPoints){
            System.out.println("Kazys");
        }
        else{
            System.out.println("Petras");
        }

        System.out.println("\n\n=========================================");

//        8 uzdavinys: Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija.
//        Vinies ilgis 8.5cm (pilnai sulenda į lentą).
//        a) “Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
//        b) “Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė
//        (pasinaudokite Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.

        System.out.println("\n8 uzduotis =============================>>>>");

        System.out.println("\na) “Įkalkite” 5 vinis mažais smūgiais =============================>>>>");

        int viniesSmug = 0; //klikinsim kiek reikia smugiu 5 vinims sukalti

        for (int i = 1; i <= 5; i++) { //sukasi ciklas 5 kartus ==> kalam 5 vinis
            int SukaltoViniesIlgis = 0; //skaiciuosim iki kol pasieks 85 mm
            System.out.print("Vinis nr " + i + ": ");
            while (SukaltoViniesIlgis < 85){ // sukasi ciklas tol, kol pasiekia 85 mm
                int vinis = (int) Math.round(Math.random() * 15) + 5; // kala vini, ikala kazkiek mm
                viniesSmug++; //pripliusuojam smugius
                SukaltoViniesIlgis += vinis; //susumuojam ilgi

                System.out.print(SukaltoViniesIlgis + " ");
            }
            System.out.println();
        }
        System.out.print("\n5 vinims sukalti reikejo " + viniesSmug + " smugiu");

        System.out.println("\nb) “Įkalkite” 5 vinis dideliais smūgiais. =============================>>>>");

        int viniesSmug2 = 0; //klikinsim kiek reikia smugiu 5 vinims sukalti

        for (int i = 1; i <= 5; i++) { //sukasi ciklas 5 kartus ==> kalam 5 vinis
            int SukaltoViniesIlgis2 = 0; //skaiciuosim iki kol pasieks 85 mm
            System.out.print("Vinis nr " + i + ": ");
            while (SukaltoViniesIlgis2 < 85){ // sukasi ciklas tol, kol pasiekia 85 mm
                int pataiko = (int) Math.round( Math.random());//kala plaktuku, pataiko arba ne
                int vinis2 = (int) Math.round(Math.random() * 20) + 10; // kala plaktuku, ikala kazkiek mm
                if (pataiko == 0){
                    viniesSmug2++;
                    System.out.print("- ");
                }
                else{
                    viniesSmug2++; //pripliusuojam smugius
                    SukaltoViniesIlgis2 += vinis2; //susumuojam ilgi
                    System.out.print(SukaltoViniesIlgis2 + " ");
                }
            }
            System.out.println();
        }
        System.out.print("\n5 vinims sukalti reikejo " + viniesSmug2 + " smugiu");

        System.out.println("\n\n=========================================");





























































    }


































    


}