package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.ClassRoomEntity;
import java.util.Objects;

public class ClassRoomMapper {
    
    public static ClassRoom mapFrom(final ClassRoomEntity entity) {
        ClassRoom domain = new ClassRoom();

        if(Objects.nonNull(entity)) {
            domain.setId(getNonNull(entity.getId()));
            domain.setBuilding(getNonNull(entity.getBuilding()));
            domain.setCapacity(getNonNull(entity.getCapacity()));
            domain.setType(getNonNull(entity.getType()));
        }

        return domain;
    }

    private static String getNonNull(final String item) {
        return Objects.nonNull(item) ? item : null;
    }
    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
}
