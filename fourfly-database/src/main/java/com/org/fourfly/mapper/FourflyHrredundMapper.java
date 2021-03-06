package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyHrredund;
import com.org.fourfly.model.FourflyHrredundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyHrredundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int insert(FourflyHrredund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int insertSelective(FourflyHrredund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    List<FourflyHrredund> selectByExample(FourflyHrredundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    FourflyHrredund selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyHrredund record, @Param("example") FourflyHrredundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyHrredund record, @Param("example") FourflyHrredundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyHrredund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrredund
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyHrredund record);
}