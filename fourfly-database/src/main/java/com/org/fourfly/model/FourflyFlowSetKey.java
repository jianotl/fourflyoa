package com.org.fourfly.model;

public class FourflyFlowSetKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_flow_set.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_flow_set.num
     *
     * @mbg.generated
     */
    private String num;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_flow_set.id
     *
     * @return the value of fourfly_flow_set.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_flow_set.id
     *
     * @param id the value for fourfly_flow_set.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_flow_set.num
     *
     * @return the value of fourfly_flow_set.num
     *
     * @mbg.generated
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_flow_set.num
     *
     * @param num the value for fourfly_flow_set.num
     *
     * @mbg.generated
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }
}