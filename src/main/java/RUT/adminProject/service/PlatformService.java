package RUT.adminProject.service;

import RUT.adminProject.model.Platform;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatformService {
    private final List<Platform> platforms = new ArrayList<>();

    public List<Platform> getAllPlatforms() {
        return platforms;
    }

    public void addPlatform(Platform platform) {
        platforms.add(platform);
    }
}
