Feature: Buscar curso en Sena Sofía plus

  Background:
    Given Que el usuario se encuentra en la pagina principal de sena Sofia plus
    Then El usuario podra ver el pop up
    And El usuario procedera a cerrarlo

  Scenario Outline: Buscar curso que se ofrecen el la ciudad de Ibague
    Then El usuario ingresara la <Ciudad> donde quiere estudiar
    And El usuario le dara click al button buscar
    Then El usuario podra ver los cursos ofertados en la ciudad que ingreso
    And El usuario seleccionara la primera oferta
    When El usuario vera la informacion de la oferta y dara click en la opcion Ver mas
    Then El usuario podra ver toda la informacion de la oferta

    Examples:
      | Ciudad |
      | Ibague |


