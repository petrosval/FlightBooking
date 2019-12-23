package com.aerotravel.flightticketbooking.model;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable=false)
    @NotBlank(message = "* First Name is required")
    private String firstname;

    @Column(nullable=false)
    @NotBlank(message = "* Country is required")
    private String country;

    @Column(nullable=false)
    @NotBlank(message = "* City is required")
    private String city;

    @Column(nullable=false)
    @NotBlank(message = "* Address is required")
    private String address;


    @Column(nullable=false)
    @NotBlank(message = "* Last Name is required")
    private String lastname;

    @Column(nullable=false, unique=true)
    @NotBlank(message = "* Username is required")
    private String username;

    @Column(nullable=false, unique=true)
    @NotBlank(message = "* Email is required")
    @Email(message="{errors.invalid_email}")
    private String email;

    @Column(nullable=false)
    @NotBlank(message = "* Password is required")
    @Size(min=8)
    private String password;

    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles;

    public User(){

    }

    public User(String firstname,String lastname, String username, String password, String country, String city, String address, String email ,List<Role> roles){

        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.country = country;
        this.city = city;
        this.address =address;
        this.email = email;
        this.roles = roles;
    }

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public List<Role> getRoles()
    {
        return roles;
    }
    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
