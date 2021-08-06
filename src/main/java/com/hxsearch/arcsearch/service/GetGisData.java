package com.hxsearch.arcsearch.service;

import com.hxsearch.arcsearch.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/6 11:27
 */
@Service
public class GetGisData {
    @Autowired
    CityMapper cityMapper;
    public Object getData(){
       return cityMapper.getList();
    }
}
