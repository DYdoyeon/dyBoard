package com.example.demo.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity(name="Board")
@AllArgsConstructor
@NoArgsConstructor
public class WbtListDto {

    @Id
    @GeneratedValue
    Long bc_no;
    String title;
    String content;
    String writer;
    String write_date;

}
