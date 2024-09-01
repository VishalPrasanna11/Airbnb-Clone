package airbnbclone.backend.user.mapper;

//import airbnbclone.backend.user.application.dto.ReadUserDTO;
import airbnbclone.backend.user.domin.Authority;
import airbnbclone.backend.user.domin.User;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    //ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}