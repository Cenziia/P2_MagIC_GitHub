package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser / Ne rien ajouter là

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier / Retourne users
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier / Retourne un user random
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier / supprime le user en paramètres
        apiService.deleteUser(user);
    }
}