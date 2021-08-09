package com.hxsearch.arcsearch.service.impl;

import com.hxsearch.arcsearch.exception.ExceptionMsg;
import com.hxsearch.arcsearch.request.QueryParameter;
import com.hxsearch.arcsearch.respose.Features;
import com.hxsearch.arcsearch.service.SpatialQueryService;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * 功能描述：
 *
 * @Author: ddw
 * @Date: 2021/8/9 15:06
 */
@Service
public class SpatialQueryServiceImpl implements SpatialQueryService {
    @Override
    public Features search(QueryParameter queryParameter) throws RemoteException, ExceptionMsg {
        return null;
    }
}
