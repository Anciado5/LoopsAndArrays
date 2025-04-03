//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("zemiau ciklo");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("zemiau ciklo");

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println(i);
        }

//        extra
//        int i = 0;
//        for (; i < 5; ) {
//            i++;
//            System.out.println(i);
//        }


//        masyvai===========================================================

        int num = 20;
        int[] nums = {1, 5, 3, 7, 8, 20};
        System.out.println(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[0]);
        System.out.println(nums[5]);
//        System.out.println(nums[6]);

        nums[0] = 50;
        System.out.println(nums[0]);

        System.out.println("=====================");

        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                System.out.print(x * y + " ");
            }
            System.out.println();

        }

        System.out.println("=====================");

        for (int y = 1; y <= 10; y++) {
            String row = "";
            for (int x = 1; x <= 10; x++) {
                System.out.print(x * y + " ");
            }
            System.out.println(row);

        }
        System.out.println("\n\n===========================LOOP AND ARRAYS===================================");

//        1 uzduotis: Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        System.out.println("\n1 uzduotis =============================>>>>");

        for (int i = 0; i <= 9; i++) {
            System.out.println("labas");
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


//        4 uzduotis: Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        System.out.println("\n4 uzduotis =============================>>>>");

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }
        System.out.println("=========================================");

//        5 uzduotis: Atspausdinkite 3čio uždavinio kiekvieną augalą
//        pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        System.out.println("\n5 uzduotis =============================>>>>");

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }
        System.out.println("=========================================");

//        6 uzduotis: Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        System.out.println("\n6 uzduotis =============================>>>>");

        for (int y = 10; y <= 50; y++) {
            if (y % 2 == 0) {
                System.out.println(y);
            }
        }
        System.out.println("=========================================");

//        7 uzduotis: Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
//        Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.( naudokite continue.)
//        (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        System.out.println("\n7 uzduotis =============================>>>>");

        for (int y = 10; y <= 50; y++) {
            if (y % 10 == 0) {
                continue;
            }
            if (y % 2 == 0) {
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

        int less5 = 0;
        int more7 = 0;

        String[] plants1 = {"Monstera", "Fikusas", "Agava", "Dracena", "Kaladis", "Amarilis", "Kaktusas", "Orchideja", "Palme", "Skindapas"};

        for (int i = 0; i < plants1.length; i++){
            System.out.println(plants1[i].length());
            if (plants1[i].length() < 5){
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

        int num1 = (int) Math.round( Math.random() * 300);


        System.out.println("=========================================");

//        2 uzduotis: Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000,
//        kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais.
//        Po paskutinio skaičiaus kablelio neturi būti.

        System.out.println("\n2 uzduotis =============================>>>>");

        System.out.println("=========================================");

//        3 uzduotis: Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.
































    }


































    


}