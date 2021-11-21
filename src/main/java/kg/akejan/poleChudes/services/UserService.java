package kg.akejan.poleChudes.services;

import kg.akejan.poleChudes.models.dtos.UsersDto;

public interface UserService extends BaseCrudService<UsersDto, Long>{
      Object checkingTheUser(UsersDto usersDto);

      boolean checkUserTheUser(UsersDto usersDto);

      UsersDto findUserByLogin(String login);


}
