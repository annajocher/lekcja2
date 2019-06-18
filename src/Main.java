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
        saveFile(tablos.pobierz(), "liczby_losowe.txt");
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
            for (int i = 0; i < 100; i++) dane[i] = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dane;
    }
}
