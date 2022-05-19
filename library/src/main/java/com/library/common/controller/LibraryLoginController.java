package com.library.common.controller;

import com.library.common.annotation.SystemLog;
import com.library.common.domain.ResponseResult;
import com.library.common.domain.entity.User;
import com.library.common.enums.AppHttpCodeEnum;
import com.library.common.exception.SystemException;
import com.library.common.service.LibraryLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryLoginController {

    @Autowired
    private LibraryLoginService libraryLoginService;

    @PostMapping("/login")
    @SystemLog(businessName = "用户登录")
    public ResponseResult login(@RequestBody User user) {
        if (!StringUtils.hasText(user.getUserName())) {
            //提示 必须要传用户名
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        return libraryLoginService.login(user);
    }

    @PostMapping("/logout")
    @SystemLog(businessName = "用户注销")
    public ResponseResult logout() {
        return libraryLoginService.logout();
    }
}
