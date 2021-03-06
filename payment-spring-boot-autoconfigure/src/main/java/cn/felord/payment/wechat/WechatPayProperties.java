package cn.felord.payment.wechat;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Wechat pay properties.
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
@ConfigurationProperties("wechat.pay")
public class WechatPayProperties {
    /**
     * wechat pay V3 properties
     */
    private Map<String,V3> v3 =new HashMap<>();

    /**
     * wechat pay v3 properties.
     *
     * @author felord.cn
     * @since 1.0.0.RELEASE
     */
    @Data
    public static class V3 {
        /**
         * app id for wechat pay is required
         */
        private String appId;
        /**
         * app secret for wechat pay is required
         */
        private String appSecret;
        /**
         * app V3 secret is required by wechat pay V3
         */
        private String appV3Secret;
        /**
         * mchId for wechat pay is required
         */
        private String mchId;
        /**
         * partnerKey for wechat pay is  optional
         */
        private String partnerKey;
        /**
         * wechat pay certificate Path
         */
        private String certPath;
        /**
         * your pay server domain
         */
        private String domain;
    }
}
