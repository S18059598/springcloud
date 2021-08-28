package com.sec.provoid8001.dao;

import com.sec.api.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-24 15:46:29
 */
@Mapper
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Select("select * from user where uid=#{uid}")
    User queryById(Integer uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */

    @Select("select * from user")
    List<User> queryAll();

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    @Insert("insert into user values(default,#{uname},#{upwd})")
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    @Update("update user set uname=#{uname},upwd=#{upwd} where uid=#{uid}")
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    @Delete("delete from user where uid=#{uid}")
    int deleteById(Integer uid);

}

