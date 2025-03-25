package com.example.layered.entity;

import com.example.layered.dto.MemoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Memo {

    // id라는 필드만 수정할 수 있게 됨. 변경해야되는 값만 수정될 수 있도록 변수 위에 적용.
    @Setter
    private Long id;
    private String title;
    private String contents;

    // 생성자
    public Memo(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

    // 각각 입력해서 데이터를 받을 수 있음.
    // 재사용성이 좋아진다는 장점이 있음.
    // 이런 식(String title, String contents)으로 작성하는 게 좋음.
    public void update(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

}