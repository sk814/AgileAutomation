package co7217.mu6.entity

/**
 * Serialization of entities using the DSL: used in slides
 */
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import co7217.mu6.entity.domainDSL.DataType
import co7217.mu6.entity.domainDSL.DomainModel
import co7217.mu6.entity.domainDSL.Entity
import co7217.mu6.entity.domainDSL.Feature
import co7217.mu6.entity.domainDSL.Import
import co7217.mu6.entity.domainDSL.PackageDeclaration
import submission_helper.SubmissionHelper

class submission_exercise {
	
	def static void main(String[] args) {
		/** EXAMPLE 1 */
		def path1 = 'src/main/resources/mu6/example1.domain'
		println (solution(path1))

		/** EXAMPLE 1 */
		def path2 = 'src/main/resources/mu6/example2.domain'
		println (solution(path2))
		
		/**
		 * TODO: update your username
		 */
		SubmissionHelper.check_solution('ab123', 'week_8', solution);
	}
	
	def static solution = { path ->
		String text = ''
		
		// do this only once per application
		Injector injector = new DomainDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
		
		DomainModel model = resource.getContents().get(0)
		
		
		text += traverse(model)
		
		println(text)
		
		text
	}
	
	def static String traverse(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += traverse(obj)
		}
		text
	} 
	
	def static String traverse(EObject obj) {
		String text = ''
		
		switch(obj) {
			case DomainModel : 
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			case PackageDeclaration :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			case DataType :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			case Entity :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			/** 
			 * TODO: add any cases that may be missing here
			 */
		}
		
		text
	}
	
	def static generate(EObject obj) {
		String text = ''
		switch(obj) {
			case PackageDeclaration :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			case DataType :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			case Entity :
				/** 
				 * TODO: write any code that may be missing here
				 */
				break
				
			/** 
			 * TODO: add any cases that may be missing here
			 */
		}
		
		text
	}
	
}
