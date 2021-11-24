public class mom extends Character implements Move{
    public mom(String Name, PLACES Place){
        super(Name, Place);
    }
    public void OneAction(Integer Iter) {
        
    }
    public Integer AddTable(Integer a) {
        System.out.println(this.CharacterName + " добавляет место за столом");
        return a;
    }
}
