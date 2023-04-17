package ru.codehunters.zaepestelegrambot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.codehunters.zaepestelegrambot.model.animals.Cat;

import java.util.Optional;

@Repository
public interface CatRepo extends JpaRepository<Cat, Long> {

    Optional<Cat> findByOwnerId(Long id); // Поиск кота по telegramId пользователя

}
