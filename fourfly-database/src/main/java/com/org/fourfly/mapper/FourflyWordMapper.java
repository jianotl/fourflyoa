package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyWord;
import com.org.fourfly.model.FourflyWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyWordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int insert(FourflyWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int insertSelective(FourflyWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    List<FourflyWord> selectByExample(FourflyWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    FourflyWord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyWord record, @Param("example") FourflyWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyWord record, @Param("example") FourflyWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_word
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyWord record);
}