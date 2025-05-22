package RUT.adminProject;

import RUT.adminProject.model.Platform;
import RUT.adminProject.model.Train;
import RUT.adminProject.service.PlatformService;
import RUT.adminProject.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final PlatformService platformService;
    private final TrainService trainService;

    @Autowired
    public DataInitializer(PlatformService platformService, TrainService trainService) {
        this.platformService = platformService;
        this.trainService = trainService;
    }

    @Override
    public void run(String... args) {
        for (int i = 1; i <= 3; i++) {
            Platform platform = new Platform();
            platform.setId("P" + i);
            platform.setNumber(i);
            platform.setLength(150.0 + i * 10);
            platformService.addPlatform(platform);
        }

        for (int i = 1; i <= 3; i++) {
            Train train = new Train();
            train.setId("T" + i);
            train.setNumber("Train-" + i);
            train.setDestination("Destination " + i);
            trainService.addTrain(train);
        }
    }
}
