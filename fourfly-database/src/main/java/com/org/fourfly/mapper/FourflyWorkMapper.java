package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyWork;
import com.org.fourfly.model.FourflyWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyWorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int insert(FourflyWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int insertSelective(FourflyWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    List<FourflyWork> selectByExample(FourflyWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    FourflyWork selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyWork record, @Param("example") FourflyWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyWork record, @Param("example") FourflyWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_work
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyWork record);
}