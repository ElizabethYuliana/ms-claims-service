package com.pe.claimsservice.model;


import com.pe.claimsservice.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@Document(collection = "claims")
public class Claim {

    private String id;
    private String claimNumber;
    private String customerId;
    private String sinisterType;
    private String description;
    private LocalDateTime claimDate;
    private List<URI> attachments;
    private Status status;

}
