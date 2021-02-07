package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKqdw;
import com.org.fourfly.model.FourflyKqdwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKqdwMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int insert(FourflyKqdw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKqdw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    List<FourflyKqdw> selectByExample(FourflyKqdwExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    FourflyKqdw selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKqdw record, @Param("example") FourflyKqdwExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKqdw record, @Param("example") FourflyKqdwExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKqdw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdw
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKqdw record);
}