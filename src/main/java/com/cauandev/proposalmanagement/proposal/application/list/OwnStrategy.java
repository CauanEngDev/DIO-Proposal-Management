package com.cauandev.proposalmanagement.proposal.application.list;

import com.cauandev.proposalmanagement.proposal.domain.OwnerId;
import com.cauandev.proposalmanagement.proposal.domain.Proposal;
import com.cauandev.proposalmanagement.proposal.domain.ProposalRepository;

import java.util.List;

public class OwnStrategy implements Strategy {
    private final ProposalRepository proposalRepository;

    public OwnStrategy(ProposalRepository proposalRepository) {
        this.proposalRepository = proposalRepository;
    }

    @Override
    public List<Proposal> getPrposals(OwnerId ownerId) {
        return proposalRepository.findAllByOwnerId(ownerId);
    }

    @Override
    public AccessScope getScope() {
        return AccessScope.OWN;
    }
}
