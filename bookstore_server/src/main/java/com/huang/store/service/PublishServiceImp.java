package com.huang.store.service;

import com.huang.store.entity.book.Publish;
import com.huang.store.mapper.PublishMapper;
import com.huang.store.service.imp.PublishService;
import com.huang.store.util.SnowflakeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("firstPublish")
public class PublishServiceImp implements PublishService {

    @Autowired
    SnowflakeConfig snowflakeConfig;

    @Autowired
    PublishMapper publishMapper;

    @Override
    public int addPublish(Publish publish) {
        publish.setId(snowflakeConfig.snowFlackId());
        int result = publishMapper.addPublish(publish);
        return result;
    }

    @Override
    public int deletePublish(Long id) {
        int result = publishMapper.deletePublish(id);
        return result;
    }

    @Override
    public int modifyPublish(Publish publish) {
        int result = publishMapper.modifyPublish(publish);
        return result;
    }

    @Override
    public int modifyIsShow(Long id) {
        int result = publishMapper.modifyIsShow(id);
        return result;
    }

    @Override
    public int getPublishCount() {
        return publishMapper.getPublishCount();
    }

    @Override
    public List<Publish> getPublishByPage(int page, int pageSize) {
        int start = (page-1)*pageSize;
        System.out.println(start+":"+pageSize);
        return publishMapper.getPublishByPage(start,pageSize);
    }

    @Override
    public List<String> getPublishNames() {
        return publishMapper.getPublishNames();
    }

    @Override
    public Publish getPublishById(Long id) {
        return publishMapper.getPublishById(id);
    }

    @Override
    public Publish getPublishByName(String name) {
        return publishMapper.getPublishByName(name);
    }
}
