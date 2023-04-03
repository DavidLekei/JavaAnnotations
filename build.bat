cd src/main/java
javac com/davidlekei/JavaAnnotations/annotations/*.java
javac com/davidlekei/JavaAnnotations/processor/*.java
javac com/davidlekei/JavaAnnotations/*.java -processor com.davidlekei.JavaAnnotations.processor.SampleProcessor