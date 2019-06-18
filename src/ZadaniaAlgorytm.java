public class ZadaniaAlgorytm {

    public int nieparzyste(int[] dane){
        int count=0;
        for(int i=0;i<dane.length;i++)
        if(dane[i]%2==0)count++;
        return count;

    }

    public int niepodzielne(int[] dane){
        int count=0;
        for(int i=0;i<dane.length;i++)
            if(dane[i]%2!=0 && dane[i]%3!=0 && dane[i]%5!=0)count++;
        return count;

    }

    public int parzyste(int[] dane){
        int count=0;
        for(int i=0;i<dane.length;i++)
            if(dane[i]%2!=0)count++;
        return count;

    }
    //ilosc liczb ktore sa potega 3
    public int potegi3(int[] dane){
        int[] tab =new int[100];
        int i=0,s=3;
        do {
            tab[i]=s;
            s*=3;
            i++;
        } while(s<1000);

    int count=0;
        for(int e: dane){
            for(int a: tab){
                if(e==a){
                    count++;
                    break;
                }
            }
        }
    return count;
    }

    public int sumaCyfr(int[] dane){
        int suma =0 ;
        for(int e:dane){
            while(e>0){
                suma+=e%10;
                e/=10;
            }
        }
        return suma;
    }
}
