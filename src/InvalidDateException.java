

// Определение собственного класса исключения
class InvalidDateException extends Exception {

    public InvalidDateException(String message) {
        super(message);
    }
}