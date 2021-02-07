package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyReceipt;
import com.org.fourfly.model.FourflyReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyReceiptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int insert(FourflyReceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int insertSelective(FourflyReceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    List<FourflyReceipt> selectByExample(FourflyReceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    FourflyReceipt selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyReceipt record, @Param("example") FourflyReceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyReceipt record, @Param("example") FourflyReceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyReceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_receipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyReceipt record);
}