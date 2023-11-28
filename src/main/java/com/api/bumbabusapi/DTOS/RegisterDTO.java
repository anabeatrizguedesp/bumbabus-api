package com.api.bumbabusapi.DTOS;

import jakarta.validation.constraints.NotNull;

public record RegisterDTO (@NotNull String email, @NotNull String password) {
    
}
