package com.olvera.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Accounts information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountName can not be a null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(description = "Account Number of Eazy Bank account")
    private Long accountNumber;

    @Schema(description = "Account Type of Eazy Bank account", example = "Savings")
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(description = "Eazy Bank branch address")
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;

}
