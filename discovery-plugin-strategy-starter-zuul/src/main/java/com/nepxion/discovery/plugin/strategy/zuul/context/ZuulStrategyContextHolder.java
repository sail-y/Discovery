package com.nepxion.discovery.plugin.strategy.zuul.context;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 *
 * @author Haojun Ren
 * @author Fan Yang
 * @version 1.0
 */

import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.servlet.http.HttpServletRequest;

public class ZuulStrategyContextHolder {

    public HttpServletRequest getRequest() {
        HttpServletRequest request = ZuulStrategyContext.getCurrentContext().getRequest();
        if (request == null) {
            request = RequestContext.getCurrentContext().getRequest();
        }

        return request;
    }
}