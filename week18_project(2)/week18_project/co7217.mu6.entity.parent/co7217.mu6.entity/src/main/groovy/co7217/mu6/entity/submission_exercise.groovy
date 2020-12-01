package co7217.mu6.entity

/**
 * Serialization of entities using the DSL: used in slides
 */
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
//import org.eclipse.xtextToPrint.resource.XtextToPrintResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Injector

import co7217.mu6.entity.domainDSL.AbstractElement
import co7217.mu6.entity.domainDSL.DataType
import co7217.mu6.entity.domainDSL.DomainModel
import co7217.mu6.entity.domainDSL.Entity
import co7217.mu6.entity.domainDSL.Feature
import co7217.mu6.entity.domainDSL.Import
import co7217.mu6.entity.domainDSL.PackageDeclaration
import submission_helper.SubmissionHelper

//import co7217.mu6.entity.domainDSL.Feature
//import co7217.mu6.entity.domainDSL.Import
//import co7217.mu6.entity.domainDSL.PackageDeclaration
//import submission_helper.SubmissionHelper

class submission_exercise {

	def static void main(String[] args) {
		def path1 = 'src/main/resources/mu6/example1.domain'
		println (solution(path1))

		def path2 = 'src/main/resources/mu6/example2.domain'
		println (solution(path2))

		//todo
		SubmissionHelper.check_solution('rkp14', 'week_8', solution);
	}

	def static solution = { path ->
		String  textToPrint = ''

		Injector injector = new DomainDSLStandaloneSetup().createInjectorAndDoEMFRegistration();


		XtextToPrintResourceSet resourceSet = injector.getInstance(XtextToPrintResourceSet.class);


		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);

		DomainModel model = resource.getContents().get(0)



		textToPrint += traverse(model)

		textToPrint
	}

	def static String traverse(List<EObject> list) {
		String textToPrint = ''
		for (eobj in list) {
			textToPrint += traverse(eobj)
		}
		textToPrint
	}

	def static String traverse(EObject eobj) {
		String textToPrint = ''

		switch(eobj) {
			case DomainModel :
				textToPrint += traverse(eobj.elements)
				break

			case PackageDeclaration :
				textToPrint += codeGenerate(eobj)
				break

			case DataType :
				textToPrint += codeGenerate(eobj)
				break

			case Feature :
				textToPrint += codeGenerate(eobj)
				break

			case Entity :
				textToPrint += compileEntity(eobj)
				break

			case Import :
				textToPrint += codeGenerate(eobj)
				break
		}

		textToPrint
	}

	def static codeGenerate(EObject eobj) {
		String textToPrint = ''
		switch(eobj) {
			case PackageDeclaration :
				textToPrint += "";
				textToPrint += traverse(eobj.elements)
				break

			case DataType :
				break

			case Entity :
				textToPrint += """
					entity ${eobj.name} ${processExtends(eobj)} {
					${processFeatures(eobj)}
					}
"""
				break
		}

		textToPrint
	}



	def static processFeatures(Entity e) {
		String textToPrint = ''

		for (f in e.features) {
			textToPrint += processFeature(f)
		}

		textToPrint
	}


	def static processExtends(Entity e) {
		String textToPrint = ''

		if (e.superType != null) {
			textToPrint += """extends ${e.superType.name}"""
		}

		textToPrint
	}






	def static processFeature(Feature f) {
		String textToPrint = '';

		textToPrint+= """  ${f.modifier}${f.many?' many':''} ${f.name} : ${f.type.name}
"""

		textToPrint
	}

	def static String processElements(List<AbstractElement> list) {
		String textToPrint = ''
		for (el in list) {
			textToPrint += processElement(el)
		}
		return textToPrint
	}

	def static String processElement(AbstractElement absEle) {
		String textToPrint = ''

		switch(absEle) {
			case PackageDeclaration :
				println('PackageDeclaration')
				textToPrint += """package ${absEle.name} {
  ${processElements(absEle.elements)}
}
"""
				break



			case Entity :
				textToPrint +=
				"""
					entity ${absEle.name} ${processExtends(absEle)} {
					${processFeatures(absEle)}
					}
"""
				break

			case Import :
				textToPrint += """import ${absEle.importedNamespace}
"""
				break

			case DataType :
				textToPrint += """datatype ${absEle.name}
"""
				break
		}

		println(textToPrint)
		return textToPrint
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
//}		

	}
}
