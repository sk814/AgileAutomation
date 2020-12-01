package co7217.mu6.entity

/**
 * serialization of entities using explicit traversal: not used in exercises nor in slides
 */

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import co7217.mu6.entity.domainDSL.AbstractElement
import co7217.mu6.entity.domainDSL.DataType
import co7217.mu6.entity.domainDSL.DomainModel
import co7217.mu6.entity.domainDSL.Entity
import co7217.mu6.entity.domainDSL.Feature
import co7217.mu6.entity.domainDSL.Import
import co7217.mu6.entity.domainDSL.PackageDeclaration
import co7217.mu6.entity.domainDSL.Visibility

class EntityGenerator_ExplicitTraversal_Serialization {
	
	def static void main(String[] args) {
		// do this only once per application
		Injector injector = new DomainDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/mu6/example1.domain"), true);
		
		DomainModel model = resource.getContents().get(0)
		
		
		String text = ''
		
		text += processElements(model.elements)
		
		File output = new File('src/main/resources/output.domain')
		output.createNewFile()
		output << text
	}
	
	def static String processElements(List<AbstractElement> list) {
		String text = ''
		for (el in list) {
			text += processElement(el)
		}
		return text
	}
	
	def static String processElement(AbstractElement el) {
		String text = ''
		
		/**
		 * TODO: create your model to text transformation logic HERE.
		 * 
		 * Feel free to use all the facilities of the Groovy language.
		 * 
		 */
		
		return text
	}
	
}
