package com.hxsearch.arcsearch.respose;

import com.vividsolutions.jts.geom.Geometry;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/9 10:28
 */
public class CallbackAbleFeature implements Serializable {
    //记录一个要素的属性
    private Map<String, Object> attributes = new LinkedHashMap<String, Object>();
    //几何体
    private Geometry geometry = null;
    //wkt
    public String geowkt = "";
    //获取所有属性
    public Map<String, Object> getAttributes() {
        return attributes;
    }
    //设置属性的值
    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
    //设置几何体
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
    //获取几何体
    public Geometry getGeometry() {
        return geometry;
    }
    //设置单个属性
    public void setAttribute(String name, Object value) {
        this.attributes.put(name, value);
    }
    //获取单个属性的值
    public <T> T getAttribute(String name) {
        return (T) this.attributes.get(name);
    }
    //获取string类型的数据
    public String getStringAttribute(String name) {
        return String.valueOf(this.attributes.get(name));
    }
    //获取double类型的数据
    public double getDoubleAttribute(String name) {
        return Double.valueOf(this.getStringAttribute(name));
    }
}
