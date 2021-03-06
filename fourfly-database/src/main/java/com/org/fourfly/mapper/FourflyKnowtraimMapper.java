package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKnowtraim;
import com.org.fourfly.model.FourflyKnowtraimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKnowtraimMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int insert(FourflyKnowtraim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKnowtraim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    List<FourflyKnowtraim> selectByExample(FourflyKnowtraimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    FourflyKnowtraim selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKnowtraim record, @Param("example") FourflyKnowtraimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKnowtraim record, @Param("example") FourflyKnowtraimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKnowtraim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_knowtraim
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKnowtraim record);
}