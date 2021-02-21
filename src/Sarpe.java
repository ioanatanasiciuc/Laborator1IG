//MOSTENIRE , DERIVARE DIN CLASA REPTILA

public class Sarpe extends Reptila {
    public String nume = "sarpe";
    public int viataAni = 8;
    public int greutate= 27;
    public int numarPicioare=0;
    int numarCusca = 4;
    //POLIMORFISM DINAMIC
    public void mananca() {
        System.out.println("Sarpele mananca mamifere mici si pasari.");
    }

}
