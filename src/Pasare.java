// CLASA ABSTRACTA FOLOSIND INTERFATA ANIMAL

abstract class Pasare implements Animal {

    int numarPicioare=2;
    String acoperitCu = "pene";
    String reproducerePrin = "oua";
    String nume;
    int numarCusca;
    int viataAni;
    int greutate;

    @Override
    public void date() {
        System.out.println("Datele pasarii sunt: ");
    }

    //POLIFORMISM STATIC
            @Override
              public void numeleAnimalului(String numee) {
                  this.nume=numee;
                  System.out.println("Numele pasarii este " + numee+".");
             };

            @Override
               public void numeleAnimalului() {
                System.out.println("Numele pasarii este " + nume+".");
             };

    @Override
    public void cumSeDeplaseaza() {
        System.out.println("Se deplaseaza prin zbor.");
    }

    // POLIMORFISM STATIC + DINAMIC VULTURE SI PRIMA METODA
       @Override
             public void catSeDeplaseaza(){
                    System.out.println("Poate zbura pana la "+ 5 + " km de sol.");
                };
       @Override
             public void catSeDeplaseaza(int numarKilometri){
                    System.out.println("Poate zbura pana la "+ numarKilometri + " km de sol.");
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

       //POLIMORFISM DINAMIC CU VULTURE
       @Override
               public void mananca() {
        System.out.println("Pasarea mananca seminte.");
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
