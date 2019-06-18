import java.util.Random;

public class TabliceLosowe {
    int[] tab;
    Random r = new Random();

    public TabliceLosowe(int size){
        tab = new int[size];
        losuj();
    }

    private void losuj(){
        for(int i=0; i<tab.length; i++) tab[i]=r.nextInt(1_000_000);
    }

    public int[] pobierz(){
        return tab;
    }

    public void znajdzMaxMin(){

        int min=1_000_000;
        int max=0;
        for(int e:tab){
            if(e>max)max=e; else if(e<min) min=e;

        }
        System.out.println("min "+min+" max "+max);
    }
}
