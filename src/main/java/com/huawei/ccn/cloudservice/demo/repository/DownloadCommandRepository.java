package com.huawei.ccn.cloudservice.demo.repository;

import com.huawei.ccn.cloudservice.demo.entity.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadCommandRepository extends JpaRepository<Download, Long> {
}
