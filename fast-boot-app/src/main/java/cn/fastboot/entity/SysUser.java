package cn.fastboot.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;

import cn.fastboot.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
/**
 * <p>
 * 
 * </p>
 *
 * @author HOU
 * @since 2020-03-23
 */
@Data
@Entity
@Accessors(chain = true)
@ApiModel(value = "",description = "")
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class SysUser extends BaseEntity{

private static final long serialVersionUID=1L;

            /**
     * 姓名
     */
                    @ApiModelProperty(value = "姓名",example = "姓名")
    private String name;
            /**
     * 年龄
     */
                    @ApiModelProperty(value = "年龄",example = "年龄")
    private Integer age;
            /**
     * 性别
     */
                    @ApiModelProperty(value = "性别",example = "性别")
    private String sex;



        }
