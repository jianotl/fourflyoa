package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyWxtxRenlian;
import com.org.fourfly.model.FourflyWxtxRenlianExample;
import com.org.fourfly.model.FourflyWxtxRenlianKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyWxtxRenlianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(FourflyWxtxRenlianKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int insert(FourflyWxtxRenlian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int insertSelective(FourflyWxtxRenlian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    List<FourflyWxtxRenlian> selectByExample(FourflyWxtxRenlianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    FourflyWxtxRenlian selectByPrimaryKey(FourflyWxtxRenlianKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyWxtxRenlian record, @Param("example") FourflyWxtxRenlianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyWxtxRenlian record, @Param("example") FourflyWxtxRenlianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyWxtxRenlian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_wxtx_renlian
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyWxtxRenlian record);
}