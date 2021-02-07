package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyWordxie;
import com.org.fourfly.model.FourflyWordxieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyWordxieMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int insert(FourflyWordxie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int insertSelective(FourflyWordxie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    List<FourflyWordxie> selectByExample(FourflyWordxieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    FourflyWordxie selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyWordxie record, @Param("example") FourflyWordxieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyWordxie record, @Param("example") FourflyWordxieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyWordxie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wordxie
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyWordxie record);
}