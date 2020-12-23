package org.mydotey.artemis.admin.modules.svc.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.mydotey.artemis.admin.modules.svc.service.SvcService;
import org.mydotey.artemis.admin.modules.svc.service.dto.SvcQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "注册中心: 实例管理")
@RequestMapping("/api/svc")
public class ServiceController {
    
    @Autowired
    private SvcService svcService;

    @ApiOperation(value = "查询服务")
    @GetMapping
    @PreAuthorize("@el.check('svc:list')")
    public ResponseEntity<Object> query(SvcQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(svcService.queryAll(criteria,pageable),HttpStatus.OK);
    }

}
