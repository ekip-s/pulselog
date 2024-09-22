package ru.pulselog.service.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pulselog.mapper.TargetMapper;
import ru.pulselog.model.target.IncomingTarget;
import ru.pulselog.model.target.OutgoingTarget;
import ru.pulselog.model.target.Target;
import ru.pulselog.repository.TargetRepository;

@Service
@Transactional(readOnly = true)
public class TargetServiceImpl implements  TargetService {

    private final TargetRepository targetRepository;
    private final TargetMapper targetMapper;

    @Autowired
    public TargetServiceImpl(TargetRepository targetRepository, TargetMapper targetMapper) {
        this.targetRepository = targetRepository;
        this.targetMapper = targetMapper;
    }

    @Override
    @Transactional
    public OutgoingTarget addNewTarget(IncomingTarget incomingTarget) {
        Target target = targetMapper.toTarget(incomingTarget).newTarget();
        return targetMapper.toOutgoingTarget(targetRepository.save(target));
    }
}
