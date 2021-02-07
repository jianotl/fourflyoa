package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyHrdemint;
import com.org.fourfly.model.FourflyHrdemintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyHrdemintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int insert(FourflyHrdemint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int insertSelective(FourflyHrdemint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    List<FourflyHrdemint> selectByExample(FourflyHrdemintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    FourflyHrdemint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyHrdemint record, @Param("example") FourflyHrdemintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyHrdemint record, @Param("example") FourflyHrdemintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyHrdemint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrdemint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyHrdemint record);
}