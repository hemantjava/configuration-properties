package com.example.configurationproperties;

import com.example.configurationproperties.dto.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FileOperation {

    @Autowired
    private Resource resource;

    @Test
    void testFile () throws IOException {
        final Stream<Path> list = Files.list(Paths.get("src/main/resources"));
        final Map<String, List<Student>> listMap = new HashMap<>();
        list.filter(x -> x.toFile().getName().endsWith("_DP.txt")).forEach(x -> {
            final List<Student> students = new ArrayList<>();
            final String[] split1 = x.toFile().getName().split("\\_");
            try (BufferedReader reader =
                         Files.newBufferedReader(x, StandardCharsets.UTF_8)) {
                String line;
                Student build = null;
                while ((line = reader.readLine()) != null) {
                    String[] split = line.split("\\|");
                    for (int i = 0; i < split.length; i++) {
                        build = Student.builder()
                                .fname(split[0])
                                .mname(split[1])
                                .lname(split[2])
                                .build();
                    }
                    students.add(build);
                   // listMap.put(split1[0], students);
                }
                listMap.put(split1[0],students);
                //System.out.println(students);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        System.out.println(listMap.get("data"));
        System.out.println(listMap.get("sample"));

    }

}
