package account.spring.user.dto;

import lombok.Data;

@Data
public class MemberLoginRequestDto {
    private String username;
    private String password;
}
