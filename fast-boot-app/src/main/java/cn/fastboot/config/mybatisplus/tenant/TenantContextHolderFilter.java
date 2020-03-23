package cn.fastboot.config.mybatisplus.tenant;

import cn.fastboot.base.SessionUser;
import cn.fastboot.utils.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import sun.security.util.SecurityConstants;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author houqijun
 * @date 2018/9/13
 */
@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TenantContextHolderFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String header = request.getHeader(SecurityConstants.AUTH_HEADER);
        String header = "";
        SessionUser oAuth2AccessToken = GsonUtil.gsonToBean(header, SessionUser.class);
        if (null != oAuth2AccessToken) {
            log.info("获取header中的租户ID为:{}",1);
            TenantContextHolder.setTenantId(1);
            TenantContextHolder.setUser(oAuth2AccessToken);
        } else {
            TenantContextHolder.setTenantId(1);
        }
        filterChain.doFilter(request, response);
        TenantContextHolder.clear();
    }

}
