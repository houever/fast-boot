package cn.fastboot.config.aspect.log.event;

import cn.fastboot.config.aspect.log.model.SysLog;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;


/**
 * @author houqijun
 * 异步监听日志事件
 */
@Slf4j
@AllArgsConstructor
public class SysLogListener {

	@Async
	@Order
	@EventListener(SysLogEvent.class)
	public void saveSysLog(SysLogEvent event) {
		SysLog sysLog = (SysLog) event.getSource();
		log.debug("系统日志:{}",sysLog);
		//调用日志服务，持久化到数据库
	}
}
