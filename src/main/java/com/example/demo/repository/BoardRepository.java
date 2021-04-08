package com.example.demo.repository;

import com.example.demo.dto.WbtContentDto;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("boardRepository")
@ComponentScan
@EnableJpaRepositories
@EntityScan
public interface BoardRepository extends JpaRepository<WbtContentDto, Long> {


    Optional<WbtContentDto> findById(Long id);

    @Override
    List<WbtContentDto> findAll();

    WbtContentDto save(WbtContentDto wbtContentDto);
}
