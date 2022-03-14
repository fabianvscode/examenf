package com.fabian.accesored.Service;

import com.fabian.accesored.Modelo.RoleDto;

public interface RoleService {
    public Object createRol(RoleDto roleDto)throws Exception;
    public Object viewRol()throws Exception;
}
