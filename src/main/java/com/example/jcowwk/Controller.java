package com.example.jcowwk;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class Controller {

    @GetMapping
    public List<String> getBoards() {
        return List.of("게시글1", "게시글2", "게시글3");
    }
}
