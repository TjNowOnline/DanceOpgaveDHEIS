//Laver underklassen ElectricBoogieDancer som arver fra klassen Dancer
public class ElectricBoogieDancer extends Dancer {
    //Overskriver dance-metoden i klassen Dancer
    @Override
    public void dance() {
        System.out.println("Electric-Boogie dancer is dancing!");
    }
}
