package com.openim.common.zk;

import com.openim.common.util.CharsetUtil;
import com.openim.common.zk.client.CuratorZKClient;
import com.openim.common.zk.client.GenericZKClient;
import com.openim.common.zk.client.IZKClient;
import org.apache.commons.lang.NullArgumentException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shihc on 2015/8/4.
 */
public class OpenIMZKClient {
    private static final Logger LOG = LoggerFactory.getLogger(OpenIMZKClient.class);

    private static final String pathSeparator = "/";
    private static final String rootNodeName = "openIM";
    private static final String rootNodePath = pathSeparator + rootNodeName;
    private static final String rootNodeDesc = "openim根节点";
    private static final String chatServerNodeName = "chatServer";
    private static final String chatServerNodePath = rootNodePath + pathSeparator + chatServerNodeName;

    private String zkServers;
    private IZKClient zkClient;
    //private ChatServerNodeChangedListener chatServerNodeChangedListener;

    public OpenIMZKClient(String zkServers, ClientType clientType) {
        if (StringUtils.isBlank(zkServers)) {
            throw new NullArgumentException("zkServers不可为空");
        }
        this.zkServers = zkServers;
        //zkClient = new GenericZKClient();
        if(clientType == ClientType.curator){
            zkClient = new CuratorZKClient();
        }else if(clientType == ClientType.generic){
            zkClient = new GenericZKClient();
        }else{
            throw new IllegalArgumentException("zookeeper客户端类型错误：" + clientType.name());
        }

    }

    public void connectZKServer() {
        zkClient.connectZK(zkServers);
    }

    public void connectZKServer(INodeChangedListener iNodeChangedListener) {
        zkClient.connectZK(zkServers, rootNodePath, iNodeChangedListener);
    }

    public void addRootNode() {
        zkClient.addPersistNode(rootNodePath, rootNodeDesc.getBytes(CharsetUtil.utf8));
    }

    public void addChatSeverNode(byte[] data) {
        zkClient.addEphemeralSequentialNode(chatServerNodePath, data);
    }

    public enum ClientType{
        generic,
        curator
    }
}
