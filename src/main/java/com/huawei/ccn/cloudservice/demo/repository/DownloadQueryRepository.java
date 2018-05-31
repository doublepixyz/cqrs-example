package com.huawei.ccn.cloudservice.demo.repository;

import com.huawei.ccn.cloudservice.demo.entity.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadQueryRepository extends JpaRepository<Download, Long> {

    Long countByAppId(String appId);
}
