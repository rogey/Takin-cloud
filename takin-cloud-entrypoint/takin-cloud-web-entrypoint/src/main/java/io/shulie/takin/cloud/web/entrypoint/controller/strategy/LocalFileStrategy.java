package io.shulie.takin.cloud.web.entrypoint.controller.strategy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author HengYu
 * @className DownloadFileStrategy
 * @date 2021/3/25 3:41 下午
 * @description 文件位置管理策略
 */

@Component
public class LocalFileStrategy {

    @Value("${script.temp.path}")
    private String tempPath;

    @Value("${script.path}")
    private String scriptPath;

    @Value("${nfs.file.dir}")
    private String nfsFileDir;

    /**
     * 文件路径是否管理策略
     * @param filePath 文件路径
     * @return
     */
    public boolean filePathValidate(String filePath){

        List<String> arrayList = init();

        for (int i = 0; i < arrayList.size(); i++) {
            if (filePath.startsWith(arrayList.get(i))){
                return true;
            }
        }
        return false;
    }

    private List<String> init() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(tempPath);
        arrayList.add(scriptPath);
        arrayList.add(nfsFileDir);
        return arrayList;
    }
}
