package com.ankush.spring.webflux.springreactivewebflux.reactive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author ankushnakaskar
 */
@RestController
@RequestMapping("/numbers")
@Slf4j
public class NumbersController {

    @GetMapping(path = "/count/{number}")
    public Flux<Integer> countToNumber(
            @PathVariable("number") int number) {
        return Flux.range(0, number);
    }

    @GetMapping(path = "/slow_count/{number}", produces= MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> slowCountToNumber(
            @PathVariable("number") int number) {
        Flux<Integer> dynamicFlux = Flux.create(sink -> {
            SlowCounter.count(sink, number);
        });
        return dynamicFlux;
    }
}