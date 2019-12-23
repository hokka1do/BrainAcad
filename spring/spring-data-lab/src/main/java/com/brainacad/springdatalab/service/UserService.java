package com.brainacad.springdatalab.service;

import com.brainacad.springdatalab.dao.UserRepository;
import com.brainacad.springdatalab.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Интерфейс для взаимодействия с репозиторием.
 */
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getList() {
        return userRepository.findAll();
    }

    User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    List<User> findByPeriod(LocalDate startDate, LocalDate endDate) {
        return userRepository.findUsersByPeriod(startDate, endDate).collect(Collectors.toList());
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}