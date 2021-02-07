package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyKqdisv;
import com.org.fourfly.model.FourflyKqdisvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyKqdisvMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int insert(FourflyKqdisv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int insertSelective(FourflyKqdisv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    List<FourflyKqdisv> selectByExample(FourflyKqdisvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    FourflyKqdisv selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyKqdisv record, @Param("example") FourflyKqdisvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyKqdisv record, @Param("example") FourflyKqdisvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyKqdisv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdisv
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyKqdisv record);
}