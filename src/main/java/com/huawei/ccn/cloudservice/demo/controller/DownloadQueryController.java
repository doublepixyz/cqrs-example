package com.huawei.ccn.cloudservice.demo.controller;

import com.huawei.ccn.cloudservice.demo.entity.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.huawei.ccn.cloudservice.demo.service.DownloadQueryService;

@RestController
@RequestMapping("/api/v1")
public class DownloadQueryController {

    @Autowired
    private DownloadQueryService downloadQueryService;

    @GetMapping("/downloads")
    public List<Download> findAll() {
        return downloadQueryService.findAll();
    }

    @GetMapping("/downloads/count/{app_id}")
    @ResponseBody
    public Long countByAppId(@PathVariable("app_id") Long appId) {
        return downloadQueryService.countByAppId(appId);
    }

}
