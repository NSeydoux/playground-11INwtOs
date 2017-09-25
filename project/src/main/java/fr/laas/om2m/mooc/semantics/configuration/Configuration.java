package fr.laas.om2m.mooc.semantics.configuration;

public class Configuration {
	private String uri;
	private Integer port;
	private String server;
	private String fusekiEndpoint;

	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getFusekiEndpoint() {
		return fusekiEndpoint;
	}
	public void setFusekiEndpoint(String fusekiEndpoint) {
		this.fusekiEndpoint = fusekiEndpoint;
	}
}
