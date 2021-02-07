package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyBook;
import com.org.fourfly.model.FourflyBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int insert(FourflyBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int insertSelective(FourflyBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    List<FourflyBook> selectByExample(FourflyBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    FourflyBook selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyBook record, @Param("example") FourflyBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyBook record, @Param("example") FourflyBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_book
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyBook record);
}