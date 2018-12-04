import com.github.tomakehurst.wiremock.WireMockServer;

public class Main {

    public static void main(String ... args){
        WireMockServer wireMockServer = new WireMockServer(8089);
        wireMockServer.start();
        WireMockConfig.wireMockConfig(wireMockServer);

    }
}
