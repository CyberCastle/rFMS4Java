package cl.cc.http.client;

import java.io.IOException;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/**
 *
 * @author CyberCastle
 */
public class AcceptHeaderRequestInterceptor implements ClientHttpRequestInterceptor {

    private final List<MediaType> acceptValues;

    public AcceptHeaderRequestInterceptor(List<MediaType> acceptValues) {
        this.acceptValues = acceptValues;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        HttpHeaders headers = request.getHeaders();
        headers.setAccept(acceptValues);
        return execution.execute(request, body);
    }
}
