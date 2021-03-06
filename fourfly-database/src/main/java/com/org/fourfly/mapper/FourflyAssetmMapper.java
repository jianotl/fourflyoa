package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyAssetm;
import com.org.fourfly.model.FourflyAssetmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyAssetmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int insert(FourflyAssetm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int insertSelective(FourflyAssetm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    List<FourflyAssetm> selectByExample(FourflyAssetmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    FourflyAssetm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyAssetm record, @Param("example") FourflyAssetmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyAssetm record, @Param("example") FourflyAssetmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyAssetm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_assetm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyAssetm record);
}