package VkApi.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class RootObject {

    @JsonProperty("response")
    private Response response;

    public Response getResponse() { return this.response; }

    public void setResponse(Response response) { this.response = response; }

    @JsonProperty("error")
    private Error error;

    public Error getError() { return this.error; }

    public void setError(Error error) { this.error = error; }

    @Override
    public String toString() {
        return "RootObject{" +
                "response=" + response +
                '}';
    }
}
