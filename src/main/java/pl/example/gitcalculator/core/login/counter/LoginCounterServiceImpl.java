package pl.example.gitcalculator.core.login.counter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.gitcalculator.core.login.calculator.LoginCalculatorDto;

@Service
@RequiredArgsConstructor
public class LoginCounterServiceImpl implements LoginCounterService {

    private final LoginCounterCreator loginCounterCreator;
    private final LoginCounterUpdater loginCounterUpdater;
    private final LoginCounterRepository loginCounterRepository;

    @Override
    public void createOrUpdateLoginCounter(String login) {
        loginCounterRepository.findByLogin(login).ifPresentOrElse(loginCounterUpdater::updateLoginCounter,() ->loginCounterCreator.createLoginCounter(login));
    }

}
