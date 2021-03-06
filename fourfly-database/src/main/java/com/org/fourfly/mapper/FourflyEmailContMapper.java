package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyEmailCont;
import com.org.fourfly.model.FourflyEmailContExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyEmailContMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int insert(FourflyEmailCont record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int insertSelective(FourflyEmailCont record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    List<FourflyEmailCont> selectByExampleWithBLOBs(FourflyEmailContExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    List<FourflyEmailCont> selectByExample(FourflyEmailContExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    FourflyEmailCont selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyEmailCont record, @Param("example") FourflyEmailContExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") FourflyEmailCont record, @Param("example") FourflyEmailContExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyEmailCont record, @Param("example") FourflyEmailContExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyEmailCont record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(FourflyEmailCont record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_email_cont
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyEmailCont record);
}