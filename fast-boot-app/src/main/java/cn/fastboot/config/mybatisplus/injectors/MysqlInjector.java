package cn.fastboot.config.mybatisplus.injectors;

import cn.fastboot.config.mybatisplus.injectors.methods.FindAll;
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.injector.methods.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author houqj
 * @date 2019-12-27 16:27
 */
@Component
public class MysqlInjector extends AbstractSqlInjector {
    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        List<AbstractMethod> methodList = getMethodList(mapperClass);
        methodList.add(new FindAll());
        return methodList;
    }
}
