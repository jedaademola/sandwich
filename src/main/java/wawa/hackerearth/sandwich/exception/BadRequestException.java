package wawa.hackerearth.sandwich.exception;

import java.util.List;

public class BadRequestException extends MicroServiceException {
    private static final long serialVersionUID = 1L;

    public BadRequestException(String errorCode, String message, List<Error> errors) {
        super(errorCode, message, errors);
    }

    public BadRequestException(String errorCode, String message) {
        super(errorCode, message);
    }
}
