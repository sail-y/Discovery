package com.nepxion.discovery.plugin.framework.listener.loadbalance;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

import com.nepxion.discovery.plugin.framework.listener.Listener;

public interface LoadBalanceListener extends Listener {
    void onGetServers(String serviceId, List<? extends ServiceInstance> servers);
}