package com.davidlekei.JavaAnnotations.processor;

import com.davidlekei.JavaAnnotations.annotations.EnhancementRequest;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.HashSet;
import java.util.Set;

public class SampleProcessor implements Processor
{

	public SampleProcessor()
	{

	}

	@Override
	public Set<String> getSupportedOptions() {
		Set<String> options = new HashSet<>();
		return options;
	}

	@Override
	public Set<String> getSupportedAnnotationTypes() {

		Set<String> annotations = new HashSet<>();
		annotations.add("com.davidlekei.JavaAnnotations.annotations.FileInformation");
		annotations.add("com.davidlekei.JavaAnnotations.annotations.EnhancementRequest");

		return annotations;
	}

	@Override
	public SourceVersion getSupportedSourceVersion()
	{
		return SourceVersion.RELEASE_17;
	}

	@Override
	public void init(ProcessingEnvironment processingEnv) {
	}


	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

		String annotationName;

		System.out.println("\nProcessing Annotations: \n\n");

		for(TypeElement annotation : annotations)
		{
			System.out.println("Searching for Annotation: " + annotation.getSimpleName());
			Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
			System.out.println("These elements were annotated:\n" + annotatedElements);


			for(Element e : annotatedElements)
			{
				annotationName = annotation.getSimpleName().toString();
				if(annotationName.equals("EnhancementRequest"))
				{
					EnhancementRequest er = e.getAnnotation(EnhancementRequest.class);
					System.out.println("Engineer: " + er.engineer());
				}

			}


		}

		return false;
	}

	@Override
	public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
		return null;
	}

	public void createEnhancementRequest(TypeElement annotation)
	{

//		for(Element element : annotation.getEnclosedElements())
//		{
//			System.out.println(element);
//			TypeMirror mirror = element.asType();
//			TypeKind kind = mirror.getKind();
//			kind.
//		}
	}
}
