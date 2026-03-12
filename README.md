# TalentoHumano_Contratacion
Sistema de Gestión de Talento Humano – Flujo de Contratación   Proyecto académico CESDE (Momento 1 Backend). Implementación del módulo de contratación dentro del sistema de gestión de talento humano, incluyendo requerimientos, diagrama de clases, POJOs, y arquitectura en capas con Spring Boot.
Este repositorio corresponde al flujo de **Contratación** dentro del proyecto de Gestión de Talento Humano (Momento 1 Backend – CESDE). 
El objetivo es centralizar los procesos de contratación de empleados, integrando con los módulos de Nómina y Puestos.
## Funcionalidades
- Crear y gestionar contratos de empleados.
- Asociar contratos con puestos y nómina.
- Registrar fechas de inicio y fin de contrato.
- Gestionar renovaciones y terminaciones.
## Arquitectura
El proyecto sigue una arquitectura en capas:
- Dominio: Entidades y POJOs (`Empleado`, `Contrato`, `Puesto`, `Nomina`, `HistorialContrato`).
- Repository: Interfaces JPA para persistencia.
- Service: Lógica de negocio.
- Controller: Endpoints REST.
## Requerimientos
### Funcionales
- Crear, editar y eliminar contratos.
- Asociar contratos con empleados y puestos.
- Activar automáticamente al empleado en nómina al firmar contrato.

### No funcionales
- Seguridad en el almacenamiento de contratos.
- Disponibilidad mínima del 99%.
- Escalabilidad para múltiples contratos simultáneos.
## Instalación
1. Clonar el repositorio.
2. Configurar la base de datos MariaDB.
3. Ejecutar con `mvn spring-boot:run`.
## Ejecución
El servicio estará disponible en:
http://localhost:8080/contratos

## Equipo
- Líder Técnico: Simon
- Scrum Master: Camilo Phillips Jaramillo Mejia
- Desarrolladores:
- Angel
- Sebastian
- Gidardo

El servicio estará disponible en:
http://localhost:8080/contratos
