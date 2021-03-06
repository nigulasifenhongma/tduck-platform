package com.tduck.cloud.storage.cloud;

import com.tduck.cloud.storage.entity.enums.OssTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description: Oss配置
 * @author: smalljop
 * @create: 2018-10-18 13:53
 **/
@Data
@Component
@Slf4j
@ConfigurationProperties(prefix = "platform.oss")
public class OssStorageConfig {


    /**
     * oss 类型 参考ossconstant
     */
    private OssTypeEnum ossType;


    /**
     * 阿里云：endpoint
     */
    private String endpoint;


    /**
     * accessKeyId
     */
    private String accessKeyId;

    /**
     * accessKeySecret
     */
    private String accessKeySecret;


    /**
     * 桶名
     */
    private String bucketName;


    /**
     * 预览域名
     */
    private String domain;

}
