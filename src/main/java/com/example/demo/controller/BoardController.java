package com.example.demo.controller;

import com.example.demo.dto.WbtContentDto;
import com.example.demo.repository.BoardRepository;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/board")
@ComponentScan("com.example.demo")
public class BoardController {

    @Autowired
    BoardService boardService;

    @Autowired
    BoardRepository boardRepository;

    @RequestMapping(value="/cc",method= RequestMethod.GET)
    public String getC() {
        return "c";
    }

    @RequestMapping(value="/dd",method= RequestMethod.GET)
    public String getD() {
        return "board/d";
    }


    @RequestMapping("/list")
    public String getPostList(Model model) {

        List<WbtContentDto> wbt = boardService.getContentAll();
        model.addAttribute("postList",wbt);
        return "/board/list";
    }

    @RequestMapping("/{id}")
    public Optional<WbtContentDto> getpost(@PathVariable Long id) {

        Optional<WbtContentDto> wbt = boardService.getContent(id);
        return wbt;
    }

    @RequestMapping(value="/write")
    public String setPost() {
         //  boardService.setContent(wbtContentDto);

       return "board/write";
    }


}
