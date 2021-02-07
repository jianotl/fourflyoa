package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKqsjgz;
import com.org.fourfly.model.FourflyKqsjgzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKqsjgzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int insert(FourflyKqsjgz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKqsjgz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    List<FourflyKqsjgz> selectByExample(FourflyKqsjgzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    FourflyKqsjgz selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKqsjgz record, @Param("example") FourflyKqsjgzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKqsjgz record, @Param("example") FourflyKqsjgzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKqsjgz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqsjgz
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKqsjgz record);
}