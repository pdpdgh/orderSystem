package com.yaya.permission.dao;

import com.yaya.orderApi.permissionModel.UserPermission;
import com.yaya.permission.model.UserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int countByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int deleteByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String userPermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int insert(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int insertSelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    List<UserPermission> selectByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    UserPermission selectByPrimaryKey(String userPermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserPermission record);
}