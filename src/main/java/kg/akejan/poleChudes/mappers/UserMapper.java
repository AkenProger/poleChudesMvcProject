package kg.akejan.poleChudes.mappers;

import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.models.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends BaseMapper<UsersDto, Users> {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);
}
