Interfaces y su funcionalidad dentro del proyecto. 

Interfaz DriverManager
    La interfaz DriverManager proporciona una abstracción para gestionar la instancia de WebDriver 
    Esta interfaz está diseñada para simplificar la creación y gestión del WebDriver, facilitando su reutilización y 
    centralización en un único punto.
    


Interfaz ExplicitWait
    ExplicitWait es una interfaz que extiende DriverManager y proporciona una funcionalidad para esperar explícitamente 
    hasta que un elemento web esté presente en el DOM utilizando un localizador XPath.



Interfaz Clickable
    La interfaz Clickable extiende la interfaz ExplicitWait y proporciona una funcionalidad adicional para realizar 
    click en elementos web. 
    Esta interfaz está diseñada para simplificar las interacciones con elementos web, combinando la espera explícita 
    hasta que el elemento esté presente con la acción de click en un solo método.



Interfaz GetAllItems
    La interfaz GetAllItems extiende la interfaz DriverManager y proporciona un método para obtener el texto de todos los 
    elementos web que coincidan con un selector CSS específico. 
    Este método facilita la recopilación de datos de múltiples elementos en una página web, centralizando la lógica para 
    encontrar y extraer el texto de estos elementos.



Interfaz GetAllOptionsFromSelect
    La interfaz GetAllOptionsFromSelect extiende la funcionalidad de ExplicitWait para proporcionar un método que obtiene
    todas las opciones disponibles en un elemento de selección (dropdown) en una página web. 
    Esta interfaz está diseñada para facilitar la extracción de los valores de texto de todas las opciones de un dropdown, 
    utilizando un localizador XPath.



Interfaz GetElementText
    La interfaz GetElementText extiende la funcionalidad de la interfaz ExplicitWait y proporciona un método para obtener 
    el texto de un elemento web ubicado mediante un localizador XPath.



Interfaz GetSrcAttribute
    La interfaz GetSrcAttribute extiende la funcionalidad de la interfaz ExplicitWait para proporcionar un método 
    específico que obtiene el valor del atributo src de un elemento web. 



Interfaz SelectByIndex
    La interfaz SelectByIndex extiende la funcionalidad proporcionada por ExplicitWait para interactuar con elementos
    HTML <select>, permitiendo la selección de opciones en listas desplegables basadas en su índice. 



Interfaz SelectByValue
    La interfaz SelectByValue extiende la funcionalidad proporcionada por ExplicitWait para interactuar con elementos
    HTML <select>, permitiendo la selección de opciones en listas desplegables basadas en su Value. 



Interfaz SetUpBrowser
    La interfaz SetUpBrowser extiende la interfaz DriverManager y proporciona un método adicional para navegar a una URL
    específica en el navegador controlado por el WebDriver.



Interfaz Typeable
    La interfaz Typeable extiende la interfaz ExplicitWait y proporciona un método para escribir texto en un elemento 
    web identificado por un localizador.