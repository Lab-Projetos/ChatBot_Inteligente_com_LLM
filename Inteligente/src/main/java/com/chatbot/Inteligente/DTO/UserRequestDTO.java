package com.chatbot.Inteligente.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDTO {
     private Long id;
     private String name;
     private String email;
     private String password;
}
