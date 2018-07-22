package com.liguoxi;

import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        /** 设置启动类 */
        builder.sources(Application.class);
        /** 设置横幅模式 */
        builder.bannerMode(Banner.Mode.OFF);
        /** 返回SpringBoot应用启动对象 */
        return builder;
    }

}
