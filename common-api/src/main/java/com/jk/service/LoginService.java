package com.jk.service;

import com.jk.model.User;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;

public interface LoginService {
    User loginUser(User user);



    void addregisUser(User user);

    PageUtil findaccountSum(ParameUtil parame);
}
