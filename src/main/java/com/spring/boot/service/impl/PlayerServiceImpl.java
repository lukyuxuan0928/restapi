package com.spring.boot.service.impl;

import com.spring.boot.dto.PlayerDto;
import com.spring.boot.service.IPlayerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements IPlayerService {
    @Override
    public PlayerDto getPlayerInfo() {
//        sample
        PlayerDto playerDto = new PlayerDto();
        playerDto.setName("Luke");
        playerDto.setSex("M");

        return playerDto;
    }

    @Override
    public List<PlayerDto> getAllPlayer() {
//      sample
        List<PlayerDto> playerDtos = new ArrayList<>();

        PlayerDto playerDto = new PlayerDto();
        playerDto.setName("Luke");
        playerDto.setSex("M");

        PlayerDto playerDto2 = new PlayerDto();
        playerDto2.setName("Shee Wei");
        playerDto2.setSex("F");

        playerDtos.add(playerDto);
        playerDtos.add(playerDto2);

        return playerDtos;
    }

    @Override
    public boolean checkPlayer() {
//      sample
        return true;
    }
}
