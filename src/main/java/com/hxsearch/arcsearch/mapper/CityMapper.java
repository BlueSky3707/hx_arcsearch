package com.hxsearch.arcsearch.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/6 11:11
 */
@Repository
public interface CityMapper {
    List<Map> getList();
}
