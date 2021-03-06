package cn.fastboot.config.mybatisplus.tenant;

import cn.fastboot.base.SessionUser;
import com.alibaba.ttl.TransmittableThreadLocal;
import lombok.experimental.UtilityClass;

/**
 * @author houqijun
 * @date 2018/10/4
 * 租户工具类
 */
@UtilityClass
public class TenantContextHolder {

	private final ThreadLocal<Integer> THREAD_LOCAL_TENANT = new TransmittableThreadLocal<>();
	private final ThreadLocal<SessionUser> thread_lcoal_user = new TransmittableThreadLocal<>();

	public SessionUser getUser(){
		return thread_lcoal_user.get();
	}

	public void setUser(SessionUser oauth2accessToken){
		thread_lcoal_user.set(oauth2accessToken);
	}

	/**
	 * TTL 设置租户ID
	 *
	 * @param tenantId
	 */
	public void setTenantId(Integer tenantId) {
		THREAD_LOCAL_TENANT.set(tenantId);
	}

	/**
	 * 获取TTL中的租户ID
	 *
	 * @return
	 */
	public Integer getTenantId() {
		return THREAD_LOCAL_TENANT.get();
	}

	public void clear() {
		THREAD_LOCAL_TENANT.remove();
		thread_lcoal_user.remove();
	}
}
