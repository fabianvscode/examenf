package com.fabian.accesored.Service.Impl;

import com.fabian.accesored.Service.UserService;
import com.fabian.accesored.entity.User;
import com.fabian.accesored.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private Logger log = Logger.getLogger(String.valueOf(UserServiceImpl.class));
    Map<String, Object> responceCreate = new HashMap<>();

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Object registerUser(User user) {

        try {
            User _user = userRepository.saveAndFlush(new User(user.getNombre(),  user.getEmail(),  user.getPass(),user.getStatu()));
            responceCreate.put("responce", "sucess");
            responceCreate.put("code",201);
        }catch (Exception e){
            responceCreate.put("Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responceCreate;
    }
}
