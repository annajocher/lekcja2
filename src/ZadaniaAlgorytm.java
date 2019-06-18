public class ZadaniaAlgorytm {

    public int nieparzyste(int[] dane){
        int count=0;
        for(int i=0;i<dane.length;i++)
        if(dane[i]%2==0)count++;
        return count;

    }

    public int parzyste(int[] dane){
        int count=0;
        for(int i=0;i<dane.length;i++)
            if(dane[i]%2!=0)count++;
        return count;

    }
}
