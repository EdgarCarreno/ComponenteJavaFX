### ComponenteJavaFX



### Test JavaFX

Primero de todo tenemos que añadir las librerias de 

una vez ya contamos con el componente completamente montado contando con su medolo, vista y controlador y todas las librerias instaladas lo siguiente que tenemos que hacer para tener un proyecto lo mas completo posible es hacer un testeo de su funcionalidad para ello debemos de primero de todo crear una carpeta a la cual tendremos que especificar que la utilizaremos para ese testeo, no tendremos problema con ello ya que el Intellij Idea te permite crearla sin problemas sabras que la has creado ya que resalta en verde

Una vez tengas la carpeta creas la clase que sera la encargada de realizar todas la pruebas necesarias, para que la clase pueda realizar la pruebas tendras primero de todo hacer que herede de ApplicationTest para que puedas utilizar el Junit5 y el testFX seguidamente tendras que añadir el metodo @Override start que es la encargada de instanciar el componente visual en un entorno controlado para poder realizar el testeo como si hubiera un usuario real detras

una vez hecho esto realizaremos los testeo para ello tendremos que añadir eventos de testeo que seran los encargados de simular ser ese usuario.
@Test --> Le indica a JUnit 5 que es una prueba que debe ejecutarse de forma independiente
clickOn --> Es una simulacion donde el TestFX mueve el cursor del ratón y hace clic físicamente
lookup("#circulo") --> localiza el componente para poder utilizarlo y identificar sus propiedades
verifyThat --> nos permite el comparar la realidad con la expectativa, en este caso nos permite comparar los valores reales con los simulados para poder recibir una confirmacion o un error
