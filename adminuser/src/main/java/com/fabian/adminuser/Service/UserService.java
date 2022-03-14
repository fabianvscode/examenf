package com.fabian.adminuser.Service;

import com.fabian.adminuser.entity.UserRed;

public interface UserService {
    public Object listUser() throws Exception;

    public Object createUser(UserRed userRed)throws Exception;
}