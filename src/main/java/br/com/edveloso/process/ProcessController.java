package br.com.edveloso.process;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.edveloso.modelo.Revisao;


@Controller
@RequestMapping(ProcessController.PROCESSO)
public class ProcessController {

	public static final String PROCESSO = "/processo";
	public static final String EXECUTE = "/execute";
	
	@RequestMapping(EXECUTE)
	public String execute(Model model){
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("sample.bpmn"), ResourceType.BPMN2);
		KnowledgeBase kbase = kbuilder.newKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.startProcess("Process_1");
		ksession.dispose();
		model.addAttribute("sample", new Revisao("revision 1"));
		return "home";
	}
	
	
}
