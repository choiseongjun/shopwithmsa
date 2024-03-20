package org.test.userservice.user.dto.res;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.test.userservice.user.entity.User}
 */
@Value
public class UserDto implements Serializable {
    Long userId;
    String email;
    String password;
    String nickName;
}