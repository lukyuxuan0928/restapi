package com.spring.boot.service;

import com.spring.boot.dto.PlayerDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPlayerService {
    PlayerDto getPlayerInfo();

    List<PlayerDto> getAllPlayer();

    boolean checkPlayer();
}
