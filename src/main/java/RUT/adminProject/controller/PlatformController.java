package RUT.adminProject.controller;

import RUT.adminProject.model.Platform;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/platforms")
public class PlatformController {
    private final List<Platform> platforms = new ArrayList<>();

    @GetMapping
    public List<Platform> getAllPlatforms() {
        return platforms;
    }

    @PostMapping
    public Platform addPlatform(@RequestBody Platform platform) {
        platforms.add(platform);
        return platform;
    }
}