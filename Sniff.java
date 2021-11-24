import java.util.Objects; 
public class Sniff extends Character implements Move, Signal{
    protected SNIFFSTATE State;
    public Sniff(String Name, PLACES Place, SNIFFSTATE State){
        super(Name, Place);
        this.State = State;
    }
    public void OneAction(Integer Iter){
    }
    public String Sig(String sign){
        if (sign == "Whistle Whistle Whistle Whiiiistle") {
            State = SNIFFSTATE.FAKESLEEP;
            return "Муми-тролль, сунув в рот лапы, дал сигнал: три простых свистка и один долгий";
        }
        return "";
    }
    @Override
    public String toString() {
        String ret = super.CharacterName;
        if (Place == PLACES.TROLLHOUSEBED) {
            ret += " лежит в кровати";
        }
        if (State == SNIFFSTATE.SNORESLEEP) {
            ret += " храпит и спит";
        }
        if (State == SNIFFSTATE.SLEEP) {
            ret += ", спит";
        }
        if (State == SNIFFSTATE.FAKESLEEP) {
            ret += ", притворяется спящим";
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
