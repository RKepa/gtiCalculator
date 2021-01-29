package pl.example.gitcalculator.core.login.counter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginCounterDto {

    private Long id;

    private String login;

    private Long requestCount;
}
