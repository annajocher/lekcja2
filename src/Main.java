import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main {
    public static void main(String[] args){
       TabliceLosowe tablos=new TabliceLosowe(100);
        tablos.znajdzMaxMin();
        saveFile(tablos.pobierz(), "liczby_losowe.txt");
    }

    public static void saveFile(int[] tab, String plik){
        String dane="";
        for(int e:tab) dane+=e+"\n";
        try {
            Files.write(Paths.get(plik), dane.getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
