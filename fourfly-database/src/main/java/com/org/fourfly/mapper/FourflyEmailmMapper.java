package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyEmailm;
import com.org.fourfly.model.FourflyEmailmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyEmailmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int insert(FourflyEmailm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int insertSelective(FourflyEmailm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    List<FourflyEmailm> selectByExampleWithBLOBs(FourflyEmailmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    List<FourflyEmailm> selectByExample(FourflyEmailmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    FourflyEmailm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyEmailm record, @Param("example") FourflyEmailmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") FourflyEmailm record, @Param("example") FourflyEmailmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyEmailm record, @Param("example") FourflyEmailmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyEmailm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(FourflyEmailm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_emailm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyEmailm record);
}