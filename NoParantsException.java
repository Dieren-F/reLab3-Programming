public class NoParantsException extends RuntimeException{
    public NoParantsException() {
    }
    @Override
    public String toString() {
        return "Муми-папы нет дома";
    }
}