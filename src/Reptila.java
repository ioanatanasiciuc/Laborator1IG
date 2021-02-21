// CLASA ABSTRACTA FOLOSIND INTERFATA ANIMAL
abstract class Reptila implements Animal {

        int numarPicioare = 4;
        String acoperitCu = "solzi";
        String reproducerePrin = "oua";
        String nume;
        int numarCusca;
        int viataAni;
        int greutate;

        @Override
        public void date() {
            System.out.println("Datele reptilei sunt: ");
        }

        //POLIFORMISM STATIC
        @Override
        public void numeleAnimalului(String numee) {
            this.nume = numee;
            System.out.println("Numele reptilei este " + numee + ".");
        }

        ;

        @Override
        public void numeleAnimalului() {
            System.out.println("Numele reptilei este " + nume+ " .");
        }

        ;

        @Override
        public void cumSeDeplaseaza() {
            System.out.println("Se deplaseaza prin tarat.");
        }

        // POLIMORFISM STATIC
        @Override
        public void catSeDeplaseaza() {
            System.out.println("Poate parcurge distante de 2 de km. ");
        }

        ;

        @Override
        public void catSeDeplaseaza(int numarKilometri) {
            System.out.println("Poate parcurge distante de " + numarKilometri + " de km.");
        }

        ;

        //POLIMORFISM STATIC
        @Override
        public void catePicioareAre(int numarPicioaree) {
            this.numarPicioare = numarPicioaree;
            System.out.println("Are " + numarPicioaree + " picioare.");
        }

        ;

        @Override
        public void catePicioareAre() {
            System.out.println("Are " + numarPicioare + " picioare.");
        }

        ;

        //POLIMORFISM DINAMIC CU CROCODIL + SARPE
        @Override
        public void mananca() {
            System.out.println("Reptila mananca carne cruda.");
        }

        ;


        //POLIMORFISM STATIC
        @Override
        public void ceGreutateAre(int greutatee) {
            this.greutate = greutatee;
            System.out.println("Greutatea medie este de " + greutatee + " kg.");
        }

        ;

        @Override
        public void ceGreutateAre() {
            System.out.println("Greutatea medie este de " + greutate + " kg.");
        }

        ;


        @Override
        public void acoperitaCu() {
            System.out.println("Este acoperit cu " + acoperitCu + ".");
        }

        ;

        @Override
        public void seReproducePrin() {
            System.out.println("Se reproduce prin " + reproducerePrin + ".");
        }

        ;

        @Override
        public void catDeMultTraieste(int viataAni) {
            System.out.println("Poate trai pana la " + viataAni + " ani.");
        }

        ;

        @Override
        public void seAflaInCusca(int numarCusca) {
            System.out.println("Se afla in cusca cu numarul " + numarCusca+ ".");
        }

        ;

        @Override
    public void catDeMulteAnimaleSeAfleInCusca (int numarAnimale){
        System.out.println("In aceasta cusca se afla " + numarAnimale+" animale.");
    };
    }
