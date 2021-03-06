package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyHrshebao;
import com.org.fourfly.model.FourflyHrshebaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyHrshebaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int insert(FourflyHrshebao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int insertSelective(FourflyHrshebao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    List<FourflyHrshebao> selectByExample(FourflyHrshebaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    FourflyHrshebao selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyHrshebao record, @Param("example") FourflyHrshebaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyHrshebao record, @Param("example") FourflyHrshebaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyHrshebao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrshebao
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyHrshebao record);
}