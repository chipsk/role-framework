package com.library.common.service;

import com.library.common.domain.ResponseResult;
import com.library.common.domain.entity.User;

public interface LibraryLoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}
