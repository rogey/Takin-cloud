package io.shulie.takin.cloud.data.param.scenemanage;

import java.io.Serializable;

import lombok.Data;

/**
 * @ClassName SceneManageQueryOpitons
 * @Description
 * @Author qianshui
 * @Date 2020/4/18 上午11:13
 */
@Data
public class SceneManageQueryParam implements Serializable {

    private static final long serialVersionUID = 5366646945677963740L;

    /**
     * 业务活动
     */
    private Boolean includeBusinessActivity = false;

    /**
     * 脚本文件
     */
    private Boolean includeScript = false;

    /**
     * SLA配置
     */
    private Boolean includeSLA = false;
}
