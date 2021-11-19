package kg.akejan.poleChudes.services.impl;

import kg.akejan.poleChudes.dao.UsersRepository;
import kg.akejan.poleChudes.enums.RoleType;
import kg.akejan.poleChudes.mappers.UserMapper;
import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper = UserMapper.USER_MAPPER;
    private UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UsersDto save(UsersDto usersDto) {
        return userMapper.toDto(userMapper.toEntity(usersDto));
    }

    @Override
    public UsersDto update(UsersDto usersDto) {
        return null;
    }

    @Override
    public List<UsersDto> findAll() {
        return userMapper.toDtoList(usersRepository.findAll());
    }

    @Override
    public UsersDto findById(Long aLong) {
        return null;
    }

    @Override
    public UsersDto deactivate(Long aLong) {
        return null;
    }


    @Override
    public String checkingTheUser(UsersDto usersDto) {
        UsersDto usersDto1 = userMapper.toDto(usersRepository.findUserByLogin(usersDto.getLogin()));
        System.out.println("NAME"+usersDto1.getName());
        if (usersDto1 != null) {
            if (usersDto1.getPassword().equals(usersDto.getPassword()) && usersDto1.getRoleType().equals(RoleType.ADMIN)) {
                return "ADMIN";
            }else if (usersDto1.getRoleType().equals(RoleType.USER)){
                return "USER";
            }
        }else {
            return new Exception("Пользовател не найден!").getMessage();
        }
        return null;
    }
}
