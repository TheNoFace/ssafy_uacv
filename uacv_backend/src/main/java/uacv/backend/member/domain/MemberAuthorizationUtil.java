package uacv.backend.member.domain;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class MemberAuthorizationUtil {

    private MemberAuthorizationUtil() {
        throw new AssertionError();
    }

    public static String getLoginUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getName();
    }
}
