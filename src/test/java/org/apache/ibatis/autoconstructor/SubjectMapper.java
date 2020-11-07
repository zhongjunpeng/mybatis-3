package org.apache.ibatis.autoconstructor;

import java.util.List;

public interface SubjectMapper {
    List<Subject> findAll() throws Exception;
}
