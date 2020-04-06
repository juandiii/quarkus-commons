package xyz.juandiii.commons.auth;

public interface JwtAuth extends UserInterface {

    public UserInterface login(Credentials credentials);
    public UserInterface register(UserInterface userInterface);

}