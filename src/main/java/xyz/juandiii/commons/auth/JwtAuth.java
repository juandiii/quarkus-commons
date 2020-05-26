package xyz.juandiii.commons.auth;

public interface JwtAuth extends UserInterface {

    UserInterface login(Credentials credentials);
    UserInterface register(UserInterface userInterface);

}