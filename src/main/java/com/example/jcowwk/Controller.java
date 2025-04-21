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

    @GetMapping("/{boardId}")
    public List<String> getDetail(@PathVariable Long boardId) {
        return List.of("게시글1", "게시글2", "게시글3");
    }

    @GetMapping("/grid")
    public List<String> getGrid() {
        return List.of("게시글1", "게시글2", "게시글3");
    }
}
