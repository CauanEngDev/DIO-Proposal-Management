package com.cauandev.proposalmanagement.proposal.application.list;

import com.cauandev.proposalmanagement.proposal.domain.OwnerId;
import com.cauandev.proposalmanagement.proposal.domain.Proposal;

import java.util.List;

public interface Strategy {
    List<Proposal> getPrposals(OwnerId ownerId);
    AccessScope getScope();
}
