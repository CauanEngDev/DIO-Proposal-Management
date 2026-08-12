package com.cauandev.proposalmanagement.proposal.application.list;

import com.cauandev.proposalmanagement.proposal.domain.OwnerId;
import com.cauandev.proposalmanagement.proposal.domain.Proposal;
import com.cauandev.proposalmanagement.proposal.domain.ProposalRepository;

import java.util.List;

public class AllStrategy implements Strategy {
    private final ProposalRepository proposalRepository;


    public AllStrategy(ProposalRepository proposalRepository) {
        this.proposalRepository = proposalRepository;
    }

    @Override
    public List<Proposal> getPrposals(OwnerId ownerId) {
        return proposalRepository.findAll();
    }

    @Override
    public AccessScope getScope() {
        return AccessScope.ALL;
    }
}
