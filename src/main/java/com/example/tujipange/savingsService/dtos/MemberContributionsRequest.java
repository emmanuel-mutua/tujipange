package com.example.tujipange.savingsService.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Nicholas Nzovia
 * @On 19/02/2023
 * @Contact: itsdevelopernic22@gmail.com
 */

@Data
public class MemberContributionsRequest {
    private Long userReferenceId = 1L;
    private String memberIdNumber;
    private BigDecimal contributedAmount;
    private LocalDateTime contributionDate;
    //private LocalDateTime contributionDeadline;
}
