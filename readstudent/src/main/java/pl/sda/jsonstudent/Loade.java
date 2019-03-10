package pl.sda.jsonstudent;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Juliusz Mueller
 */
public class Loade {

    //2. Wyświetla studentów których imiona zaczynają się na literę A (lambda)

    public  void studenLoade(){

        ObjectMapper mapper = new ObjectMapper();


        try {
            Student[] studentsArray = mapper.readValue("Student.json", Student[].class);
            List<Student> personList = Arrays.asList(studentsArray);

            System.out.println(personList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
