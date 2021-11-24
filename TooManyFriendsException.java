public class TooManyFriendsException extends Exception{
    private int HowMany;
    private int HowManyPlaces;
    public TooManyFriendsException(int HowMany, int HowManyPlaces) {
        this.HowMany = HowMany;
        this.HowManyPlaces = HowManyPlaces;
    }
    @Override
    public String toString() {
        return "В доме всего " + HowManyPlaces + " мест, пришело всего " + HowMany + " друзей";
    }
}
