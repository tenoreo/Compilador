/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java_cup.runtime.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author kenda
 */
public class Archivo {
    private File documento;
    private String nombre;
    private String info;
    private String tokens;
    
    private String consola;
    private String errores;
    private boolean error=false;
    /*
    *   @author Kendall Tenorio Chevez
    *   @param no tiene
    *   @return no muestra nada
    *   el constructor de la clase de archivo
    */
    public Archivo(){
        
    }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param document JFileChooser: el archivo que se busca en el buscador de archivo
    *   @return no devuelve nada
    *   convierte todo el documento que se manda en path a un string para poder leerlo en un string
    */
    public void setearDatos(JFileChooser documento){
        this.documento = documento.getSelectedFile();
        this.nombre=this.documento.getName();
        this.info=fileString(this.documento.getPath());
    }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param No tiene
    *   @return no devuelve nada
    *   Limpia los parametros de clases de error y consola e muestra la iniacion de compilacion.
    */
    public void limpiar(){
        this.error=false;
        this.errores="";
        this.consola="";
        this.consola+="Iniciacion de compilacion";
    }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param No tiene.
    *   @return no devuelve nada
    *   muestra si el resultado de todo fue con exito o tuvo errores
    */
    public void resultadoCompilacion(){
        if(!this.error){
            errores+="La compilacion fue exitosa";
        }else{
            this.errores+="La compilación no fue exitosa";
            
              
        }
    }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param document(el path del documento a leer)
    *   @return res String(el resultado de la lectura por el path enviado)
    *   convierte todo el documento que se manda en path a un string para poder leerlo en un string
    */
    public String fileString(String document){
        String res="";
        try {
            res=new String(Files.readAllBytes(Paths.get(document))); 
        } catch (IOException e) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
        }
        return res;
    }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param tipo String:
                columna int: la columna en la cual se encuentra el error
                linea int: la linea en la cual se encuentra el error
                valor Object: el objecto que tiene el error
    *   @return no devuelve nada
    *   Muestra que hay un error entonces la variable temporal de error pasa a verdadero
    *           y llena la variable de errores con el tipo,la columna, la linea y
    *           el valor del script que tiene el error
    */
    public void reportarError(String tipo, int columna, int linea, Object valor){
       this.error=true;
       this.errores += "Error "+tipo+ ":  "
               + " línea: " + linea +","
               + " columna: "+columna +","
               + " Valor: "+valor;
   }
    /*
    *   @author Kendall Tenorio Chevez
    *   @param ruta1 String:
                ruta2 String:
                listaRuta String[]:
    *   @return no devuelve nada
    *   Su funcion es generar 4 archivo los cuales son lexer.java,lexerCup.java,sintax.java y sym.java
    */
    public void generador(String ruta1,String ruta2,String[] listaRuta){
        File lexer=new File(ruta1);
        JFlex.Main.generate(lexer);
        File lexer2=new File(ruta2);
        JFlex.Main.generate(lexer2);
        try {
            java_cup.Main.main(listaRuta);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Path rutaSyms = Paths.get("K:/Trabajos/bases/Compiladores/src/main/java/codigo/sym.java");
        Path rutaSyntax = Paths.get("K:/Trabajos/bases/Compiladores/src/main/java/codigo/Sintax.java");
        if(Files.exists(rutaSyms)){
           try {
               Files.delete(rutaSyms);
           } catch (IOException ex) {
               Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        if(Files.exists(rutaSyntax)){
           try {
               Files.delete(rutaSyntax);
           } catch (IOException ex) {
               Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        try {
            Files.move(Paths.get(System.getProperty("user.dir")+ "/sym.java"), Paths.get("K:/Trabajos/bases/Compiladores/src/main/java/codigo/sym.java"));
            Files.move(Paths.get(System.getProperty("user.dir")+  "/Sintax.java"), Paths.get("K:/Trabajos/bases/Compiladores/src/main/java/codigo//Sintax.java"));
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.consola+="Se han generado los siguientes archivos:\n Lexer.java\n LexerCup.java\n Sintax.java\n sym.java\n"; 
    }
        /*
    *   @author Kendall Tenorio Chevez
    *   @param no tiene
    *   @return no devuelve nada
    *   Su funcion es reconocer los tokens decuerdo con el archivo creo previamente que es lexer.java
    */
    public void analizadorTokens(){
        try {
            Reader lector = new BufferedReader(new FileReader(this.documento.getPath()));
            Lexer lexer = new Lexer(lector);
            String res="";
            while(true){
                Tokens token = lexer.yylex();
                if(token==null){
                    this.tokens=res;
                    consola+= "Análisis léxico realizado";
                    return;
                }
                switch(token){
                    case ERROR:
                        res += "["+ lexer.lexemas +  "," +"Token no existe] \n";
                        break;
                    default:
                        res +="[" + lexer.lexemas +  ","+ token + "]\n";
                        break;
                }
            }  
        } catch (FileNotFoundException e) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
            this.consola+= "ERROR: El análisis léxico no se pudo realizar";
        }
    }
        /*
    *   @author Kendall Tenorio Chevez
    *   @param no tiene
    *   @return no devuelve nada
    *   Su funcion es generar un archivo txt el cual se encuentre todos los tokens que estaba en el archivo que se analizo
    */
    public void escribirArchivo(){
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("src/Compilados/tokens_"+ documento.getName().substring(0, documento.getName().lastIndexOf('.')) + ".txt" );
            myWriter.write(this.tokens);
            myWriter.close();
            this.consola+= "Se genero exitosamente el archivo con los tokens";
        } catch (IOException e) {
            this.consola+= "ERROR: No se pudo generar el archivo con los tokens  ";
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void analisisSintax(){
        try {
            Reader lector = new BufferedReader(new FileReader(this.documento.getPath()));
            Sintax sin = new Sintax(new Codigo.LexerCup(lector));
            try {
                sin.parse();
                consola+= "Análisis sintáctico realizado\n";
                resultadoCompilacion();
                consola += errores;
                
            } catch (Exception e) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
                consola+= "ERROR: Hubo un error en la sintasis";
            }
            
        } catch (FileNotFoundException e) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
            consola+= "ERROR: Análisis sintáctico no se pudo realizar";
        }
    }

    public File getDocumento() {
        return documento;
    }

    public void setDocumento(File documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getErrores() {
        return errores;
    }

    public void setErrores(String errores) {
        this.errores = errores;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
