package com.huawei.ccn.cloudservice.demo.controller;

import com.huawei.ccn.cloudservice.demo.entity.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.huawei.ccn.cloudservice.demo.service.DownloadCommandService;

@RestController
@RequestMapping("/api/v1")
public class DownloadCommandController {

    @Autowired
    private DownloadCommandService downloadCommandService;

    @PostMapping("/downloads")
    public Download create(@RequestBody Download download) {
        return downloadCommandService.add(download);
    }
}
