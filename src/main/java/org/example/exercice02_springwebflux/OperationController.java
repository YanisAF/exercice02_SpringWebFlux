package org.example.exercice02_springwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class OperationController {

    @GetMapping("/api/processed-numbers")
    public Flux<String> processedNumbers() {
        return Flux.range(1, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .map(i -> "Processed: " + i + "\n");
    }
}
