package com.jk.dao;

import com.jk.model.ZtxRole;
import com.jk.util.ParameUtil;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ZtxRoleMapper {


    Long queryrolecount(@Param("p") ParameUtil param);

    List queryrole(@Param("rolename") String rolename, @Param("papa") int papa, @Param("pageSize") Integer pageSize);

    @Insert("insert into y_role(rolename,text,rolecount,createtime) values(#{rolename},#{text},0,sysdate())")
    void addrole(ZtxRole role);

    @Delete("delete from y_role where roleid in (${ids})")
    void deleterole(@Param("ids") String ids);

    List queryuser(@Param("username") String username, @Param("papa") int papa, @Param("pageSize") Integer pageSize);

    Long queryusercount(@Param("p") ParameUtil param);

    @Select("select * from y_role")
    List<ZtxRole> queryroleall();

    @Delete("delete from user where id in (${ids})")
    void deleteuser(@Param("ids") String ids);
}