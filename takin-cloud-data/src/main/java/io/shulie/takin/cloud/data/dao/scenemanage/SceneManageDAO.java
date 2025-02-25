package io.shulie.takin.cloud.data.dao.scenemanage;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import io.shulie.takin.cloud.common.bean.scenemanage.SceneManageQueryBean;
import io.shulie.takin.cloud.data.model.mysql.SceneManageEntity;
import io.shulie.takin.cloud.data.param.scenemanage.SceneManageCreateOrUpdateParam;
import io.shulie.takin.cloud.data.result.scenemanage.SceneManageListResult;
import io.shulie.takin.cloud.data.result.scenemanage.SceneManageResult;

/**
 * @author 无涯
 * @date 2020/10/26 4:40 下午
 */
public interface SceneManageDAO extends IService<SceneManageEntity> {

    /**
     * 新增场景
     *
     * @param createParam -
     */
    Long insert(SceneManageCreateOrUpdateParam createParam);

    /**
     * 更新场景
     *
     * @param updateParam -
     */
    void update(SceneManageCreateOrUpdateParam updateParam);

    /**
     * 获取场景
     *
     * @param id -
     * @return -
     */
    SceneManageResult getSceneById(Long id);

    /**
     * 根据条件分页查询
     *
     * @param queryBean -
     * @return -
     */
    List<SceneManageResult> getPageList(SceneManageQueryBean queryBean);

    /**
     * 根据名称查询压测场景
     *
     * @param pressureTestSceneName 压测场景名称
     * @return 列表结果
     */
    SceneManageListResult queryBySceneName(String pressureTestSceneName);

    /**
     * 查询租户id下的所有压测场景
     * 注解, 自动执行数据隔离
     *
     * @return 场景列表
     */
    List<SceneManageEntity> listFromUpdateScript();

    /**
     * 查询场景
     *
     * @param sceneId -
     * @return -
     */
    SceneManageListResult querySceneManageById(Long sceneId);

    /**
     * 查询单个场景所有信息
     *
     * @param sceneId -
     * @return -
     */
    SceneManageEntity queueSceneById(Long sceneId);

}
