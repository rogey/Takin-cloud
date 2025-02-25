package io.shulie.takin.cloud.open.req.report;

import lombok.Data;
import lombok.EqualsAndHashCode;
import io.shulie.takin.ext.content.user.CloudUserCommonRequestExt;

/**
 * @author 无涯
 * @date 2020/12/17 1:25 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JtlDownloadReq extends CloudUserCommonRequestExt {
    private Long sceneId;
    private Long reportId;
}
