package com.hxsearch.arcsearch.st_geometry;

import com.hxsearch.arcsearch.mapper.ArcMapper;
import com.hxsearch.arcsearch.request.QueryParameter;
import com.hxsearch.arcsearch.respose.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/9 15:10
 */
@Component
public class ArcSearch {
    private static final Logger logger = LoggerFactory.getLogger(ArcSearch.class);
    @Resource
    ArcMapper arcMapper;
    public Features search(QueryParameter queryParameter) {
        List<Map<String, Object>> mapData= arcMapper.search(queryParameter);
        System.out.println(mapData);
        return null;
    }
}
