package com.ankush.spring.webflux.springreactivewebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ankushnakaskar
 */
@RestController
@RequestMapping("/employees")
public class EmployeeReactiveController {

    @GetMapping("/{id}")
    private Mono<Employee> getEmployeeById(@PathVariable String id) {
        Employee e =new Employee();
        e.setId(1);
        e.setName("Ankush");
        return Mono.just(e);
    }

    @GetMapping
    private Flux<Employee> getAllEmployees() {
        List<Employee> list =new LinkedList<>();
        Employee e =new Employee();
        e.setId(1);
        e.setName("Ankush");
        return Flux.just(e);
    }

}
