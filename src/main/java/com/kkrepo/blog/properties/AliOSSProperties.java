package com.kkrepo.blog.properties;

import lombok.Data;

/**
 * OSS相关配置
 * @author WangRuofei
 * @create 2020-05-24 10:02 下午
 * @copyright (c) 2020, kkrepo.com All Rights Reserved
 */
@Data
public class AliOSSProperties {

    /**
     * AccessKey
     */
    private String ak;

    /**
     * SecretKey
     */
    private String sk;

    /**
     * BucketName
     */
    private String bn;

    /**
     * 外链
     */
    private String url;


    /**
     * 地域节点
     */
    private String endPoint;

}
