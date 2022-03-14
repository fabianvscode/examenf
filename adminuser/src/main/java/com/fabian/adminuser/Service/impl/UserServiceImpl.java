package com.fabian.adminuser.Service.impl;

import com.fabian.adminuser.Service.UserService;
import com.fabian.adminuser.entity.UserRed;
import com.fabian.adminuser.repository.UserRedRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRedRepository userRedRepository;

    private Logger log = Logger.getLogger(String.valueOf(UserServiceImpl.class));
    Map<String, Object> responceList = new HashMap<>();
    List<UserRed> reduser = new ArrayList<>();

    @Override
    public Object listUser() throws Exception {


        reduser = userRedRepository.findAll();
        responceList.put("ListUser", reduser);
        return responceList;
    }

    @Override
    public Object createUser(UserRed userRed) throws Exception {

        UserRed responce = userRedRepository.saveAndFlush(new UserRed(userRed.getNombre(), userRed.getEmail(), userRed.getPass(), userRed.getStatu()));
        return responce;
    }


}