package com.org.fourfly.mapper;

import com.org.fourfly.model.FourflyFlowTodo;
import com.org.fourfly.model.FourflyFlowTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourflyFlowTodoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int insert(FourflyFlowTodo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int insertSelective(FourflyFlowTodo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    List<FourflyFlowTodo> selectByExample(FourflyFlowTodoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    FourflyFlowTodo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FourflyFlowTodo record, @Param("example") FourflyFlowTodoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FourflyFlowTodo record, @Param("example") FourflyFlowTodoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FourflyFlowTodo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_todo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FourflyFlowTodo record);
}