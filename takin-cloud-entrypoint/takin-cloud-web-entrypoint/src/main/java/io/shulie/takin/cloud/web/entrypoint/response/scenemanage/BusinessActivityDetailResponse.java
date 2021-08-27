package io.shulie.takin.cloud.web.entrypoint.response.scenemanage;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * @ClassName BusinessActivityDetailResult
 * @Description
 * @Author qianshui
 * @Date 2020/5/18 下午8:36
 */
@Data
public class BusinessActivityDetailResponse implements Serializable {

    private transient Long businessActivityId;

    private String businessActivityName;

    private Integer targetTPS;

    private Integer targetRT;

    private BigDecimal targetSuccessRate;

    private BigDecimal targetSA;

}
