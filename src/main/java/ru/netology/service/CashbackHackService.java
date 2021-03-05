package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        int boundary = 1000;
        return boundary - amount % boundary;
    }
}
