package org.test.userservice.user.dto.req;

import lombok.*;
import org.test.userservice.user.entity.UserRole;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link org.test.userservice.user.entity.User}
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto implements Serializable {
    String email;
    String password;
    String nickName;
//    private Set<UserRole> roles;
}