package RUT.adminProject.controller;

import RUT.adminProject.model.Platform;
import RUT.adminProject.service.PlatformService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/platforms")
public class PlatformController {

    private final PlatformService platformService;

    public PlatformController(PlatformService platformService) {
        this.platformService = platformService;
    }

    @GetMapping
    public List<Platform> getAllPlatforms() {
        return platformService.getAllPlatforms();
    }

    @PostMapping
    public Platform addPlatform(@RequestBody Platform platform) {
        platformService.addPlatform(platform);
        return platform;
    }
}