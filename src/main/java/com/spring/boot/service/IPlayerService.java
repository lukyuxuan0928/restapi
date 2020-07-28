package com.spring.boot.service;

import com.spring.boot.dto.PlayerDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPlayerService {
    abstract PlayerDto getPlayerInfo();

    abstract List<PlayerDto> getAllPlayer();
}
