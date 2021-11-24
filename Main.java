public class Main {
    public static void main(String[] args){
        Home h = new Home();
        h.came(new mom("Муми-Мама", PLACES.INHOUSE));
        h.came(new Dad("Муми-Папа", PLACES.INHOUSE));
        h.came(new Troll("Мумми-Троль", PLACES.INHOUSE));
        h.came(new Snusmumrik("Снусмумрик", PLACES.UNKNOWNPLACE, SNUSSTATE.PLAYSONHARMONICA));
        h.came(new Sniff("Снифф", PLACES.TROLLHOUSEBED, SNIFFSTATE.SNORESLEEP));
        


        Sniff s = new Sniff("Снифф", PLACES.TROLLHOUSEBED, SNIFFSTATE.SNORESLEEP);
        Snusmumrik snus = new Snusmumrik("Снусмумрик", PLACES.UNKNOWNPLACE, SNUSSTATE.PLAYSONHARMONICA);
        Troll t = new Troll("Мумми-Троль", PLACES.UNKNOWNPLACE);
        MummyDol d = new MummyDol();
        for (int i=1; i<4; i++) {
            s.OneAction(i);
            snus.OneAction(i);
            t.OneAction(i);
            d.OneAction(i);
            System.out.println(s.Sig(t.Sig("")));
            System.out.println(s);
            System.out.println(snus);
            System.out.println(t);
        }
    }
}