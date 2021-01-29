package pl.example.gitcalculator.core.login.counter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class LoginCounterCreator {

    private final LoginCounterRepository loginCounterRepository;

    @Transactional
    public void createLoginCounter(String login) {
        loginCounterRepository.save(LoginCounterDao.builder().login(login).requestCount(1L).build());
    }


}
