package pl.example.gitcalculator.core.login.counter;

import pl.example.gitcalculator.common.BaseEntityRepository;

import java.util.Optional;

public interface LoginCounterRepository extends BaseEntityRepository<LoginCounterDao> {

    Optional<LoginCounterDao> findByLogin(String login);
}
