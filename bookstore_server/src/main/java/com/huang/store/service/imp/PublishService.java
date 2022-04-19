package com.huang.store.service.imp;

import com.huang.store.entity.book.Publish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublishService {
    int addPublish(Publish publish);
    int deletePublish(Long id);
    int modifyPublish(Publish publish);
    int modifyIsShow(Long id);
    int getPublishCount();
    List<Publish> getPublishByPage(int page, int pageSize);
    List<String> getPublishNames();
    Publish getPublishById(Long id);
    Publish getPublishByName(String name);
}
