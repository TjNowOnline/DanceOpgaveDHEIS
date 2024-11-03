//Laver underklassen Breakdancer som arver fra supperklassen Dancer
public class Breakdancer extends Dancer{
    //Overskriver metoden i superklassen Dancer
    @Override
    public void dance(){
        System.out.println("Breakdancer is breakdancing");
    }
}
