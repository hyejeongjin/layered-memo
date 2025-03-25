package com.example.layered.service;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;
import com.example.layered.entity.Memo;

import java.util.List;

public interface MemoService {

    // 컨트롤러에서 변환할 필요 없이 바로 응답 할 수 있도록 MemoResponseDto로 반환 타입 설정.
    MemoResponseDto saveMemo(MemoRequestDto dto);
    List<MemoResponseDto> findAllMemos();
    MemoResponseDto findMemoById(Long id);
    MemoResponseDto updateMemo(Long id, String title, String contents);
    MemoResponseDto updateTitle(Long id, String title, String contents);
    void deleteMemo(Long id);

}
