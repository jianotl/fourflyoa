package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyAdmin;
import com.org.fourfly.model.FourflyAdminExample;
import com.org.fourfly.model.FourflyAdminKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(FourflyAdminKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int insert(FourflyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int insertSelective(FourflyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    List<FourflyAdmin> selectByExample(FourflyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    FourflyAdmin selectByPrimaryKey(FourflyAdminKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyAdmin record, @Param("example") FourflyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyAdmin record, @Param("example") FourflyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyAdmin record);
}