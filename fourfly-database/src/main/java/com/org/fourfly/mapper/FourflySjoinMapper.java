package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflySjoin;
import com.org.fourfly.model.FourflySjoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflySjoinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int insert(FourflySjoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int insertSelective(FourflySjoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    List<FourflySjoin> selectByExample(FourflySjoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    FourflySjoin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflySjoin record, @Param("example") FourflySjoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflySjoin record, @Param("example") FourflySjoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflySjoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_sjoin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflySjoin record);
}