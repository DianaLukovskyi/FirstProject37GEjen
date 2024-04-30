package dto;

public class UserDTO {
    String mail;
    String password;

    public UserDTO() {
    }

    public String getMail() {
        return mail;
    }

    public UserDTO setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}


