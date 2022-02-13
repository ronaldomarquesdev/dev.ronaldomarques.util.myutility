/**
 * DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
 * Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso e fruto
 * expressamente exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
 * Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software;
 * Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
 * tão pouco por qualquer possível reflexos ou consequência de tal utilização.
 * ---
 * RIGHTS, LICENSE AND DISCLAIMER:
 * This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
 * exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
 * This project has the sole purpose of demonstrating knowledge and skills in software development;
 * Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
 * neither for any possible reflexes or consequence of such use.
 */
package dev.ronaldomarques.util.myutility;

/**
 * @author Ronaldo Marques;
 * @since 20190501;
 * @last_change 20220213;
 * @product MyUtility;
 * @version 0.6.0-dev;
 * @project MY JAVA UTILITY PACK;
 * @category Class Lib;
 * @description My personal Java library implementations of small tools for
 *              general purpose, such as constants, properties, methods, data
 *              structure to be used as a library in other projects. My main
 *              objective is a demonstration of software development skills.;
 * @language JAVA 11;
 * @dev_environment Microsoft Windows 10, Adoptium Temurin OpenJDK11U, Eclipse
 *                  IDE Enterprise Java Web Developers v202103;
 * @analysis ...
 */
public abstract class MyUtility {

	public static final String authors() {

		/* FURTHER: Get the value in myutility.properties. */
		return "Ronaldo Marques at http://ronaldomarques.dev";

	}

	public static final String productName() {

		/* FURTHER: Get the value in myutility.properties. */
		return "MyUtility";

	}

	public static final String productVersion() {

		/* FURTHER: Get the value in myutility.properties. */
		return "0.6.0-dev+202202131508";

	}

	public static final String projectName() {

		/* FURTHER: Get the value in myutility.properties. */
		return "MY JAVA UTILITY PACK";

	}

	public static final String projectCategory() {

		/* FURTHER: Get the value in myutility.properties. */
		return "Class Lib";

	}

	public static final String projectDescription() {

		/* FURTHER: Get the value in myutility.properties. */
		return "My personal Java library implementations of small tools for general purpose, such as constants, properties, methods, data structure to be used as a library in other projects. My main objective is a demonstration of software development skills.";
	}

	public static final String contributors() {

		/* FURTHER: Get the value in myutility.properties. */
		return "---";

	}

	public static final String devEnvironment() {

		/* FURTHER: Get the value in myutility.properties. */
		return "\n" + " - Microsoft Windows 10,\n" + " - Adoptium Temurin OpenJDK11U,\n"
				+ " - Eclipse IDE Enterprise Java Web Developers v202103.";
	}

	public static final void selfPresentation() {

		System.out.printf("\n");
		System.out.printf("Product name: %s ;\n", productName());
		System.out.printf("Product version: %s ;\n", productVersion());
		System.out.printf("Project name: %s ;\n", projectName());
		System.out.printf("Project category: %s ;\n", projectCategory());
		System.out.printf("Project description: %s \n", projectDescription());
		System.out.printf("Authors: %s .\n", authors());
		System.out.printf("Contributors: %s .\n", contributors());
		System.out.printf("Develop Environment: %s \n", devEnvironment());
		System.out.printf("\n");

	}

}
