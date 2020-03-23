package cn.fastboot.base.exception;

import cn.fastboot.base.result.ResultEnum;
import lombok.Data;

@Data
public class GlobalException extends RuntimeException {

    private ResultEnum resultEnum;

    public GlobalException(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }
}
