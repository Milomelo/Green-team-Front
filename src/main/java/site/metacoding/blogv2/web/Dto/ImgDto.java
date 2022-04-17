package site.metacoding.blogv2.web.Dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.blogv2.domain.user.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImgDto {
    private MultipartFile file; // form 태그 name = "file"

    public User toEntity(String imgurl) {
        User user = new User();
        user.setImgurl(imgurl);
        return user;
    }
}