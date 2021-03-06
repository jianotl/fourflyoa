package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyGoodss;
import com.org.fourfly.model.FourflyGoodssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyGoodssMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int insert(FourflyGoodss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int insertSelective(FourflyGoodss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    List<FourflyGoodss> selectByExample(FourflyGoodssExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    FourflyGoodss selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyGoodss record, @Param("example") FourflyGoodssExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyGoodss record, @Param("example") FourflyGoodssExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyGoodss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_goodss
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyGoodss record);
}