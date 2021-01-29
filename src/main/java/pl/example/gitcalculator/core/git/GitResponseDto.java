package pl.example.gitcalculator.core.git;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GitResponseDto {

    String id;
    String node_id;
    String avatar_url;
    String login;
    String gravatar_id;
    String url;
    String html_url;
    String followers_url;
    String following_url;
    String gists_url;
    String starred_url;
    String subscriptions_url;
    String organizations_url;
    String repos_url;
    String events_url;
    String received_events_url;
    String type;
    String site_admin;
    String name;;
    String company;
    String blog;
    String location;
    String email;
    String hireable;
    String bio;
    String twitter_username;
    Double public_repos;
    String public_gists;
    Double followers;
    String following;
    String created_at;
    String updated_at;
}
