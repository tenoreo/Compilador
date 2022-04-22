/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author kenda
 */
public class NewMain {

    public static void main(String[] args) throws Exception {
        String ruta1 = "K:/Trabajos/bases/Compiladores/src/main/java/codigo/Lexer.flex";
        String ruta2 = "K:/Trabajos/bases/Compiladores/src/main/java/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "K:/Trabajos/bases/Compiladores/src/main/java/codigo/Sintax.cup"};
        NewMain n=new NewMain();
        n.generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception,NullPointerException{
        try {
            File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("K:/Trabajos/bases/Compiladores/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("K:/Trabajos/bases/Compiladores/sym.java"), 
                Paths.get("K:/Trabajos/bases/Compiladores/src/codigo/sym.java")
        );
        Path rutaSin = Paths.get("K:/Trabajos/bases/Compiladores/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("K:/Trabajos/bases/Compiladores/AnalizadorLexico/Sintax.java"), 
                Paths.get("K:/Trabajos/bases/Compiladores/src/codigo/Sintax.java")
        );
        } catch (Exception e) {
            System.out.println("El error es: "+e);
        }
        
    }
    
}
