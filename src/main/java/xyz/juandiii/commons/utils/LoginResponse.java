package xyz.juandiii.commons.utils;

public class LoginResponse {

    private String accessToken;

    public LoginResponse(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}    

}