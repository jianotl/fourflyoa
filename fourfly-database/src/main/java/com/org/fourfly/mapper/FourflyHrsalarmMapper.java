package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyHrsalarm;
import com.org.fourfly.model.FourflyHrsalarmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyHrsalarmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int insert(FourflyHrsalarm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int insertSelective(FourflyHrsalarm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    List<FourflyHrsalarm> selectByExample(FourflyHrsalarmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    FourflyHrsalarm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyHrsalarm record, @Param("example") FourflyHrsalarmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyHrsalarm record, @Param("example") FourflyHrsalarmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyHrsalarm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalarm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyHrsalarm record);
}