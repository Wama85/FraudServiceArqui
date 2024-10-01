package com.example.examen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudServiceTest {

    private FraudService fraudService;
    @BeforeEach
    void setUp() {
        fraudService = new FraudService();  // Inicialización antes de cada prueba
    }

    @Test
    @DisplayName("Should return true when the card is blacklisted")
    void testIsBlacklisted() {
        // Act
        boolean isInBlackList = fraudService.isBlacklisted("595155555555000000");

        // Assert
        assertTrue(isInBlackList, "The card should be in the blacklist");
    }

    @Test
    @DisplayName("Should return false when the card is not blacklisted")
    void testIsNotBlacklisted() {
        // Act
        boolean isInBlackList = fraudService.isBlacklisted("595155555555");

        // Assert
        assertFalse(isInBlackList, "The card should not be in the blacklist");
    }
}