package com.hk.mapper;

import com.hk.bean.Postingclassified;
import com.hk.bean.PostingclassifiedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostingclassifiedMapper {
    int countByExample(PostingclassifiedExample example);

    int deleteByExample(PostingclassifiedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Postingclassified record);

    int insertSelective(Postingclassified record);

    List<Postingclassified> selectByExample(PostingclassifiedExample example);

    Postingclassified selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Postingclassified record, @Param("example") PostingclassifiedExample example);

    int updateByExample(@Param("record") Postingclassified record, @Param("example") PostingclassifiedExample example);

    int updateByPrimaryKeySelective(Postingclassified record);

    int updateByPrimaryKey(Postingclassified record);
}