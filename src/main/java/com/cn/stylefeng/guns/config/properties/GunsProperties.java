package com.cn.stylefeng.guns.config.properties;

import cn.stylefeng.roses.core.util.ToolUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.io.File;
import static cn.stylefeng.roses.core.util.ToolUtil.getTempPath;

/**
 * @Author:
 * @Date: 2020/5/14 10:36
 * @Version: 1.0
 */
@Configuration
@ConfigurationProperties(prefix = GunsProperties.PREFIX)
public class GunsProperties {

    public static final String PREFIX = "guns";

    private Boolean kaptchaOpen = false;

    private Boolean swaggerOpen = false;

    private String fileUploadPath;

    private Boolean haveCreatePath = false;

    private Boolean springSessionOpen = false;

    private Integer sessionInvalidateTime = 30*60;

    private Integer sessionValidationInterval = 15*60;

    public String getFileUploadPath(){
        if(ToolUtil.isEmpty(fileUploadPath)){
            return getTempPath();
        }else{
            if(!fileUploadPath.endsWith(File.separator)){
                fileUploadPath = fileUploadPath + File.separator;
            }
            if(!haveCreatePath){
                File file = new File(fileUploadPath);
                file.mkdirs();
                haveCreatePath =true;
            }
            return fileUploadPath;
        }
    }

    public void setFileUploadPath(String fileUploadPath){this.fileUploadPath = fileUploadPath; }

    public Boolean getKaptchaOpen(){return kaptchaOpen;}

    public void setKaptchaOpen(Boolean kaptchaOpen) {this.kaptchaOpen = kaptchaOpen;}

    public Boolean getSwaggerOpen() {
        return swaggerOpen;
    }

    public void setSwaggerOpen(Boolean swaggerOpen) {
        this.swaggerOpen = swaggerOpen;
    }

    public Boolean getSpringSessionOpen() {
        return springSessionOpen;
    }

    public void setSpringSessionOpen(Boolean springSessionOpen) {
        this.springSessionOpen = springSessionOpen;
    }

    public Integer getSessionInvalidateTime() {
        return sessionInvalidateTime;
    }

    public void setSessionInvalidateTime(Integer sessionInvalidateTime) {
        this.sessionInvalidateTime = sessionInvalidateTime;
    }

    public Integer getSessionValidationInterval() {
        return sessionValidationInterval;
    }

    public void setSessionValidationInterval(Integer sessionValidationInterval) {
        this.sessionValidationInterval = sessionValidationInterval;
    }
}
