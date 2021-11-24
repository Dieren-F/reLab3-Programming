public class Home {
    private int table;
    private int beds;
    private int numof;
    private Character [] villagers = new Character[3];
    public Home() {
        table = 0;
        beds = 0;
        numof = 0;
    }
    public void came(Character O) {
        try {
            if (villagers.length <= numof) {
                throw new TooManyFriendsException(numof+1, villagers.length);
            }
        }
        catch (TooManyFriendsException exc) {
            System.out.println(exc);
            Character [] v = new Character[numof+1];
            for (int i=0; i<villagers.length; i++) {
                v[i] = villagers[i];
            }
            villagers = v;
        }
        finally {
            try {
                villagers[numof] = O;
                if (numof<2) {
                    throw new NoParantsException();
                }
                else{
                    table = ((mom)villagers[0]).AddTable(numof);
                    beds = ((Dad)villagers[1]).AddBeds(numof);
                }
            }
            catch (NoParantsException exc){
                System.out.println(exc);
            }
            numof++;
        }
    }
}
