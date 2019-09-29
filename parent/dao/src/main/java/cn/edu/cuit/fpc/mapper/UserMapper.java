package cn.edu.cuit.fpc.mapper;

import org.apache.ibatis.annotations.*;
import cn.edu.cuit.fpc.model.T_User;

import java.util.List;

public interface UserMapper {

	@Insert("insert into T_User(U_Id,U_Name,U_PassWord,U_Email,R_Id)values(default,#{name},#{password},#{email},#{r_id})")
	public void registerUser(T_User user);

	@Select("select count(*) from T_User where U_Name=#{Name}")
	public int findUserByName(@Param("Name") String userName);

	@Select("select count(*) from T_User where U_Name=#{Name} and U_PassWord=#{PassWord}")
	public int findUserByNameAndPwd(@Param("Name") String userName, @Param("PassWord") String password);

	@Select("select count(*) from T_User where U_Email=#{Email}")
	public int findUserByEmail(@Param("Email") String email);

	@Update("update T_User set U_PassWord=#{password} where U_Name=#{U_Name} ")
	public void changePasswordByUsername(@Param("password") String password, @Param("U_Name") String userName);

	@Update("update T_User set U_PassWord=#{password} where U_Email=#{email}")
	public void changePasswordByEmail(@Param("password") String password, @Param("email") String email);

	@Select("select U_Id as id,U_Name as name,U_PassWord as password,U_Email as email,R_Id as r_id from T_User")
	public List<T_User> findAll();

}
