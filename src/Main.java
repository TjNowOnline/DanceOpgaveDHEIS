//Importerer ArrayList
import java.util.ArrayList;
//Main klasse til test af programmet
public class Main {
    public static void main(String[] args) {
        //Opretter en ArrayList af Dancer-objekter og tilføjer klasserne i listen
        ArrayList<Dancer> list = new ArrayList<>();
        list.add(new Dancer());
        list.add(new Breakdancer());
        list.add(new ElectricBoogieDancer());

        //For hver objekt i listen, kaldes deres dance-metode
        //Da hver klasse har en overridet metode, kaldes den samme metode i alle objekterne, men der udskrives noget forskelligt
        for (Dancer i : list) {
            i.dance();
        }
    }}