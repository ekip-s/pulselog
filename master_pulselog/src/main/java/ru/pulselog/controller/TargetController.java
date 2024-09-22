package ru.pulselog.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pulselog.model.target.IncomingTarget;
import ru.pulselog.model.target.OutgoingTarget;
import ru.pulselog.service.target.TargetService;

@Slf4j
@RestController
@RequestMapping("/target/api/v1")
@Tag(name="target_controller", description = "Управление целями")
public class TargetController {

    private final TargetService targetService;

    @Autowired
    public TargetController(TargetService targetService) {
        this.targetService = targetService;
    }

    @Operation(
            summary = "Создание новой цели",
            description = ""
    )
    @PostMapping
    public OutgoingTarget addNewTarget(@RequestBody IncomingTarget incomingTarget) {
        log.info("POST TargetController: метод addNewTarget, параметры: {}", incomingTarget);
        return targetService.addNewTarget(incomingTarget);
    }

}
