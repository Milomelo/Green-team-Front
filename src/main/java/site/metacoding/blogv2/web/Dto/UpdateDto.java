package site.metacoding.blogv2.web.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.blogv2.domain.user.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateDto {
    private String blogname;
    private String password;
    private String email;
    private String blogtitle;

    public User toEntity() {
        User user = new User();
        user.setBlogtitle(blogtitle);
        user.setEmail(email);
        user.setPassword(password);
        user.setBlogname(blogname);
        return user;
    }
}