package org.test.userservice.user.dto.res;

import lombok.*;
import org.test.userservice.user.entity.User;

import java.io.Serializable;

/**
 * DTO for {@link org.test.userservice.user.entity.User}
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto implements Serializable {
    Long userId;
    String email;
    String password;
    String nickName;


    public static UserResponseDto fromReponseDtoUser(User user){
        return UserResponseDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .password(user.getPassword())
                .nickName(user.getNickName())
                .build();
    }
}