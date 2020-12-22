package org.mydotey.artemis.admin.modules.service.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.annotation.AnonymousAccess;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Api(tags = "注册中心: 实例管理")
@RequestMapping("/api/service")
public class ServiceController {

    @ApiOperation("服务列表")
    @GetMapping(value = "/list")
    @AnonymousAccess
    public void getServices(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello, world!");
        response.getWriter().flush();
    }

}
