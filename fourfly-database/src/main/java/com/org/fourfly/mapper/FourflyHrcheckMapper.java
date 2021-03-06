package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyHrcheck;
import com.org.fourfly.model.FourflyHrcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyHrcheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int insert(FourflyHrcheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int insertSelective(FourflyHrcheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    List<FourflyHrcheck> selectByExample(FourflyHrcheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    FourflyHrcheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyHrcheck record, @Param("example") FourflyHrcheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyHrcheck record, @Param("example") FourflyHrcheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyHrcheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrcheck
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyHrcheck record);
}