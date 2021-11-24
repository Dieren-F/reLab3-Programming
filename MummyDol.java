public class MummyDol implements Move{
    public MummyDol() {

    }
    public void OneAction(Integer Iter) {
        Move sun = new Move() {
            @Override
            public void OneAction(Integer Iter) {
                if (Iter == 1){
                    System.out.println("Солнце только что поднялось над верхушками деревьев");
                }
            }
        };
        sun.OneAction(Iter);
        river.OneAction(Iter);
    }
    public static class river{
        static ARTIFACTS artif[] = new ARTIFACTS[10];
        public river() {

        }
        public static void OneAction(Integer Iter){
            System.out.println("Река сверкает бегущей, сверкающей водой");
        }
    }
}
