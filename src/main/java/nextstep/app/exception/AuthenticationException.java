package nextstep.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class AuthenticationException extends RuntimeException{
    HttpStatus status;

    public AuthenticationException(AuthErrorCodes exceptions) {
        super(exceptions.getMessage());
        this.status = exceptions.getStatusCode();
    }

    public Map<String, String> getResponseBody() {
        return Map.of("detail", this.getMessage());
    }
}