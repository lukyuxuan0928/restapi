package com.spring.boot.restful;

import com.spring.boot.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlayerController {


    private Response response;

    @Autowired
    private IPlayerService iPlayerService;

    @RequestMapping(value = "web/rest/player", method = RequestMethod.GET)
    public ResponseEntity getPlayer() {
        return response.buildResponse("0","success",iPlayerService.getPlayerInfo());
    }

    @RequestMapping(value = "web/rest/player/all", method = RequestMethod.GET)
    public ResponseEntity getAllPlayer() {
        return response.buildResponse("0","success",iPlayerService.getAllPlayer());
    }
}
