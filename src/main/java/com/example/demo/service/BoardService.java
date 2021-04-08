package com.example.demo.service;
import com.example.demo.dto.WbtContentDto;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("BoardService")
public class BoardService {

    @Autowired(required=false)
    private BoardRepository boardRepository;

    public List<WbtContentDto> getContentAll() {
       return boardRepository.findAll();
    }
    public Optional<WbtContentDto> getContent(Long id) {
        return boardRepository.findById(id);
    }
    public void  setContent(WbtContentDto wbtContentDto){
        boardRepository.save(wbtContentDto);

    }
}
