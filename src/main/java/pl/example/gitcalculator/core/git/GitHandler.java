package pl.example.gitcalculator.core.git;

import java.io.IOException;

public interface GitHandler {

    GitResponseDto getGitUser(String login) throws IOException;
}
