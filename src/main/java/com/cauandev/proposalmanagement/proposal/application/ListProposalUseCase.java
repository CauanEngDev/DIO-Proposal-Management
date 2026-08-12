package com.cauandev.proposalmanagement.proposal.application;

import com.cauandev.proposalmanagement.proposal.application.list.AccessScope;
import com.cauandev.proposalmanagement.proposal.application.list.Factory;
import com.cauandev.proposalmanagement.proposal.application.output.ProposalOutput;
import com.cauandev.proposalmanagement.proposal.domain.OwnerId;

import java.util.List;

public class ListProposalUseCase {
    private final Factory factory;

    public ListProposalUseCase(Factory factory) {
        this.factory = factory;
    }

    public List<ProposalOutput> execute(AccessScope scope, OwnerId ownerId) {
        var proposals = factory.getStrategy(scope).getPrposals(ownerId);

        return proposals.stream().map(ProposalOutput::from).toList();
    }
}
