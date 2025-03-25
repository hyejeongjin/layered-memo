package com.example.layered.repository;

import com.example.layered.dto.MemoResponseDto;
import com.example.layered.entity.Memo;

import java.util.List;

public interface MemoRepository {

    // 반환 타입
    // 파라미터로 전달되는 memo는 id가 없는 상태로 repository layer에 전달됨.
    Memo saveMemo(Memo memo);

    List<MemoResponseDto> findAllMemos();

    Memo findMemoById(Long id);

    void deleteMemo(Long id);

}
