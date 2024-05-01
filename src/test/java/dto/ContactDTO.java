package dto;

import java.util.concurrent.atomic.AtomicReference;

public class ContactDTO {
    private String name;
    private String lastname;
    private String email;
    private String password;



    public ContactDTO() {
    }

    public ContactDTO setName(String name) {
        this.name = name;
        return this;

    }

    public ContactDTO setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }






    }



