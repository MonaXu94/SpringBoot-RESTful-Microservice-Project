package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    //User.java file has email and UserDto file has emailAdress
    //@Mapping(source = "email", target = "emailAdd")
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
