/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.boot.dubbo.endpoint;

/**
 * dubbo 连接点
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/19 上午10:02 $$
 */

/*
@Component
public class DubboEndpoint extends AbstractEndpoint<Map<String, Object>> {
    @Autowired
    private DubboProperties dubboProperties;

    @Autowired
    private DubboMetrics dubboMetrics;

    @Override
    public Map<String, Object> invoke() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("endpoint", this.buildEndpoint());
        result.put("metrics", this.getMetrics());
        result.put("config", this.getConfig());
        result.put("runtime", this.getRuntime());
        return result;
    }

    private Object buildEndpoint() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("name", this.getName());
        result.put("version", this.getVersion());
        result.put("authors", this.getAuthors());
        result.put("docs", this.getDocs());
        result.put("scm", this.getScm());
        return result;
    }

    public DubboEndpoint() {
        super("dubbo");
    }

    public String getName() {
        return "dubbo";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public List<String> getAuthors() {
        return Collections.singletonList("ansoya <33432796@@qq.com>");
    }

    public String getDocs() {
        return "http://dubbo.io/Developer+Guide-zh.htm";
    }

    public String getScm() {
        return "";
    }

    public DubboProperties getConfig() {
        return this.dubboProperties;
    }

    public Map<String, Object> getRuntime() {
        Map<String, Object> runtimeMap = new HashMap<String, Object>();

        runtimeMap.put("appname", this.dubboProperties.getAppname());
        runtimeMap.put("registry", this.dubboProperties.getRegistry());
        runtimeMap.put("protocol", this.dubboProperties.getProtocol());
        runtimeMap.put("port", this.dubboProperties.getPort());
        runtimeMap.put("threads", this.dubboProperties.getThreads());

        // published services
        Map<ClassIdBean, Map<String, Long>> publishedInterfaceList =
                new HashMap<ClassIdBean, Map<String, Long>>();
        Set<ClassIdBean> publishedInterfaceSet = ProviderExportListener.EXPORTEDINTERFACES_SET;
        for (ClassIdBean classIdBean : publishedInterfaceSet) {
            Class<?> clazz = classIdBean.getClazz();
            String interfaceClassCanonicalName = clazz.getCanonicalName();
            if (!"void".equals(interfaceClassCanonicalName)) {
                Map<String, Long> methodNames = new HashMap<String, Long>();
                for (Method method : clazz.getMethods()) {
                    methodNames.put(method.getName(),
                            StaticsFilterHelper.getValue(classIdBean, method.getName()));
                }
                publishedInterfaceList.put(classIdBean, methodNames);
            }
        }
        if (!publishedInterfaceList.isEmpty()) {
            runtimeMap.put("publishedInterfaces", publishedInterfaceList);
        }

        // subscribed services
        Set<ClassIdBean> subscribedInterfaceSet = ConsumerSubscribeListener.SUBSCRIBEDINTERFACES_SET;
        Map<ClassIdBean, Map<String, Long>> subscribedInterfaceList =
                new HashMap<ClassIdBean, Map<String, Long>>();
        for (ClassIdBean classIdBean : subscribedInterfaceSet) {
            Map<String, Long> methodNames = new HashMap<String, Long>();
            Class<?> clazz = classIdBean.getClazz();
            for (Method method : clazz.getMethods()) {
                methodNames.put(method.getName(),
                        StaticsFilterHelper.getValue(classIdBean, method.getName()));
            }
            subscribedInterfaceList.put(classIdBean, methodNames);
        }
        if (!subscribedInterfaceList.isEmpty()) {
            runtimeMap.put("subscribedInterfaces", subscribedInterfaceList);
        }

        // consumer connections
        runtimeMap.put("connections", ConsumerSubscribeListener.CONNECTION_MAP);
        return runtimeMap;
    }

    public Map<String, Object> getMetrics() {
        Map<String, Object> metricsMap = new HashMap<String, Object>();
        Collection<Metric<?>> metrics = this.dubboMetrics.metrics();
        for (Metric<?> metric : metrics) {
            metricsMap.put(metric.getName(), metric.toString());
        }
        return metricsMap;
    }
}
*/
