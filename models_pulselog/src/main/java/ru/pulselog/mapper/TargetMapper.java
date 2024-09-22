package ru.pulselog.mapper;


import org.mapstruct.Mapper;
import ru.pulselog.model.target.IncomingTarget;
import ru.pulselog.model.target.OutgoingTarget;
import ru.pulselog.model.target.Target;

@Mapper(componentModel = "spring")
public interface TargetMapper {

    Target toTarget(IncomingTarget incomingTarget);
    OutgoingTarget toOutgoingTarget(Target target);
}
