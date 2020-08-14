package com.lhb.entity;

import com.lhb.util.ResultMap;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:48:59 2020/8/12
 */
public class Result {

    private Integer code;

    private String msg;

    private Object data;

    private Integer count=0;

    public Result(Integer code) {
        this.code = code;
        this.msg = ResultMap.getMsg(code);
    }

    public Result() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
        this.msg = ResultMap.getMsg(code);
    }

    public String getMsg() {
        return msg;
    }

    @Deprecated
    public void setMsg(String msg){
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        if(data instanceof List){
            this.count = ((List) data).size();
        }else {
            this.count = 1;
        }
    }

    public Integer getCount() {
        return count;
    }

    @Deprecated
    public void setCount(Integer count) {
        this.count = count;
    }
}
