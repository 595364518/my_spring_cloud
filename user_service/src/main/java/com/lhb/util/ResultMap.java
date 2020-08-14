package com.lhb.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:50:27 2020/8/12
 */
public class ResultMap {

    private static final Map<Integer,String> map = new HashMap<>();

    static {

        map.put(101,"操作成功");
        map.put(102,"没有数据");
        map.put(103,"操作失败");
        map.put(104,"没有权限");
        map.put(105,"非法参数");

    }

    public static String getMsg(int code){
        return map.get(code);
    }
}
