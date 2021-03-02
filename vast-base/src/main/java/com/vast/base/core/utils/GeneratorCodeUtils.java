package com.vast.base.core.utils;

import com.vast.base.enums.CodePrefixEnum;

import java.util.UUID;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.core.utils
 * @ClassName: GeneratorCodeUtils
 * @Author: Administrator
 * @Description: 编码自动生成器
 * @Date: 2021/3/2 10:38
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class GeneratorCodeUtils {

    public static void main(String[] args) {
       String code =  createOrderId();
       System.out.println(getUUID());
    }

    private static String createOrderId() {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId+String.format("%013d", hashCodeV);
    }

    public static String getCode(CodePrefixEnum codePrefixEnum) {
        return codePrefixEnum.getPrefix() + createOrderId();
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
