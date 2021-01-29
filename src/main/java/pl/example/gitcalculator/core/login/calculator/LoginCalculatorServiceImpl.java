package pl.example.gitcalculator.core.login.calculator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.gitcalculator.core.git.GitHandler;
import pl.example.gitcalculator.core.git.GitResponseDto;
import pl.example.gitcalculator.core.login.counter.LoginCounterService;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class LoginCalculatorServiceImpl implements LoginCalculatorService{

    private final GitHandler gitHandler;
    private final LoginCounterService loginCounterService;
    private final LoginCalculatorMapper loginCalculatorMapper;

    @Override
    public LoginCalculatorDto calculateLogin(String login) throws IOException {
        GitResponseDto gitResponseDto = gitHandler.getGitUser(login);
        LoginCalculatorDto loginCalculatorDto = loginCalculatorMapper.mapGitResponseToLoginCalculatorDto(gitResponseDto);
        loginCounterService.createOrUpdateLoginCounter(loginCalculatorDto.getLogin());
        return loginCalculatorDto;
    }

}
