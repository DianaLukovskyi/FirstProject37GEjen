package dto;

public class UserDTO {
    UserDTO user = new UserDTO().setEmail("feling@protomail.com").setPassword("Karin2020@");

    String email;
    String password;

    public String getEmail() {
        return email;
    }

    public dto.UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public dto.UserDTO setPassword(String password) {
        this.password = password;
        return this;


    }
}

