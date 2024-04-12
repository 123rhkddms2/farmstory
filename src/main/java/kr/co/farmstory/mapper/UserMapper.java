package kr.co.farmstory.mapper;

import kr.co.farmstory.dto.TermsDTO;
import kr.co.farmstory.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public TermsDTO selectTerms();
    public void insertUser(UserDTO userDTO);
    public int selectCountUser(@Param("type") String type, @Param("value") String value);
    public void selectUsers();
    public void deleteUser(@Param("uid") String uid);

    public void updateUserBy(@Param("type") String type, @Param("value") String value, @Param("uid") String uid);
    public void updateUserZip(UserDTO userDTO);

}