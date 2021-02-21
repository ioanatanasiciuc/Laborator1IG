//MOSTENIRE , DERIVARE DIN CLASA REPTILA

public class Crocodil extends Reptila {
    public String nume = "crocodil";
    public int viataAni = 12;
    public int greutate= 1000;
    int numarCusca = 3;
    //POLIMORFISM DINAMIC
    public void mananca() {
        System.out.println("Crocodilul mananca alte animale acvatice și terestre.");
    }

}