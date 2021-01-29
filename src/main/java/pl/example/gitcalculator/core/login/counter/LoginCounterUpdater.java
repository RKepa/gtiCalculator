package pl.example.gitcalculator.core.login.counter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class LoginCounterUpdater {

    private final LoginCounterRepository loginCounterRepository;

    @Transactional
    public void updateLoginCounter(LoginCounterDao loginCounterDao){
        loginCounterDao.setRequestCount(loginCounterDao.getRequestCount()+1);
        loginCounterRepository.save(loginCounterDao);
    }

}
