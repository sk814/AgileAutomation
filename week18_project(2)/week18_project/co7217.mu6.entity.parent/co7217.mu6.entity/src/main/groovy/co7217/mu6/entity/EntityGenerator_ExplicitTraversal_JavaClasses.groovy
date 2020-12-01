package co7217.mu6.entity

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


/**
 * 
 * Generation of java classes from entities in different files: used in slides
 *
 */

class EntityGenerator_ExplicitTraversal_JavaClasses {
	
//	def static void main(String[] args) {
//		
//		// do this only once per application
//		Injector injector = new DomainDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
//		
//		// obtain a resourceset from the injector
//		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//		
//		// load a resource by URI, in this case from the file system
//		Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/mu6/example1.domain"), true);
//		
//		// get the root object
//		DomainModel model = resource.getContents().get(0)
//		
//		// generate code
//		String text = generateCode(model.elements)
//		
//		println(text)
//		
//		// persist code in a file
//		File output = new File('src/main/resources/output.java')
//		output.createNewFile()
//		output << text
//		
//	}
//	
	
	def static void main(String[] args) {
		
		// do this only once per application
		Injector injector = new DomainDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/mu6/example2.domain"), true);
		
		// get the root object
		DomainModel model = resource.getContents().get(0)
		
		for (element in model.elements) {
			// it only compiles entities that are declared without a package
			if (element instanceof Entity) {
				// generate code
				String text = compileEntity(element)
						
				println(text)
				
				// persist code in a file
				File output = new File("src/main/resources/${element.name.capitalize()}.java")
				output.createNewFile()
				output << text
			} 
		}
		
	}
	
	def static String generateCode(List<AbstractElement> list) {
		String text = ''
		for (el in list) {
			text += generateCode(el)
		}
		return text
	}
	
	def static String generateCode(AbstractElement el) {
		String text = ''
		switch(el) {
			case PackageDeclaration :
				text += generateCode(el.elements)
				break
				
			case DataType :
				// not implemented yet
				break
				
			case Entity :
				text += compileEntity(el)
				break
				
			case Import :
				// not implemented yet
				break
		}
		
		return text
	}
	
	def static compileEntity(Entity e) {
"""
${(e.eContainer() instanceof PackageDeclaration) ? 'package ' + ((PackageDeclaration) e.eContainer()).name.uncapitalize() + ';' : ''}

public class ${e.name} ${e.superType != null ? 'extends ' + e.superType.name : ''} {
	${e.features.collect { compileFeature(it) }.join('')}
}
"""
	}
	
	def static compileFeature(Feature f) {
"""		
	private ${f.type.name} ${f.name};
	
	public ${f.type.name} get${f.name.capitalize()}() {
		return ${f.name};
	}
	
	public void set${f.name.capitalize()}(${f.type.name} ${f.name}) {
		this.${f.name} = ${f.name};
	}
"""
	}
	
}
