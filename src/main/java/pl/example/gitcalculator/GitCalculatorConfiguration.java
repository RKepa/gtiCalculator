package pl.example.gitcalculator;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitCalculatorConfiguration {

    @Bean(name="pooledClient")
    public CloseableHttpClient httpClient() {
        return HttpClientBuilder.create().build();
    }
}
