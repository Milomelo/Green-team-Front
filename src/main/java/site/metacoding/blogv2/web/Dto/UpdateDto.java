package site.metacoding.blogv2.web.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateDto {
    private String blogname;
    private String password;
    private String email;
    private String blogtitle;
    private String imgurl;
}