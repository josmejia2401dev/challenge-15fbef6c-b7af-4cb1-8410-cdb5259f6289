# Optimización de Desempeño en Aplicaciones con Redis y Memcached

El sistema de gestión de portafolio de inversiones necesita mejorar su desempeño para manejar un mayor volumen de solicitudes de clientes. La aplicación actual experimenta retrasos al procesar consultas de datos frecuentemente solicitadas. Es necesario implementar una solución de caché utilizando Redis o Memcached para reducir el tiempo de respuesta y mejorar la eficiencia del sistema.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Optimización de Desempeño con Caché: Redis y Memcached |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Análisis de Requisitos y Selección de Herramienta

**Objetivo:** Identificar los datos que se beneficiarán de la caché y seleccionar la herramienta adecuada (Redis o Memcached) para el caso de uso.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza las consultas de datos más frecuentes en el sistema de gestión de portafolio de inversiones.
- Identifica los datos que se pueden almacenar en caché para mejorar el desempeño.
- Evalúa las características y ventajas de Redis y Memcached para determinar cuál es la mejor opción para este caso de uso.

**Entregable:** Documento que describe los datos a almacenar en caché y la herramienta seleccionada con justificación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la tasa de cambio de los datos y la frecuencia de acceso al seleccionar la herramienta de caché.
- Piensa en la escalabilidad y la facilidad de integración con el sistema existente.

</details>

### Fase 2: Implementación de Caché

**Objetivo:** Implementar la solución de caché utilizando la herramienta seleccionada y validar su funcionamiento.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configura la herramienta de caché (Redis o Memcached) en el entorno de desarrollo.
- Implementa la lógica de caché en las consultas de datos seleccionadas para reducir el tiempo de respuesta.
- Realiza pruebas para validar que la caché está funcionando correctamente y mejorando el desempeño del sistema.

**Entregable:** Código implementado y pruebas que demuestran la mejora en el desempeño del sistema con la caché.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la política de expiración de los datos en caché para evitar inconsistencias.
- Piensa en cómo manejar los casos en los que los datos en caché no están disponibles.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una solución de caché y por qué se utiliza en sistemas de alta carga?
- **paraQueSirve**: ¿Para qué sirve implementar una solución de caché en el sistema de gestión de portafolio de inversiones?
- **comoSeUsa**: ¿Cómo se implementa la lógica de caché en las consultas de datos seleccionadas?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una solución de caché y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica seleccionar una herramienta de caché (Redis o Memcached) para este caso de uso?

## Criterios de Evaluacion

- Identificar los datos que se beneficiarán de la caché.
- Seleccionar la herramienta de caché adecuada para el caso de uso.
- Implementar la lógica de caché en las consultas de datos seleccionadas.
- Realizar pruebas para validar el funcionamiento de la caché y la mejora en el desempeño del sistema.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
