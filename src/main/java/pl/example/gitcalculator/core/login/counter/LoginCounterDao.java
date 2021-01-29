package pl.example.gitcalculator.core.login.counter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LOGIN_CALCULATORS")
public class LoginCounterDao {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc-calculator-generator")
    @SequenceGenerator(name = "acc-calculator-generator", sequenceName = "calculator_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LOGIN",unique = true)
    private String login;

    @Column(name = "REQUEST_COUNT.")
    private Long requestCount;


}
