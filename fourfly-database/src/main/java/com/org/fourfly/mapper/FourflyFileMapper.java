package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyFile;
import com.org.fourfly.model.FourflyFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int insert(FourflyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int insertSelective(FourflyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    List<FourflyFile> selectByExample(FourflyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    FourflyFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyFile record, @Param("example") FourflyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyFile record, @Param("example") FourflyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_file
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyFile record);
}