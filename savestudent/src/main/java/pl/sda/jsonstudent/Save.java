package pl.sda.jsonstudent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Juliusz Mueller
 */
public class Save {


    public void studenSave() {

        Student student1 = new Student("Anita", "M\u00FCller", 1);
        Student student2 = new Student("Juliusz", "M\u00FCller", 2);
        Student student3 = new Student("Marta", "Bolka", 3);
        Student student4 = new Student("Ala", "Ma KOta", 4);

        List<Student> listastudent = new ArrayList<>();

        listastudent.add(student1);
        listastudent.add(student2);
        listastudent.add(student3);
        listastudent.add(student4);


        ObjectMapper mapper = new ObjectMapper();

        String studentStr = null;
        try {
            studentStr = mapper.writeValueAsString(listastudent);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(studentStr);

        try {
            if (studentStr != null) {
                Files.write(Paths.get("Student.json"), studentStr.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
