package pl.example.gitcalculator.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionMessage {


    RESOURCE_NOT_FOUND("EX_1", "Could not find object of class %s with id=%s");

    private final String code;
    private final String message;

    public String format(Object... args) {
        return String.format(message, args);
    }
}
