package com.example.examen;

import java.util.ArrayList;
import java.util.List;

public class FraudService {

    private static final List<String> blacklistedCards = new ArrayList<>();

    static {
        blacklistedCards.add("595155555555000000");
        blacklistedCards.add("595155555555111111");

    }
    public boolean isBlacklisted(String card) {
        return blacklistedCards.contains(card);
    }

    }
