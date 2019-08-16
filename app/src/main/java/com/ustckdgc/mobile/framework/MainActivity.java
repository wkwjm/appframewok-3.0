package com.ustckdgc.mobile.framework;


import com.ustcinfo.mobile.platform.ability.jsbridge.BridgeWebView;
import com.ustcinfo.mobile.platform.ability.ui.WebviewActivity;

public class MainActivity extends WebviewActivity {

    /**
     *   bridgeWebView 为系统浏览器内核，框架已经做了初始化封装，开发者请慎重对其进行修改
     *   开发者可以在此方法中自定义原生交互的方法
     */
    @Override
    public void registerMethods(BridgeWebView bridgeWebView) {
    }

}
