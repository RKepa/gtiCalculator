package pl.example.gitcalculator.core.login.calculator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginCalculatorDto {

    private Long id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private String createdAt;
    private Double calculations;
}
