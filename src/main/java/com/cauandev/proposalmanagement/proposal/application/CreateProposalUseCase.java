package com.cauandev.proposalmanagement.proposal.application;

import com.cauandev.proposalmanagement.proposal.application.input.CreateProposalInput;
import com.cauandev.proposalmanagement.proposal.application.output.ProposalOutput;
import com.cauandev.proposalmanagement.proposal.domain.Owner;
import com.cauandev.proposalmanagement.proposal.domain.ProposalRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateProposalUseCase {
    private ProposalRepository proposalRepository;

    public CreateProposalUseCase(ProposalRepository proposalRepository) {
        this.proposalRepository = proposalRepository;
    }

    public ProposalOutput execute(CreateProposalInput input, Owner owner) {
        var saved = proposalRepository.save(input.toDomain(owner));

        return ProposalOutput.from(saved);
    }
}
