package VkApi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Error {

    @JsonProperty("error_code")
    private int error_code;

    public int getErrorCode() { return this.error_code; }

    public void setErrorCode(int error_code) { this.error_code = error_code; }

    @JsonProperty("error_msg")
    private String error_msg;

    public String getErrorMsg() { return this.error_msg; }

    public void setErrorMsg(String error_msg) { this.error_msg = error_msg; }

    @JsonProperty("request_params")
    private ArrayList<RequestParam> request_params;

    public ArrayList<RequestParam> getRequestParams() { return this.request_params; }

    public void setRequestParams(ArrayList<RequestParam> request_params) { this.request_params = request_params; }

}
