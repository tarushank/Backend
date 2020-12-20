package com.testapp.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CallStudents {
    
    public List<Students> getStudent() {
            
        List<Students> studentsList = new ArrayList<>();
        Students students1 = new Students("Tarush", "Koduru");
        Students students2 = new Students("Rahul", "Gopi");
        Students students3 = new Students("Shreyas", "Hassan");
        Students students4 = new Students("Merina", "Dangol");
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
        studentsList.add(students4);
        return studentsList;
    }
    
}
