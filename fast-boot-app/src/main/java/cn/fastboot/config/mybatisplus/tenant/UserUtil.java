package cn.fastboot.config.mybatisplus.tenant;

import cn.fastboot.base.SessionUser;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @program: mycloud-admin
 * @description:
 * @author: houqijun
 * @create: 2019-03-15 19:44
 **/
@Slf4j
@UtilityClass
public class UserUtil {

    public SessionUser getCurrentUser(){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
//        SessionUser oAuth2AccessToken = GsonUtil.gsonToBean(servletRequestAttributes.getRequest().getHeader(SecurityConstants.AUTH_HEADER), OAuth2AccessToken.class);
        SessionUser sessionUser = new SessionUser();
        log.debug("session 当前用户==>{}",sessionUser);
        return sessionUser;
    }


}
