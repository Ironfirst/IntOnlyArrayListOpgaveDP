
import java.util.ArrayList;
import java.util.Arrays;

public class IntOnlyArrayList {
    int[] ia = new int[0];
    //tilføje field til at holde styr på størrelsen, eg. private int str;
    int sizeNumber;

    public IntOnlyArrayList() {
        int[] ia = new int[0];

    }

    public void add(int i) {
        //skal erstattes med kode, tilføjer en værdi samt forlænger array
        //opretter et nye array med +1 length og iterere itennem ia værdier og tilføjer dem til intA array
        //overskriver så til sidst ia med intA værdierne.

        if (ia.length == 0) {
            int[] intA = {i};
            ia = intA;
        }
//        if(ia.length==1){
//            int[] intA = {i};
//            ia=intA;
//        }
        else {
            int[] intA = new int[ia.length + 1];

            for (int j = 0; j <= ia.length - 1; j++) {
                intA[j] = ia[j];
            }
            intA[ia.length] = i;
            ia = intA;
        }
    }


    public int get(int i) {
        //skal erstattes med kode, der tilgår array
        return ia[i];
    }

    public void remove(int i) {
        //skal erstattes med kode, der tilgår array og kan fjerne en specifik index placering
        // opretter et array med den nye længde og tilføjer alle andre værdier end den valgte index
        //if(ia.length==1)
        int[] intB = new int[ia.length - 1];
        for (int a = 0; a < ia.length; a++) {
            if (a == i) {

                continue;
            }
            // laver et check på om værdien af input er lavere end den itererede værdi
            // for så at "sætte værdien fra det oprindelige array en tak længere ned"
            else {
                if (a > i) {

                    intB[a - 1] = ia[a];
                }
                // hvis det ikke er tilfældet så skal den have den samme placering i array som den oprindelige værdi
                else {

                    intB[a] = ia[a];

                }
            }
        }
        ia = intB;
    }

    public int size() {
        //skal erstattes med kode, der bruger str
        return ia.length;
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "ia=" + Arrays.toString(ia) +
                '}';
    }
    //her kan toString skrives
}