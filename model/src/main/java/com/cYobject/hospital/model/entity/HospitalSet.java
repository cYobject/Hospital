package com.cYobject.hospital.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 医院设置表
 * </p>
 *
 * @author author
 * @since 2022-05-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hospital_set")
@Schema(name = "HospitalSet对象", description = "医院设置表")
public class HospitalSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @Schema(name = "IP地址")
    private String ip;

    @Schema(name = "创建人")
    private String createBy;

    @Schema(name = "创建时间")
    private LocalDateTime createTime;

    @Schema(name = "更新人")
    private String updateBy;

    @Schema(name = "更新时间")
    private LocalDateTime updateTime;

    @Schema(name = "医院名称")
    private String name;

    @Schema(name = "医院编号")
    private String code;

    @Schema(name = "api基础路径")
    private String apiUrl;

    @Schema(name = "签名秘钥")
    private String signKey;

    @Schema(name = "联系人")
    private String contactsName;

    @Schema(name = "联系人手机")
    private String contactsPhone;

    @Schema(name = "状态")
    private Integer state;

    @Schema(name = "逻辑删除(1:已删除，0:未删除)")
    private Boolean deleteFlag;


}
