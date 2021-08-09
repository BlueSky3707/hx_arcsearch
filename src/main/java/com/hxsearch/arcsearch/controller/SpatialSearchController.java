package com.hxsearch.arcsearch.controller;

import com.hxsearch.arcsearch.mapper.CityMapper;
import com.hxsearch.arcsearch.respose.ApiResult;
import com.hxsearch.arcsearch.service.GetGisData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/6 10:23
 */
@RestController
@RequestMapping("rest")
@Api(tags ="空间数据查询REST实现")
public class SpatialSearchController {
    @RequestMapping(value = "api/search", method = RequestMethod.GET, produces = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", name = "layerName", required = true, dataType = "String", value = "空间数据库中的图层名称"),
            @ApiImplicitParam(paramType = "query", name = "filter", required = false, dataType = "String", value = "属性过滤条件，语法请参考SQL，例如：LXBM='G45' AND SXXFX=1"),
            @ApiImplicitParam(paramType = "query", name = "spatialFilter", required = false, dataType = "String", value = "空间过滤条件，标准的WKT"),
            @ApiImplicitParam(paramType = "query", name = "outFields", required = false, dataType = "String", value = "查询返回的字段,例如：LXBM,LXMC"),
            @ApiImplicitParam(paramType = "query", name = "isReturnGeometry", required = true, dataType = "Boolean", value = "是否返回空间数据"),
            @ApiImplicitParam(paramType = "query", name = "orderByFields", required = false, dataType = "String", value = "排序条件，语法参考SQL，例如：ORDER BY NAME DESC"),
            @ApiImplicitParam(paramType = "query", name = "spatialRel", required = true, dataType = "String", allowableValues = "INTERSECTS,CONTAINS,DISJOINT,TOUCHES,CROSSES,WITHIN,OVERLAPS", value = "空间位置关系"),
            @ApiImplicitParam(paramType = "query", name = "current", required = false, dataType = "String", value = "分页参数，第几页，不传此参数默认不分页，开始页数为1"),
            @ApiImplicitParam(paramType = "query", name = "limit", required = false, dataType = "String", value = "每页记录数，此参数可选，默认为全部")})
    public ApiResult search(@RequestParam(value = "layerName", required = true) String layerName,
                            @RequestParam(value = "filter", required = false) String filter,
                            @RequestParam(value = "spatialFilter", required = false) String spatialFilter,
                            @RequestParam(value = "outFields", required = false) String outFields,
                            @RequestParam(value = "isReturnGeometry", required = true) Boolean isReturnGeometry,
                            @RequestParam(value = "orderByFields", required = false) String orderByFields,
                            @RequestParam(value = "spatialRel", required = false) String spatialRel,
                            @RequestParam(value = "current", required = false, defaultValue = "1") Integer current,
                            @RequestParam(value = "limit", required = false, defaultValue = "-1") Integer limit){
        System.out.println(spatialFilter);
        ApiResult apiData=new ApiResult();
        return null;
    }
}
