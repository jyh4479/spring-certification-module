package module.springcertification.dto;

import lombok.Getter;

@Getter
public class TokenInformation {
    private String accessToken;
    private String refreshToken;
}