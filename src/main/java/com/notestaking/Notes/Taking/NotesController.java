package com.notestaking.Notes.Taking;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/notes")
public class NotesController {
    
    @Autowired
    private NotesRepository notesRepository;

    @GetMapping(path = "/{notesId}")
    public @ResponseBody Optional<Notes> getNotesById(@PathVariable int notesId){
        return notesRepository.findById(notesId);
    }

}
