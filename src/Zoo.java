
public class Zoo
{

    public static void main (String[] args) {
        afisareInformatiiVulture();
        afisareInformatiiLup();
        afisareInformatiiCrocodil();
        afisareInformatiiSarpe();
        afisareInformatiiFluture();
    };
    public static void afisareInformatiiVulture() {
        Vulture v = new Vulture();
        v.date();
        v.numeleAnimalului(v.nume);
        v.cumSeDeplaseaza();
        v.catSeDeplaseaza();
        v.catePicioareAre();
        v.mananca();
        v.ceGreutateAre(v.greutate);
        v.acoperitaCu();
        v.seReproducePrin();
        v.catDeMultTraieste(v.viataAni);
        v.seAflaInCusca(v.numarCusca);
        v.catDeMulteAnimaleSeAfleInCusca(5);
        System.out.println(System.lineSeparator());
    };
    public static void afisareInformatiiLup()
    {
        Lup l = new Lup();
        l.date();
        l.numeleAnimalului(l.nume);
        l.cumSeDeplaseaza() ;
        l.catSeDeplaseaza();
        l.catePicioareAre();
        l.mananca();
        l.ceGreutateAre(l.greutate);
        l.acoperitaCu();
        l.seReproducePrin();
        l.catDeMultTraieste(l.viataAni);
        l.seAflaInCusca(l.numarCusca);
        l.catDeMulteAnimaleSeAfleInCusca(4);
        System.out.println(System.lineSeparator());
    };
    public static void afisareInformatiiCrocodil()
    {
        Crocodil c = new Crocodil();
        c.date();
        c.numeleAnimalului(c.nume);
        c.cumSeDeplaseaza() ;
        c.catSeDeplaseaza();
        c.catePicioareAre();
        c.mananca();
        c.ceGreutateAre(c.greutate);
        c.acoperitaCu();
        c.seReproducePrin();
        c.catDeMultTraieste(c.viataAni);
        c.seAflaInCusca(c.numarCusca);
        c.catDeMulteAnimaleSeAfleInCusca(3);
        System.out.println(System.lineSeparator());
    };
    public static void afisareInformatiiSarpe()
    {
        Sarpe s = new Sarpe();
        s.date();
        s.numeleAnimalului(s.nume);
        s.cumSeDeplaseaza() ;
        s.catSeDeplaseaza();
        s.catePicioareAre(s.numarPicioare);
        s.mananca();
        s.ceGreutateAre(s.greutate);
        s.acoperitaCu();
        s.seReproducePrin();
        s.catDeMultTraieste(s.viataAni);
        s.seAflaInCusca(s.numarCusca);
        s.catDeMulteAnimaleSeAfleInCusca(2);
        System.out.println(System.lineSeparator());
    };
    public static void afisareInformatiiFluture()
    {
        Fluture f = new Fluture();
        f.date();
        f.numeleAnimalului(f.nume);
        f.cumSeDeplaseaza() ;
        f.catSeDeplaseaza();
        f.catePicioareAre(f.numarPicioare);
        f.mananca();
        f.ceGreutateAre(f.greutate);
        f.acoperitaCu();
        f.seReproducePrin();
        f.catDeMultTraieste(f.viataAni);
        f.seAflaInCusca(f.numarCusca);
        f.catDeMulteAnimaleSeAfleInCusca(10);
        System.out.println(System.lineSeparator());
    };


}