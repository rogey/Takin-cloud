package io.shulie.takin.cloud.common.bean.scenemanage;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 无涯
 * @Package io.shulie.takin.cloud.common.bean.scenemanage
 * @date 2021/2/3 3:37 下午
 */
@Data
@NoArgsConstructor
public class DistributeBean {
    @ApiModelProperty(value = "分位")
    private String lable;

    @ApiModelProperty(value = "分位值")
    private String value;
}
