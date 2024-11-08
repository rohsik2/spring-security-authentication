package nextstep.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Member {
    private final String email;
    private final String password;
    private final String name;
    private final String imageUrl;

}
