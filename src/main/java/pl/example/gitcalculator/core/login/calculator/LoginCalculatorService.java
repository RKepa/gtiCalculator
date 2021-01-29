package pl.example.gitcalculator.core.login.calculator;

import java.io.IOException;

public interface LoginCalculatorService {
    LoginCalculatorDto calculateLogin(String login) throws IOException;
}
