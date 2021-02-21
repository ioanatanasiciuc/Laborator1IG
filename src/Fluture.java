//MOSTENIRE , DERIVARE DIN CLASA INSECTA

public class Fluture extends Insecta{

        public String nume = "fluture";
        public int viataAni = 12;
        public int greutate=5;
        int numarCusca = 5;

        //POLIMORFISM DINAMIC
        public void mananca() {
            System.out.println("Fluturele mananca frunze.");
        }
        public void catSeDeplaseaza(){
            System.out.println("Poate zbura distante de 3 km.");
        };


}
