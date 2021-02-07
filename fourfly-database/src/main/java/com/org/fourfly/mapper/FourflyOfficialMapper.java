package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyOfficial;
import com.org.fourfly.model.FourflyOfficialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyOfficialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int insert(FourflyOfficial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int insertSelective(FourflyOfficial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    List<FourflyOfficial> selectByExampleWithBLOBs(FourflyOfficialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    List<FourflyOfficial> selectByExample(FourflyOfficialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    FourflyOfficial selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyOfficial record, @Param("example") FourflyOfficialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") FourflyOfficial record, @Param("example") FourflyOfficialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyOfficial record, @Param("example") FourflyOfficialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyOfficial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(FourflyOfficial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_official
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyOfficial record);
}