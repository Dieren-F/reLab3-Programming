import java.util.Objects; 
public class Troll extends Character implements Move, Signal{
    protected Boolean Check;
    public Troll(String Name, PLACES Place){
        super(Name, Place);
        Check = false;
    }
    public void OneAction(Integer Iter){
        if (Iter == 3) {
            Check = true;
            Place = PLACES.UNDERWESTATTIC;
        }
    }
    public String Sig(String sign){
        if (Check) {
            return "Whistle Whistle Whistle Whiiiistle";
        }
        return "";
    }
    public String toString() {
        String ret = super.CharacterName;
        if (Place == PLACES.TROLLHOUSEBED) {
            ret += " лежит в кровати";
        }
        if (Place == PLACES.UNKNOWNPLACE) {
            ret += " стоит в непонятном месте";
        }
        if (Place == PLACES.UNDERWESTATTIC) {
            ret += " стоит под окошком восточной мансарды";
        }
        return ret;
    }
    @Override
    public int hashCode() { 
        return Objects.hash(this.toString()); 
    }
    @Override 
    public boolean equals(Object o) { 
        if (this == o) return true; 
        if (!(o instanceof Character)) return false; 
        Character that = (Character) o; 
        return Objects.equals(Place, that.Place); 
    }
}
