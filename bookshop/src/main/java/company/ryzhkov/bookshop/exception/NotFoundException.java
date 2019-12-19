package company.ryzhkov.bookshop.exception;

public class NotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Объект не найден";
    }
}
