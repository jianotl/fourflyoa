package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKqinfo;
import com.org.fourfly.model.FourflyKqinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKqinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int insert(FourflyKqinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKqinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    List<FourflyKqinfo> selectByExample(FourflyKqinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    FourflyKqinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKqinfo record, @Param("example") FourflyKqinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKqinfo record, @Param("example") FourflyKqinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKqinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKqinfo record);
}