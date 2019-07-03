package com.macteam.cybertopia.dao;

import com.macteam.cybertopia.entity.User;

public interface IUserDao {
    User getUserByUsername(String username);
}
