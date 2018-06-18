
package cz.habarta.typescript.generator;


public enum TypeScriptFileType {

    declarationFile, implementationFile, declarationDirectory, implementationDirectory;

    public boolean isDeclaration() {
    	return this == declarationFile || this == TypeScriptFileType.declarationDirectory;
    }

    public boolean isImplementation() {
    	return !isDeclaration();
    }

    public boolean isDirectory() {
    	return this == declarationDirectory || this == TypeScriptFileType.implementationDirectory;
    }
}
