package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyMenu;
import com.org.fourfly.model.FourflyMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int insert(FourflyMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int insertSelective(FourflyMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    List<FourflyMenu> selectByExample(FourflyMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    FourflyMenu selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyMenu record, @Param("example") FourflyMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyMenu record, @Param("example") FourflyMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyMenu record);
}