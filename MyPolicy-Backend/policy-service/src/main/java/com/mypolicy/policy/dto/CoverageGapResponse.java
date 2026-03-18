package com.mypolicy.policy.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CoverageGapResponse{
    
    private BigDecimal recommendedCover;
    private BigDecimal existingCover;
    private BigDecimal protectionGap;
}