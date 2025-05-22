package RUT.adminProject.service;

import RUT.adminProject.model.Train;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainService {
    private final List<Train> trains = new ArrayList<>();

    public List<Train> getAllTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }
}
