package com.org.fourfly.model;

import java.math.BigDecimal;
import java.util.Date;

public class FourflyGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.typeid
     *
     * @mbg.generated
     */
    private Short typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.num
     *
     * @mbg.generated
     */
    private String num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.guige
     *
     * @mbg.generated
     */
    private String guige;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.xinghao
     *
     * @mbg.generated
     */
    private String xinghao;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.explain
     *
     * @mbg.generated
     */
    private String explain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.adddt
     *
     * @mbg.generated
     */
    private Date adddt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.optdt
     *
     * @mbg.generated
     */
    private Date optdt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.optid
     *
     * @mbg.generated
     */
    private Short optid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.optname
     *
     * @mbg.generated
     */
    private String optname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.stock
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.stockcs
     *
     * @mbg.generated
     */
    private Integer stockcs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fourfly_goods.comid
     *
     * @mbg.generated
     */
    private Short comid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.id
     *
     * @return the value of fourfly_goods.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.id
     *
     * @param id the value for fourfly_goods.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.typeid
     *
     * @return the value of fourfly_goods.typeid
     *
     * @mbg.generated
     */
    public Short getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.typeid
     *
     * @param typeid the value for fourfly_goods.typeid
     *
     * @mbg.generated
     */
    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.num
     *
     * @return the value of fourfly_goods.num
     *
     * @mbg.generated
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.num
     *
     * @param num the value for fourfly_goods.num
     *
     * @mbg.generated
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.name
     *
     * @return the value of fourfly_goods.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.name
     *
     * @param name the value for fourfly_goods.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.guige
     *
     * @return the value of fourfly_goods.guige
     *
     * @mbg.generated
     */
    public String getGuige() {
        return guige;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.guige
     *
     * @param guige the value for fourfly_goods.guige
     *
     * @mbg.generated
     */
    public void setGuige(String guige) {
        this.guige = guige == null ? null : guige.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.xinghao
     *
     * @return the value of fourfly_goods.xinghao
     *
     * @mbg.generated
     */
    public String getXinghao() {
        return xinghao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.xinghao
     *
     * @param xinghao the value for fourfly_goods.xinghao
     *
     * @mbg.generated
     */
    public void setXinghao(String xinghao) {
        this.xinghao = xinghao == null ? null : xinghao.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.explain
     *
     * @return the value of fourfly_goods.explain
     *
     * @mbg.generated
     */
    public String getExplain() {
        return explain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.explain
     *
     * @param explain the value for fourfly_goods.explain
     *
     * @mbg.generated
     */
    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.price
     *
     * @return the value of fourfly_goods.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.price
     *
     * @param price the value for fourfly_goods.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.unit
     *
     * @return the value of fourfly_goods.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.unit
     *
     * @param unit the value for fourfly_goods.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.adddt
     *
     * @return the value of fourfly_goods.adddt
     *
     * @mbg.generated
     */
    public Date getAdddt() {
        return adddt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.adddt
     *
     * @param adddt the value for fourfly_goods.adddt
     *
     * @mbg.generated
     */
    public void setAdddt(Date adddt) {
        this.adddt = adddt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.optdt
     *
     * @return the value of fourfly_goods.optdt
     *
     * @mbg.generated
     */
    public Date getOptdt() {
        return optdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.optdt
     *
     * @param optdt the value for fourfly_goods.optdt
     *
     * @mbg.generated
     */
    public void setOptdt(Date optdt) {
        this.optdt = optdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.optid
     *
     * @return the value of fourfly_goods.optid
     *
     * @mbg.generated
     */
    public Short getOptid() {
        return optid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.optid
     *
     * @param optid the value for fourfly_goods.optid
     *
     * @mbg.generated
     */
    public void setOptid(Short optid) {
        this.optid = optid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.optname
     *
     * @return the value of fourfly_goods.optname
     *
     * @mbg.generated
     */
    public String getOptname() {
        return optname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.optname
     *
     * @param optname the value for fourfly_goods.optname
     *
     * @mbg.generated
     */
    public void setOptname(String optname) {
        this.optname = optname == null ? null : optname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.stock
     *
     * @return the value of fourfly_goods.stock
     *
     * @mbg.generated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.stock
     *
     * @param stock the value for fourfly_goods.stock
     *
     * @mbg.generated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.stockcs
     *
     * @return the value of fourfly_goods.stockcs
     *
     * @mbg.generated
     */
    public Integer getStockcs() {
        return stockcs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.stockcs
     *
     * @param stockcs the value for fourfly_goods.stockcs
     *
     * @mbg.generated
     */
    public void setStockcs(Integer stockcs) {
        this.stockcs = stockcs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fourfly_goods.comid
     *
     * @return the value of fourfly_goods.comid
     *
     * @mbg.generated
     */
    public Short getComid() {
        return comid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fourfly_goods.comid
     *
     * @param comid the value for fourfly_goods.comid
     *
     * @mbg.generated
     */
    public void setComid(Short comid) {
        this.comid = comid;
    }
}