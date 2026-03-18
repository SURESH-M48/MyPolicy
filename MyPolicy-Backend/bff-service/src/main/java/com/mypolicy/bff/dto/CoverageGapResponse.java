package com.mypolicy.bff.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CoverageGapResponse {

    private BigDecimal recommendedCover;
    private BigDecimal existingCover;
    private BigDecimal protectionGap;

}
