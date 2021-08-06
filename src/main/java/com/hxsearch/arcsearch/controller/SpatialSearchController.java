package com.hxsearch.arcsearch.controller;

import com.hxsearch.arcsearch.mapper.CityMapper;
import com.hxsearch.arcsearch.service.GetGisData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/6 10:23
 */
@RestController
@RequestMapping("rest")
public class SpatialSearchController {
    @Autowired
    GetGisData getGisData;
    @RequestMapping(value = "api/search", method = RequestMethod.GET, produces = "application/json")
    public Object getDatas(){
        return getGisData.getData();
    }
}
