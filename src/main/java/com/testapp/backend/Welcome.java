package com.testapp.backend;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Welcome {

    @Autowired
    CallStudents c;

    @RequestMapping("/students")
    public List<Students> getAllS() {
        return c.getStudent();
    }
    
    @RequestMapping("/students/{fname}")
    public List<String> getAllS(@PathVariable("fname") String fname) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<c.getStudent().size(); i++) {
            if(c.getStudent().get(i).getFirstName().equals(fname)) {
                list.add(c.getStudent().get(i).getFirstName());
                list.add(c.getStudent().get(i).getLastName());
            }
        }
        return list;
    }
}
