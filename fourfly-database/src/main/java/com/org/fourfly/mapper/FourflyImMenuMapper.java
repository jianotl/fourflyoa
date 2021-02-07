package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyImMenu;
import com.org.fourfly.model.FourflyImMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyImMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int insert(FourflyImMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int insertSelective(FourflyImMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    List<FourflyImMenu> selectByExample(FourflyImMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    FourflyImMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyImMenu record, @Param("example") FourflyImMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyImMenu record, @Param("example") FourflyImMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyImMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyImMenu record);
}