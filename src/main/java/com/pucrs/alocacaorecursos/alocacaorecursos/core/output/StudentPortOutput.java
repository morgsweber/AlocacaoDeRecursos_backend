package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Student;

public interface StudentPortOutput {
    List<String> getEnrolledClassesId(String studentId);
}
