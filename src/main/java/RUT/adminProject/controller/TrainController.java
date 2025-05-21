package RUT.adminProject.controller;

import RUT.adminProject.model.Train;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
    private final List<Train> trains = new ArrayList<>();

    @GetMapping
    public List<Train> getAllTrains() {
        return trains;
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train) {
        trains.add(train);
        return train;
    }
}