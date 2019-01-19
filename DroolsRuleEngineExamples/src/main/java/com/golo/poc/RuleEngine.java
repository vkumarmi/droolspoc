package com.golo.poc;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RuleEngine {
	public static void main(String[] args) {
		 KieServices ks = KieServices.Factory.get();
	     KieContainer kContainer = ks.getKieClasspathContainer();
	     KieSession kSession = kContainer.newKieSession("ksession-rules");
	}
	
}
