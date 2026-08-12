package com.cauandev.proposalmanagement.proposal.domain;

import java.util.List;
import java.util.UUID;

public interface ProposalRepository {
    List<Proposal> findAll();
    List<Proposal> findByOwnerId(OwnerId ownerId);
    Proposal save(Proposal proposal);
}
