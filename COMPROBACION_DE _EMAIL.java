
import java.util.Scanner;


public class COMPROBACION_EMAIL {

    public static void main(String[] args) {
    
        
   
    /* EL PRIMER PASO ES PEDIR POR PANTALLA EL CORREO */

Scanner porPantalla = new Scanner(System.in); 

        System.out.print("Introduce tu email: ");
        String email = porPantalla.nextLine();

        System.out.println("Has escrito: " + email);

        porPantalla.close();
        
      
        
/* UNA VEZ TENEMOS EL CORREO VAMOS A ESPECIFICAR:
   QUÉ ES Y NO ES VÁLIDO */
        
    
int arroba = email.indexOf("@");
     
// ¿Tiene @?
if (arroba == -1) {
System.out.println("Error: falta la @");
}

// ¿La @ está al principio? (ej: "@gmail.com")
if (arroba == 0) {
System.out.println("Error: el correo no puede empezar por @");
}

// ¿Hay más de una @? (si la primera y la última coinciden, significa que solo hay una)
if (arroba != email.lastIndexOf("@")) {
System.out.println("Error: hay mas de una @");
 }
     

/* DIVIDIMOS EL CORREO EN DOS PARTES*/
String[] partesEmail = email.split("@");
String usuario = partesEmail[0]; // Todo lo que va antes del @
String dominio = partesEmail[1]; // Todo lo que va después del @

System.out.println("Usuario: " + usuario);
System.out.println("Dominio: " + dominio);
        

/* BUSCAMOS EL PUNTO EN LA PARTE IZQUIERDA DEL CORREO */

int puntoUsuario = partesEmail[0].indexOf(".");

// ¿Tiene "."?
if (puntoUsuario == -1) {
System.out.println("Error: falta el punto en el usuario");
}

// ¿El "." está al principio? (ej: ".vega@gmail.com")
if (puntoUsuario == 0) {
System.out.println("Error: el correo no puede empezar por punto");
}

// ¿Hay más de un "." en el usuario? (si el primero y el último coinciden, significa que solo hay uno)
if (puntoUsuario != partesEmail[0].lastIndexOf(".")) {
System.out.println("Error: hay mas de un punto en el usuario");
 }


/* SEPARAMOS EN DOS PARTES LAS DOS PALABRAS QUE CONTIENE EL USUARIO */

String[] partesUsuario = usuario.split("\\.");
String usuarioUno = partesUsuario[0]; /* Todo lo que va antes del "." */
String usuarioDos = partesUsuario[1]; /* Todo lo que va después del "." */



/* LAS DOS PALABRAS QUE CONTIENE EL USUARIO SOLO PUEDEN TENER CARÁCTERES DE LA A...Z 
(a excepción del "." que las separa) Y ADEMÁS PUEDEN ESTAR EN MÁYÚSCULA Y MINÚSCULA*/

if (usuarioUno.matches("[a-zA-Z]+")) {
            System.out.println("Primera palabra del usuario correcta");
} else {
  System.out.println("No es válida la primera palabra del usuario.");
    }

if (usuarioDos.matches("[a-zA-Z]+")) {
            System.out.println("Segunda palabra del usuario correcta");
    
}else {
    System.out.println("No es válida la segunda palabra del usuario.");
}

/* BUSCAMOS EL PUNTO EN LA PARTE DERECHA DEL CORREO (EN EL DOMINIO) */

int puntoDominio = partesEmail[1].indexOf(".");

// ¿Tiene "."?
if (puntoDominio == -1) {
System.out.println("Error: falta el punto en el dominio");
}

// ¿El "." está al principio? (ej: ".vega@gmail.com")
if (puntoDominio == 0) {
System.out.println("Error: el dominio no puede empezar por punto");
}

// ¿Hay más de un "." en el usuario? (si el primero y el último coinciden, significa que solo hay uno)
if (puntoDominio != partesEmail[1].lastIndexOf(".")) {
System.out.println("Error: hay mas de un punto en el dominio");
 }

/* SEPARAMOS EN DOS PARTES LAS DOS PALABRAS QUE CONTIENE EL DOMINIO */

String[] partesDominio = dominio.split("\\.");
String dominioUno = partesDominio[0]; /* Todo lo que va antes del "." */
String dominioDos = partesDominio[1]; /* Todo lo que va después del "." */


/* LA PRIMERA PALABRA DEL DOMINIO SOLO PUEDE TENER CARÁCTERES DE LA A...Z (sinergia y palcam)
Y ADEMÁS PUEDEN ESTAR EN MÁYÚSCULA Y MINÚSCULA*/

if (!dominioUno.matches("[a-zA-Z]+")) {
        System.out.println("ERROR: la primera palabra del dominio contiene carácteres erroneos");   
} 
        
else if (!dominioUno.equalsIgnoreCase("sinergia") && !dominioUno.equalsIgnoreCase("palcam")) {
  System.out.println("ERROR: la primera palabra del dominio es incorrecta.");
    
}else {
    System.out.println("Primera palabra del dominio correcta");
}

/* LA SEGUNDA PALABRA DEL DOMINIO SOLO PUEDE TENER CARÁCTERES DE LA A...Z (.cat , .es , .org , .com)
Y ADEMÁS PUEDEN ESTAR EN MÁYÚSCULA Y MINÚSCULA*/

if (!dominioDos.matches("[a-zA-Z]+")) {
        System.out.println("ERROR: la segunda palabra del dominio contiene carácteres erroneos");   
} 
        
else if (!dominioDos.equalsIgnoreCase("cat") && !dominioDos.equalsIgnoreCase("es") && !dominioDos.equalsIgnoreCase("org") 
        && !dominioDos.equalsIgnoreCase("com")) {
  System.out.println("ERROR: la segunda palabra del dominio es incorrecta.");
    
}else {
    System.out.println("Segunda palabra del dominio correcta");
}


    }
}