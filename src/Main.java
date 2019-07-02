import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Map<String,Integer> uczniowie =new HashMap<>();
        uczniowie.put("Jan",15);
        uczniowie.put("Ola",15);
        uczniowie.put("Marek",13);
        uczniowie.put("Janusz",25);

        Set<String> keys=uczniowie.keySet();
        for(String imie: keys){
            System.out.println(imie + " ma "+uczniowie.get(imie)+" lat");
        }
        Collection<Integer> values=uczniowie.values();
        for(Integer wiek: values){
            System.out.println(wiek);
        }


        //Point3D p3D=new Point3D(1,1,1);

        /*
        Pesel pesel=new Pesel(12345678901L);
        Pesel pesel2=new Pesel("71052203932");
        Pesel pesel3=new Pesel("76061401543");

        assert (pesel.isMale() == false);
        assert (pesel2.isMale() == true);

        assert (pesel2.isCorrect() == true);
        assert (pesel3.isCorrect() == false);

        System.out.println("pesel "+pesel.pesel +" "+pesel.isMale());
        System.out.println("pesel2 "+pesel2.pesel+" "+pesel2.isMale());

        System.out.println("data pesel2 "+pesel2.born());

        System.out.println("data pesel2 "+pesel2.toString());
        System.out.println("data pesel3 "+pesel3.toString());

        System.out.printf("napis %s, liczba %d, z przecinkiem %.2f","napis", 2, 2.22);

*/

        /*
       KolkoKrzyzyk gra = new KolkoKrzyzyk();
       gra.graj();
       gra.drukuj();
       */

        /*
        int[] tab =loadData("liczby_losowe.txt");
        Pierwsze p = new Pierwsze();
        int licznik=0;
        for(int a :tab){
            if(p.czyPierwsza(a)) licznik++;
        }
        System.out.println("pierwszych "+licznik);
        */

        /*
        Pierwsze p = new Pierwsze();
        Scanner sc = new Scanner(System.in);
        int liczba=sc.nextInt();
        System.out.println("Liczba "+liczba);
        p.wypiszPierwsze(liczba);
        */


        /*
        TabliceLosowe tablos = new TabliceLosowe(100);
        tablos.znajdzMaxMin();
       // saveFile(tablos.pobierz(), "liczby_losowe.txt");
        int[] tab =loadData("liczby_losowe.txt");
        System.out.println(tab[99]);
        ZadaniaAlgorytm zad=new ZadaniaAlgorytm();
        System.out.println("nieparzyste "+zad.nieparzyste(tab));
        System.out.println("parzyste "+zad.parzyste(tab));
        System.out.println("niepodzielne przez 2,3,5 "+zad.niepodzielne(tab));
        System.out.println("potegi 3 "+zad.potegi3(tab));
        System.out.println("suma wszystkich cyfr "+zad.sumaCyfr(tab));
*/

    }

    public static void saveFile(int[] tab, String plik) {
        String dane = "";
        for (int e : tab) dane += e + "\n";
        try {
            Files.write(Paths.get(plik), dane.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] loadData(String plik) {
        int[] dane = new int[100];
        Scanner sc = null;
        try {
            sc = new Scanner(new File(plik));
           // while(sc.hasNextInt())
           for (int i = 0; i < 100; i++) dane[i] = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dane;
    }
}
