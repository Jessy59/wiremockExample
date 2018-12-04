import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

public class WireMockConfig {

    public static void wireMockConfig(WireMockServer wireMockServer){
        configureFor("localhost", wireMockServer.port());

        stubFor(get(urlMatching("/test")).willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("{test:'ok'}")));
    }
}
