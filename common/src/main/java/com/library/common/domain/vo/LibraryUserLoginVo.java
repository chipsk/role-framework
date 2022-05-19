package com.library.common.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryUserLoginVo {

    private String token;

    private UserInfoVo userInfo;

}