package com.prepare4j.zmy.zktest2;


import org.I0Itec.zkclient.ZkClient;

public class ZKUtil {

    public static final String FTP_CONFIG_NODE_NAME = "/config/ftp";

    public static ZkClient getZkClient() {
        return new ZkClient("localhost:2181");
    }


}