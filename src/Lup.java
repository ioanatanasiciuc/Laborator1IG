//MOSTENIRE , DERIVARE DIN CLASA MAMIFER

public class Lup extends Mamifer {
    public String nume = "lup";
    public int viataAni = 16;
    public int greutate= 50;
    int numarCusca = 2;
    //POLIMORFISM DINAMIC
    public void mananca() {
        System.out.println("Lupul mananca alte mamifere.");
    }
    public void catSeDeplaseaza(){
        System.out.println("Poate parcurge distante de 50 de km.");
    };
}
