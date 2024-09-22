package ru.pulselog.service.target;


import ru.pulselog.model.target.IncomingTarget;
import ru.pulselog.model.target.OutgoingTarget;

public interface TargetService {

    OutgoingTarget addNewTarget(IncomingTarget incomingTarget);
}
