package com.xyz.metallica.gateway;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
            .ignoring()
                .antMatchers("/", "/*.html", "/app**/", "/app.js", "/app.js*", "/main.css", "/*.jpg", "/*.ico");
    }
	
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/login").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().permitAll()
		.and().csrf().disable();
    }
}
