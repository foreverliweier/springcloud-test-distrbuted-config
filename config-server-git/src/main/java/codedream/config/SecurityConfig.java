package codedream.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 使用 http.authorizeRequests().anyRequest().permitAll()
 * 禁用了身份验证，允许任何请求通过，并使用 http.csrf().disable() 禁用了 CSRF 防护。
 *
 * @author alice
 * @time 2023-06-01 15:03
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 禁用身份验证
        http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
        /**
         * antMatchers("/actuator/refresh").hasRole("ADMIN") 限制只有具有 ADMIN 角色的用户才能访问 /actuator/refresh 端点
         *         需要在应用程序的用户管理系统中配置相应的角色和权限
         * */
//        http.authorizeRequests()
//                .antMatchers("/actuator/refresh").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable();
    }
}
