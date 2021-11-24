import java.util.Objects; 
public class Snusmumrik extends Character implements Move{
    protected SNUSSTATE State;
    public Snusmumrik(String Name, PLACES Place, SNUSSTATE State){
        super(Name, Place);
        this.State = State;
    }
    public void OneAction(Integer Iter){
        if (Iter == 2) {State = SNUSSTATE.HARMONICATOPOCKET;}
    }
    @Override
    public String toString() {
        String ret = super.CharacterName;
        if (Place == PLACES.TROLLHOUSEBED) {
            ret += " лежит в кровати";
        }
        if (Place == PLACES.UNKNOWNPLACE) {
            ret += " стоит в непонятном месте";
        }
        if (State == SNUSSTATE.PLAYSONHARMONICA) {
            ret += ", играет на гармошке";
        }
        if (State == SNUSSTATE.HARMONICATOPOCKET) {
            ret += ", положил гармошку в карман";
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
