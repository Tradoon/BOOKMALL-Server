package com.huang.store.util;


import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Synchronized;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * author:tradoon
 * desciption:雪花算法生成唯一id
 * date:2022
 */
@Component
public class SnowflakeConfig {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long workerID= Long.valueOf(1);// 终端id
    private Long datacenterId= Long.valueOf(1);
    private Snowflake snowflake= IdUtil.createSnowflake(workerID,datacenterId);

    @PostConstruct
    public void init(){
        workerID= NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
        // todo 将项目进化成分布式的
    }
    public synchronized long snowFlackId(){
        return snowflake.nextId();
    }
    public synchronized long snowflakeId(long workerId,long datacenterId){
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

}
