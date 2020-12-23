package org.mydotey.artemis.admin.modules.svc.service.impl;

import lombok.RequiredArgsConstructor;
import me.zhengjie.utils.PageUtil;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.mydotey.artemis.admin.modules.svc.service.SvcService;
import org.mydotey.artemis.admin.modules.svc.service.dto.Svc;
import org.mydotey.artemis.admin.modules.svc.service.dto.SvcQueryCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SvcServiceImpl implements SvcService {

    private AtomicLong id = new AtomicLong();

    @Override
    public Object queryAll(SvcQueryCriteria criteria, Pageable pageable) {
        List<Svc> data = Arrays.asList(newData(), newData());
        Page<Svc> page = new PageImpl<>(data, pageable, data.size());
        return PageUtil.toPage(page);
    }

    private Svc newData() {
        Svc svc = new Svc();
        svc.setId(id.incrementAndGet());
        svc.setName("svc-" + svc.getId());
        svc.setUrl("http://localhost:8080");
        svc.setDepartment("fx");
        return svc;
    }

}
