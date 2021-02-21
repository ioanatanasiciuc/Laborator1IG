//MOSTENIRE , DERIVARE DIN CLASA PASARE

public class Vulture extends Pasare {
    public String nume = "vulture";
    public int viataAni = 15;
    public int greutate=8;
    int numarCusca = 1;

    //POLIMORFISM DINAMIC
    public void mananca() {
        System.out.println("Vulturul mananca sobolani.");
    }
    public void catSeDeplaseaza(){
        System.out.println("Poate zbura pana la "+ 11 + " km de sol.");
    };

}