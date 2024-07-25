package com.rehe.modules.admin.system.dto.reqeust;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * @description
 * @author rehe
 * @date 2024/7/23
 */
@Schema(description = "角色创建对象")
@Data
public class RoleUpdateDto {

    @Schema(description = "角色ID")
    @NotNull(message = "角色ID不能为空")
    private Long id;

    @Schema(description = "名称")
    @NotBlank(message = "名称不能为空")
    @Size(min = 2,max = 20,message = "角色名称2-20字符")
    private String name;

    @Schema(description = "角色级别")
    @NotNull(message = "角色级别不能为空")
    @Min(value = 1,message = "角色级别错误>=1")
    private Integer level;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "角色范围默认=0")
    private Integer scope;

}