/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.boot.dubbo.listener;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.common.utils.ConcurrentHashSet;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.listener.InvokerListenerAdapter;
import com.yancy.boot.dubbo.domain.ClassIdBean;
import com.yancy.boot.dubbo.domain.SpringBootStarterDobboConstants;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * dubbo 客户端订阅监听
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/19 上午10:02 $$
 */
@Activate
public class ConsumerSubscribeListener extends InvokerListenerAdapter {
  // subscribe interfaces
  public static final Set<ClassIdBean> SUBSCRIBEDINTERFACES_SET =
      new ConcurrentHashSet<ClassIdBean>();

  // connection interface name
  public static final Map<ClassIdBean, Set<String>> CONNECTION_MAP =
      new ConcurrentHashMap<ClassIdBean, Set<String>>();

  @Override
  public void referred(Invoker<?> invoker) throws RpcException {
    Class<?> anInterface = invoker.getInterface();
    URL url = invoker.getUrl();
    String group = url.getParameter(SpringBootStarterDobboConstants.GROUP);
    String version = url.getParameter(SpringBootStarterDobboConstants.VERSION);
    ClassIdBean classIdBean = new ClassIdBean(anInterface, group, version);
    SUBSCRIBEDINTERFACES_SET.add(classIdBean);
    Set<String> connectionSet = CONNECTION_MAP.get(classIdBean);
    if (connectionSet == null) {
      connectionSet = new ConcurrentHashSet<String>();
      CONNECTION_MAP.put(classIdBean, connectionSet);
    }
    connectionSet.add(invoker.getUrl().toString());
  }

  @Override
  public void destroyed(Invoker<?> invoker) {
    Class<?> anInterface = invoker.getInterface();
    URL url = invoker.getUrl();
    String group = url.getParameter(SpringBootStarterDobboConstants.GROUP);
    String version = url.getParameter(SpringBootStarterDobboConstants.VERSION);
    ClassIdBean classIdBean = new ClassIdBean(anInterface, group, version);
    SUBSCRIBEDINTERFACES_SET.remove(classIdBean);
    Set<String> connectionSet = CONNECTION_MAP.get(classIdBean);
    if (connectionSet != null) {
      connectionSet.remove(invoker.getUrl().toString());
    }
    if (connectionSet == null || connectionSet.isEmpty()) {
      CONNECTION_MAP.remove(classIdBean);
    }
  }
}
