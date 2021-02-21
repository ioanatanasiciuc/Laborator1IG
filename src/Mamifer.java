// CLASA ABSTRACTA FOLOSIND INTERFATA ANIMAL

abstract class Mamifer implements Animal {

    int numarPicioare=4;
    String acoperitCu = "blana";
    String reproducerePrin = "pui vii";
    public String nume;
    int numarCusca;
    int viataAni;
    int greutate;

    @Override
    public void date() {
        System.out.println("Datele mamiferului sunt: ");
    }

    //POLIFORMISM STATIC
    @Override
    public void numeleAnimalului(String numee) {
        this.nume=numee;
        System.out.println("Numele mamiferului este " + numee+".");
    };

    @Override
    public void numeleAnimalului() {
        System.out.println("Numele mamiferului este" + nume+".");
    };

    @Override
    public void cumSeDeplaseaza() {
        System.out.println("Se deplaseaza prin mers.");
    }

    // POLIMORFISM STATIC + DINAMIC LUP SI PRIMA METODA
    @Override
    public void catSeDeplaseaza(){
        System.out.println("Poate parcurge distante de 20 de km.");
    };
    @Override
    public void catSeDeplaseaza(int numarKilometri){
        System.out.println("Poate parcurge distante de "+ numarKilometri + "de km.");
    };

    //POLIMORFISM STATIC
    @Override
    public void catePicioareAre(int numarPicioaree) {
        this.numarPicioare= numarPicioaree;
        System.out.println("Are " + numarPicioaree + " picioare.");
    };
    @Override
    public void catePicioareAre() {
        System.out.println("Are " + numarPicioare + " picioare.");
    };

    //POLIMORFISM DINAMIC CU LUP
    @Override
    public void mananca() {
        System.out.println("Mamiferul mananca carne cruda.");
    };


    //POLIMORFISM STATIC
    @Override
    public void ceGreutateAre(int greutatee) {
        this.greutate=greutatee;
        System.out.println("Greutatea medie este de " + greutatee + " kg.");
    };

    @Override
    public void ceGreutateAre() {
        System.out.println("Greutatea medie este de " + greutate + " kg.");
    };


    @Override
    public void acoperitaCu(){
        System.out.println("Este acoperit cu " + acoperitCu + ".");
    };

    @Override
    public void seReproducePrin(){
        System.out.println("Se reproduce prin " + reproducerePrin + ".");
    };

    @Override
    public void catDeMultTraieste(int viataAni){
        System.out.println("Poate trai pana la " + viataAni + " ani.");
    };

    @Override
    public void seAflaInCusca (int numarCusca)
    {
        System.out.println("Se afla in cusca cu numarul " + numarCusca+".");
    };
   @Override
    public void catDeMulteAnimaleSeAfleInCusca (int numarAnimale){
       System.out.println("In aceasta cusca se afla " + numarAnimale+" animale.");
   };
}
