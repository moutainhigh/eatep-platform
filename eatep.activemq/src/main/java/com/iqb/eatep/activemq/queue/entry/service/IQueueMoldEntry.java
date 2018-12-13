package com.iqb.eatep.activemq.queue.entry.service;

import com.iqb.etep.common.exception.IqbException;

/**
 * 
 * Description: 队列类型服务入口
 * @author wangxinbang
 * @version 1.0
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
------------------------------------------------------------------
 * 2017年2月17日    wangxinbang       1.0        1.0 Version 
 * </pre>
 */
public interface IQueueMoldEntry {

    /**
     * 
     * Description: 获取队列服务
     * @param
     * @return IThirdEcService
     * @throws
     * @Author wangxinbang
     * Create Date: 2017年2月9日 上午10:14:54
     */
    public IQueueMoldService getQueueService() throws IqbException;

    /**
     * 
     * Description: 获取指定队列服务
     * @param
     * @return IThirdEcService
     * @throws
     * @Author wangxinbang
     * Create Date: 2017年2月9日 上午10:25:02
     */
    public IQueueMoldService getQueueService(String queueMold) throws IqbException;

}
