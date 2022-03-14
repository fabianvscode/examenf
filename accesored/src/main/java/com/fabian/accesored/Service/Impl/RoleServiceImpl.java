package com.fabian.accesored.Service.Impl;

import com.fabian.accesored.Modelo.RoleDto;
import com.fabian.accesored.Service.RoleService;
import com.fabian.accesored.entity.Role;
import com.fabian.accesored.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository repository;

    private Logger log = Logger.getLogger(String.valueOf(UserServiceImpl.class));
    Map<String, Object> responceCreate = new HashMap<>();
    Map<String, Object> responceView = new HashMap<>();

    @Override
    public Object createRol(RoleDto roleDto) throws Exception {
        try {
            Role r =  repository.saveAndFlush(new Role(roleDto.getDescription(), roleDto.getStatu()));
            responceCreate.put("responce", r);
        }catch (Exception e){
            responceCreate.put("Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responceCreate;
    }

    @Override
    public Object viewRol() throws Exception {
        try {
            Object view = repository.findAll();
            responceView.put("List", view);
        }catch (Exception e){
            responceView.put("Errror", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responceView;
    }


}
