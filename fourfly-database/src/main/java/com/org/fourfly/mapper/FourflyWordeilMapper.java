package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyWordeil;
import com.org.fourfly.model.FourflyWordeilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyWordeilMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int insert(FourflyWordeil record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int insertSelective(FourflyWordeil record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    List<FourflyWordeil> selectByExample(FourflyWordeilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    FourflyWordeil selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyWordeil record, @Param("example") FourflyWordeilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyWordeil record, @Param("example") FourflyWordeilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyWordeil record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordeil
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyWordeil record);
}