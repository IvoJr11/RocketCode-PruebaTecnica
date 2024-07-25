package com.Myself.PruebaTecnica.mappers;

import com.Myself.PruebaTecnica.models.Task;
import org.apache.ibatis.annotations.*;

        import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM Tasks")
    List<Task> findAll();

    @Insert("INSERT INTO Tasks(name, description, creationDate) VALUES (#{name}, #{description}, #{creationDate})")
    void create(Task task);
}
