public class Dad extends Character implements Move{
    public Dad(String Name, PLACES Place){
        super(Name, Place);
    }
    public void OneAction(Integer Iter) {

    }
    public Integer AddBeds(Integer a) {
        System.out.println(this.CharacterName + " добавляет кровать");
        return a;
    }
}