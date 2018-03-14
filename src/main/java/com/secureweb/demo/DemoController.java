package com.secureweb.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@Controller
@EnableOAuth2Sso
public class DemoController {

    @RequestMapping("/")
    public String  homePage()
    {
        return "homePage";
    }
}
