import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        TabliceLosowe tablos = new TabliceLosowe(100);
        tablos.znajdzMaxMin();
       // saveFile(tablos.pobierz(), "liczby_losowe.txt");
        int[] tab =loadData("liczby_losowe.txt");
        System.out.println(tab[99]);
        ZadaniaAlgorytm zad=new ZadaniaAlgorytm();
        System.out.println("nieparzyste "+zad.nieparzyste(tab));
        System.out.println("parzyste "+zad.parzyste(tab));


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
