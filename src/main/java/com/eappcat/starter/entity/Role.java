package com.eappcat.starter.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Xuan Yue Bo
 * @since 2018-05-11
 */
@Data
@Accessors(chain = true)
@TableName("tbl_role")
public class Role extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private String rolename;

}
