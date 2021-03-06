package com.jk.dao;

import com.jk.model.ZtxUserRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ZtxUserRoleMapper {

    @Select("select roleid from y_user_role where userid=#{id}")
    List<String> queryrolebyid(Integer id);

    @Delete("delete from y_user_role where userid=#{id}")
    int deleterole(Integer id);

    @Insert("insert into y_user_role(userid,roleid) values(#{userid},#{roleid})")
    int addurm(ZtxUserRole rpm);

    @Update("update user set status=#{i} where id=#{id}")
    void updatestatus(Integer id, int i);
}