package kg.akejan.poleChudes.services;

import kg.akejan.poleChudes.models.dtos.QuestionsDto;
import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.models.entities.Users;

public interface UserService extends BaseCrudService<UsersDto, Long>{
      String checkingTheUser(UsersDto usersDto);



}
