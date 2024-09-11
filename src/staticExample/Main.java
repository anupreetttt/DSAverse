package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human( 22,  "Kunal",  10000,  false);
        Human rahul = new Human ( 34,  "Rahul",  15000,  true);
        Human asdf = new Human ( 34,  "Rahul",  15000,  true);

        System.out.println(kunal.population);
        System.out.println(rahul.population);
        System.out.println(asdf.population);



    }
}
