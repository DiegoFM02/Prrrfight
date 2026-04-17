# Prrrfight 🐾⚔️

**Prrrfight** es un videojuego de estrategia táctica por turnos (TRPG) con ambientación medieval, donde los valientes protagonistas son gatos guerreros. Desarrollado en **Unity**, diseñado específicamente para dispositivos móviles con una orientación vertical.

---

## 🎮 Resumen del Juego
- **Plataforma:** Android / iOS (Vertical).
- **Género:** Tactical RPG (TRPG).
- **Motor:** Unity 2022+.
- **Estilo Visual:** Sprites 2D animados.

## 📋 Mecánicas Principales
* **Tablero Táctico:** Movimiento basado en casillas con diferentes alcances según la clase.
* **Sistema de Turnos:** Orden estratégico para ejecutar ataques y habilidades.
* **Menú Dinámico:** Pantalla principal animada con los guerreros felinos.

---

## 🐈 Clases de Guerreros

* **🛡️ Tanque (Tank)**
    * **Estética:** Pelaje café o negro, caracterizado por un pequeño casco.
    * **Vida:** 20-22 PS (Alta).
    * **Movilidad:** Corta (2 casillas ortogonales / 1 diagonal).
    * **Rol:** Primera línea de batalla y mitigación de daño.

* **🕊️ Clérigo (Healer)**
    * **Estética:** Gato blanco (liso, atigrado o moteado) con indumentaria religiosa.
    * **Vida:** 16 PS (Media).
    * **Movilidad:** Corta (2 casillas ortogonales / 1 diagonal).
    * **Rol:** Curación y potenciamiento (buffs) de aliados.

* **💢 Luchador (Berserk)**
    * **Estética:** Tono rojizo con rasgos distintivos como cicatrices o espadas de madera.
    * **Vida:** 18 PS (Media).
    * **Movilidad:** Media (3 casillas ortogonales / 2 diagonales).
    * **Rol:** Peleador cuerpo a cuerpo de gran impacto.

* **🏹 Tirador (Archer)**
    * **Estética:** Color verdoso o gris atigrado con accesorios de arquero clásico.
    * **Vida:** 12 PS (Baja).
    * **Movilidad:** Alta (4 casillas ortogonales / 2 diagonales).
    * **Rol:** Ataque a distancia y control desde la retaguardia.

---

## 🔥 Habilidades por Clase

### Tanque (Tank)
* **Valor de lucha:** Obtiene un escudo de 1 PS (Costo 0).
* **Fuerza de lucha:** Siguiente ataque básico +2 PS y empuja al objetivo una casilla.

### Clérigo (Healer)
* **Bendición:** Cura 2 PS a cualquier unidad (Costo bajo).
* **Escudo de fe:** Reduce el daño recibido en un 50% (Costo medio).
* **Ruega por nosotros:** Cura 5 PS, pero queda inhabilitado por 2 turnos (Costo alto).

### Luchador (Berserk)
* **Fuerza:** Siguiente golpe potenciado a 3 PS (Costo bajo).
* **Desgarrar:** Quita 5 PS y aplica *Sangrado* (-1 PS al siguiente turno).
* **Multi-puño:** 4 golpes de 1 PS en direcciones cardinales y retrocede 2 casillas.

### Tirador (Archer)
* **Mil flechas:** Quita 1 PS a todos los enemigos en el mapa.
* **Coyeye:** Golpe cuerpo a cuerpo (1 PS) y corre 4 casillas en cualquier dirección.
* **Super flecha:** 6 PS de daño e ignora escudos (Costo muy alto).
* **Resortera:** Proyectil en línea recta que impacta al primer objetivo (2 PS).

## 🎨 Mockups 
### Menú Principal
Diseñado para ofrecer una entrada rápida a la acción, priorizando el arte visual de las unidades.
* **Encabezado:** Banner rústico de madera con el título dinámico del juego.
* **Acciones Principales:** Botonera simplificada que incluye el acceso directo al combate y el panel de configuración, evitando la saturación de opciones.
<img width="1664" height="2574" alt="Menu de inicio" src="https://github.com/user-attachments/assets/b0114fe1-c2e6-4664-9033-fd974d766fc2" />


### Perfil del Héroe
Panel detallado que aparece al seleccionar una unidad, proporcionando toda la información necesaria para la estrategia antes del despliegue.
* **Identidad:** Visualización del nombre de la unidad, clase (Iconografía) y nivel.
* **Matriz de Estadísticas:** Grilla de 2x2 que muestra de forma iconográfica los atributos base: Vida (PS), Ataque, Movimiento y Defensa.
* **Desglose de Habilidades:** Listado vertical que detalla el efecto de cada habilidad y su costo de ejecución, facilitando la comprensión de los roles (ej. el Tanque como mitigador de daño).
<img width="1664" height="2574" alt="Detalles personajes" src="https://github.com/user-attachments/assets/74e22413-cde6-4a60-b576-980e128a6e6e" />


### Panel de Ajustes
Una ventana emergente (pop-up) con efecto de desenfoque de fondo para no perder el contexto del juego.
* **Controles Temáticos:** Deslizadores (sliders) de volumen que utilizan huellas de gato como indicadores de posición.
* **Gestión de Sonido:** Separación de canales para música de ambiente y efectos de sonido (SFX), permitiendo una personalización completa de la experiencia auditiva.
<img width="1664" height="2574" alt="Ajustes" src="https://github.com/user-attachments/assets/a7e787a5-d8ec-4a06-bb4c-c9877670b773" />


### 🛠️ Especificaciones Técnicas del Diseño
* **Relación de Aspecto:** 9:16 (Optimizado para dispositivos móviles modernos).
* **Paleta de Colores:** Tonos tierra, maderas oscuras y colores vibrantes para indicadores de vida y habilidades.
* **Tipografía:** Estilo Pixel/Fantasy para coherencia con el género TRPG.


## Ultima actualizacion 
* **Se implemento el menu principal con sus respectivos botones que nos da 2 opciones**
<img width="993" height="735" alt="Captura de pantalla 2026-04-17 052314" src="https://github.com/user-attachments/assets/90fb484b-7f4e-4a58-99be-052481967db2" />
* **El primer botón es para inciar la partida.**
* **La segunda opción es para que el usuario pueda personalizar su experiencia en la aplicación.**
* <img width="790" height="665" alt="image" src="https://github.com/user-attachments/assets/71d9311f-8d19-4609-8ffa-32d523fd3eaa" />








