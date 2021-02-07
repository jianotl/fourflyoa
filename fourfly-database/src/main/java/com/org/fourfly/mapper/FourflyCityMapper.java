package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyCity;
import com.org.fourfly.model.FourflyCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int insert(FourflyCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int insertSelective(FourflyCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    List<FourflyCity> selectByExample(FourflyCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    FourflyCity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyCity record, @Param("example") FourflyCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyCity record, @Param("example") FourflyCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_city
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyCity record);
}