package pl.example.gitcalculator.core.git;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class GitHandlerImpl implements GitHandler {

    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    @Value("${project.gitUrl}")
    private String gitUrl;

    @Override
    public GitResponseDto getGitUser(String login) throws IOException {
        HttpGet request = new HttpGet(gitUrl + login);
        CloseableHttpResponse response = httpClient.execute(request);
        return objectMapper.readValue(response.getEntity().getContent(), GitResponseDto.class);

    }
}
