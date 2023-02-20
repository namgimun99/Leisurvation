package com.lec.spring.service.leisure;

import com.lec.spring.domain.leisure.LeisureFileDTO;
import com.lec.spring.repository.leisure.LeisureFileRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class LeisrefileService {
    private LeisureFileRepository leisureFileRepository;

    @Autowired
    public LeisrefileService(SqlSession sqlSession){
        leisureFileRepository = sqlSession.getMapper(LeisureFileRepository.class);
    }

    public LeisureFileDTO findById(Long id) {return leisureFileRepository.findById(id);}
}
