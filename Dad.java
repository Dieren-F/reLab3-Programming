public class Dad extends Character{
    public Dad(String Name, PLACES Place){
        super(Name, Place);
    }
    public Integer AddBeds(Integer a) {
        System.out.println(this.CharacterName + " добавляет кровать");
        return a;
    }
}