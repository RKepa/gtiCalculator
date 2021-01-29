package pl.example.gitcalculator.core.login.calculator;

import org.springframework.stereotype.Component;
import pl.example.gitcalculator.core.git.GitResponseDto;

@Component
public class LoginCalculatorMapper {

    public LoginCalculatorDto mapGitResponseToLoginCalculatorDto(GitResponseDto gitResponseDto) {
        LoginCalculatorDto loginCalculatorDto =
            LoginCalculatorDto.builder().login(gitResponseDto.getLogin()).avatarUrl(gitResponseDto.getAvatar_url()).createdAt(gitResponseDto.getCreated_at())
                .name(gitResponseDto.getName()).id(Long.parseLong(gitResponseDto.getId())).type(gitResponseDto.getType()).build();
        loginCalculatorDto.setCalculations(getCalculated(gitResponseDto.getFollowers(), gitResponseDto.getPublic_repos()));
        return loginCalculatorDto;
    }

    private Double getCalculated(Double followers, Double publicRepos) {
        return 6 / followers * (2 + publicRepos);
    }
}
