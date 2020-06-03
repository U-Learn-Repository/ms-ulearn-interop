package com.u_learn.rs.pojo;

import com.u_learn.ws.pojo.ViewModelUser;

public class UserHelper {
    
    private UserHelper() {
        
    }
    
    public static UserModel mapping(ViewModelUser usuario) {
        UserModel result = new UserModel();
        result.setCountry(usuario.getCountry().getValue());
        result.setEmail(usuario.getEmail().getValue());
        result.setLastName(usuario.getLastName().getValue());
        result.setLostGames(usuario.getLostGames());
        result.setName(usuario.getName().getValue());
        result.setTotalGames(usuario.getTotalGames());
        result.setUserName(usuario.getName().getValue());
        result.setWonGames(usuario.getWonGames());
        return result;
    }
}
