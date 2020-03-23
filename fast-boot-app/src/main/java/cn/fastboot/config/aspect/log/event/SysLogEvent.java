package cn.fastboot.config.aspect.log.event;

import cn.fastboot.config.aspect.log.model.SysLog;
import org.springframework.context.ApplicationEvent;

/**
 * @author houqijun
 * 系统日志事件
 */
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}
}
