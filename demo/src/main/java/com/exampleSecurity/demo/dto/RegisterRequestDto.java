package com.exampleSecurity.demo.dto;

import com.exampleSecurity.demo.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDto {
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Role role;
}