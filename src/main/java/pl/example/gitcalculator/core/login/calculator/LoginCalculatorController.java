package pl.example.gitcalculator.core.login.calculator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class LoginCalculatorController {
    private final LoginCalculatorService loginCalculatorService;

    @GetMapping("/{login}")
    @ResponseStatus(OK)
    public LoginCalculatorDto calculateLogin(@PathVariable String login) throws IOException {
        return loginCalculatorService.calculateLogin(login);
    }
}
