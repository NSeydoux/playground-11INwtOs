package fr.laas.om2m.mooc.semantics;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.laas.om2m.client.ClientFactory;
import fr.laas.om2m.client.OM2MClient;
import fr.laas.om2m.mooc.semantics.configuration.Configuration;

public class Controler {
	private static Logger LOGGER = LogManager.getLogger(Controler.class);

	private Configuration config;
	private OM2MClient om2mIn;
	private OM2MClient om2mMn;
	
	public Controler(String configPath){
		ObjectMapper mapper = new ObjectMapper();
		try {
			this.config = mapper.readValue(new File(configPath), Configuration.class);
			this.om2mIn = ClientFactory.createClient(new File("om2m-in.json"));
			this.om2mMn = ClientFactory.createClient(new File("om2m-mn.json"));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Configuration getConfig(){
		return this.config;
	}
	
	public OM2MClient getClient(String name){
		if(name.equals("in")){
			return this.om2mIn;
		} else if (name.equals("mn-1")){
			return this.om2mMn;
		} else {
			LOGGER.error("Unknown OM2M client");
			return null;
		}
	}
	
	public static int main(String[] args) {
		if (args[0] == null) {
			LOGGER.fatal("Usage : mvn exec:java -Dconfig=<path to configuration>");
			return 1;
		}
		Controler c = new Controler(args[0]);
		c.getClient("in").createAE("TEST-AE", null, "MOOC");
		return 0;
	}
}
