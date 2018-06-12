/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.boot.dubbo.endpoint;

/**
 * dubbo 操作连接点
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/19 上午10:02 $$
 */
/*
@RestController
public class DubboOperationEndpoint implements MvcEndpoint {
    @Autowired
    private DubboProperties dubboProperties;

    private Registry registry;

    @RequestMapping("/online")
    public List<Map<String, String>> online() {
        List<Map<String, String>> serviceInterfaceList = new LinkedList<Map<String, String>>();
        if (!ProviderExportListener.EXPORTED_URL.isEmpty()) {
            this.init();
            for (URL url : ProviderExportListener.EXPORTED_URL) {
                this.registry.register(url);
                Map<String, String> map = url.toMap();
                serviceInterfaceList.add(map);
            }
        }
        return serviceInterfaceList;
    }

    @RequestMapping("/offline")
    public List<Map<String, String>> offline() {
        List<Map<String, String>> serviceInterfaceList = new LinkedList<Map<String, String>>();
        if (!ProviderExportListener.EXPORTED_URL.isEmpty()) {
            this.init();
            for (URL url : ProviderExportListener.EXPORTED_URL) {
                this.registry.unregister(url);
                Map<String, String> map = url.toMap();
                serviceInterfaceList.add(map);
            }
        }
        return serviceInterfaceList;
    }


    private synchronized void init() {

        if (this.registry == null) {
            ExtensionLoader<RegistryFactory> extensionLoader =
                    ExtensionLoader.getExtensionLoader(RegistryFactory.class);
            URL url = URL.valueOf(this.dubboProperties.getRegistry());
            RegistryFactory registryFactory = extensionLoader.getDefaultExtension();
            this.registry = registryFactory.getRegistry(url);
        }
    }

    @Override
    public String getPath() {
        return "dubbo";
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public Class<? extends Endpoint<?>> getEndpointType() {
        return null;
    }
}
*/
