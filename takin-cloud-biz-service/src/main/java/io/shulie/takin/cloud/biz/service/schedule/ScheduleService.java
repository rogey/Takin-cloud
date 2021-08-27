package io.shulie.takin.cloud.biz.service.schedule;

import io.shulie.takin.ext.content.enginecall.ScheduleInitParamExt;
import io.shulie.takin.ext.content.enginecall.ScheduleRunRequest;
import io.shulie.takin.ext.content.enginecall.ScheduleStartRequestExt;
import io.shulie.takin.ext.content.enginecall.ScheduleStopRequestExt;

/**
 * @Author 莫问
 * @Date 2020-05-12
 */
public interface ScheduleService {

    /**
     * 启动调度
     *
     * @param request
     */
    void startSchedule(ScheduleStartRequestExt request);

    /**
     * 停止调度
     *
     * @param request
     */
    void stopSchedule(ScheduleStopRequestExt request);

    /**
     * 调度运行
     *
     * @param request
     */
    void runSchedule(ScheduleRunRequest request);

    /**
     * 初始化回调
     *
     * @param param
     */
    void initScheduleCallback(ScheduleInitParamExt param);
}
