package com.cauandev.proposalmanagement.proposal.application.input;

import com.cauandev.proposalmanagement.proposal.domain.Owner;
import com.cauandev.proposalmanagement.proposal.domain.Proposal;

import java.util.Optional;

public record CreateProposalInput(String title, Optional<String> description) {
    public Proposal toDomain(Owner owner) {
        return new Proposal(title, description, owner);
    }
}
