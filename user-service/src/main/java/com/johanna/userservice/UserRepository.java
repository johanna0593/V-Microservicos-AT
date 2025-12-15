package com.johanna.userservice;

import com.johanna.userservice.domain.User;
import com.johanna.userservice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Testcontainers
@SpringBootTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Container
    static PostgreSQLContainer<?> postgres =
            new PostgreSQLContainer<>("postgres:15")
                    .withDatabaseName("testdb")
                    .withUsername("test")
                    .withPassword("test");

    @Autowired
    UserRepository repository;

    @Test
    void shouldSaveAndFindUser() {
        User user = new User("Johanna", "johanna@email.com");

        Mono<User> saved = repository.save(user);

        StepVerifier.create(saved)
                .expectNextMatches(u -> u.getId() != null)
                .verifyComplete();
    }
}
