package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKqdkjl;
import com.org.fourfly.model.FourflyKqdkjlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKqdkjlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int insert(FourflyKqdkjl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKqdkjl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    List<FourflyKqdkjl> selectByExample(FourflyKqdkjlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    FourflyKqdkjl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKqdkjl record, @Param("example") FourflyKqdkjlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKqdkjl record, @Param("example") FourflyKqdkjlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKqdkjl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdkjl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKqdkjl record);
}