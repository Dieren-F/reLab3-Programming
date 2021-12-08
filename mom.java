public class mom extends Character{
    public mom(String Name, PLACES Place){
        super(Name, Place);
    }
    public Integer AddTable(Integer a) {
        System.out.println(this.CharacterName + " добавляет место за столом");
        return a;
    }
}
