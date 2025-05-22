package RUT.adminProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String checkHealth() {
        return "Everything is VERY FINE. The server is RUNning. Performed by Zvyagintsev Roman UVP-311"+"\n";
    }
}