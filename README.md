### ComponenteJavaFX

Mi componente javaFX trata de un circulo el cual tu puede ir cambiandole el color al selecionar una de las tres opciones que te aparencen al la izquierda ademas el componente cuenta con una animacion simple la cual trata que el circulo se va desplazando de dereacha a izquierda consecutivamente hasta que el usuario cierre la aplicacion para crear este componente he utilizado la arquitectura de modelo, vista, controlador.

El modelo se trata de la clase circulo la cual se encarga de encapsular el diseño visual y su lógica en el componente circulo ademas de contar con una clase llamada eventoCambioColor la cual como su nombre indica es la encargada de definir un evento que permite a la aplicacion avisar a otras partes del código cuando el color del círculo ha cambiado siendo la encarga de que cuando el usuario decide cambiar de color el circulo este se actualize.

La vista son los archivos fxml que son los encargados de cargar los componentes y sus escenarios junto a sus diferentes propiedades en concreto este componente de JavaFX cuenta con dos de esos archivos los cuales son circulo.fxml y testComponente.fxml

circulo.fxml --> es el encargado de mostrarnos tanto el circulo como los tres botones con los cuales el usuario podra cambiar de color el circulo siendo tambien la encargada de enviar una señal al controlador cada vez que el usuario selecciona un color diferente, para que el círculo se actualice visualmente, ademas en el circulo.fxml  especificamos tanto el tamaño del circulo el de los botones ademas de sus posiciones.

testComponente.fxml --> es el fxml principal ya que es el contenedor principal donde mostraremos todos los componentes.

El controlador 

### Test JavaFX

Primero de todo tenemos que añadir las librerias de Junit5 ademas de la de testFX y Hamcrest para poder realizar el testeo y garantizar la integridad del componente antes de su empaquetado final permitiendonos simular un entorno donde poder realizar todas la pruebas especificadas en la clase test.

una vez ya contamos con el componente completamente montado contando con su medolo, vista y controlador y todas las librerias instaladas lo siguiente que tenemos que hacer para tener un proyecto lo mas completo posible es hacer un testeo de su funcionalidad para ello debemos de primero de todo crear una carpeta a la cual tendremos que especificar que la utilizaremos para ese testeo, no tendremos problema con ello ya que el Intellij Idea te permite crearla sin problemas sabras que la has creado ya que resalta en verde.

Una vez tengas la carpeta creas la clase que sera la encargada de realizar todas la pruebas necesarias, para que la clase pueda realizar la pruebas tendras primero de todo hacer que herede de ApplicationTest para que puedas utilizar el Junit5, el testFX y Hamcrest seguidamente tendras que añadir el metodo @Override start que es la encargada de instanciar el componente visual en un entorno controlado para poder realizar el testeo como si hubiera un usuario real detras.

una vez hecho esto realizaremos los testeo para ello tendremos que añadir eventos de testeo que seran los encargados de simular ser ese usuario.
@Test --> Le indica a JUnit 5 que es una prueba que debe ejecutarse de forma independiente.
clickOn --> Es una simulacion donde el TestFX mueve el cursor del ratón y hace clic físicamente.
lookup("#circulo") --> localiza el componente para poder utilizarlo y identificar sus propiedades.
verifyThat --> nos permite el comparar la realidad con la expectativa, en este caso nos permite comparar los valores reales con los simulados para poder recibir una confirmacion o un error.
