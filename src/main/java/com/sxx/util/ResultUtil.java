package com.sxx.util;

import com.sxx.entity.Result;

/**
 * Created by songxx1989 on 2017/7/15.
 */
public class ResultUtil {
    public static Result successResult() {
        return new Result(0, "操作成功");
    }

    public static Result successResult(Object data) {
        return new Result(0, "操作成功", data);
    }
}
