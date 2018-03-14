package com.secureweb.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Controller
@EnableOAuth2Sso
public class DemoController extends WebSecurityConfigurerAdapter{

    @RequestMapping("/")
    public String  homePage()
    {
        return "homePage";
    }

    @Override
    protected  void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/","login**").permitAll()
                .anyRequest().authenticated();
    }
}
