package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyImGroup;
import com.org.fourfly.model.FourflyImGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyImGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int insert(FourflyImGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int insertSelective(FourflyImGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    List<FourflyImGroup> selectByExample(FourflyImGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    FourflyImGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyImGroup record, @Param("example") FourflyImGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyImGroup record, @Param("example") FourflyImGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyImGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_im_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyImGroup record);
}