package io.shulie.takin.cloud.data.dao.middleware;

import java.util.List;

import io.shulie.takin.cloud.data.param.middleware.CreateMiddleWareJarParam;
import io.shulie.takin.cloud.data.result.middleware.MiddlewareJarResult;

/**
 * 中间件包表(MiddlewareJar)表数据库 dao
 *
 * @author liuchuan
 * @since 2021-06-01 10:41:18
 */
public interface MiddlewareJarDAO {

    /**
     * 批量创建
     *
     * @param createParams 创建参数
     * @return 是否成功
     */
    boolean saveBatch(List<CreateMiddleWareJarParam> createParams);

    /**
     * 通过 avgList 批量删除
     *
     * @param agvList artifactId_groupId_version 列表
     */
    boolean removeByAgvList(List<String> agvList);

    /**
     * 通过 artifactIds 查询列表
     *
     * @param artifactIds artifactIds
     * @return 列表
     */
    List<MiddlewareJarResult> listByArtifactIds(List<String> artifactIds);

}

