# Ejecución del Proyecto 🚀

Este documento detalla los pasos necesarios para levantar y ejecutar la aplicación en un entorno de desarrollo local.

---

## 📋 Pre-requisitos

Antes de iniciar, asegurate de tener instalado en tu sistema:
* **Java JDK 17** o superior.
* **Node.js** (versión LTS recomendada).
* Tu base de datos local corriendo y configurada.

---

## 🚀 Pasos para Iniciar la Aplicación

Para desplegar el proyecto por completo, es necesario iniciar ambos servidores en terminales separadas.

### 1. Levantar el Backend (Spring Boot)

1. Abrí tu IDE (**IntelliJ IDEA**) y carga el proyecto desde la carpeta del backend.
2. Asegurate de revisar el archivo de propiedades (`src/main/resources/application.properties`) para verificar que las credenciales de tu base de datos local sean correctas.
3. Ejecutá la clase principal del proyecto desde el IDE o abrí una terminal en la raíz del backend y corré el siguiente comando:

```bash
 ./gradlew bootRun
```

### 2. Levantar el Frontend (React)

1. Abrí una nueva terminal en tu sistema.
2. Navegá hacia la carpeta del frontend:
```bash
  cd Front
```
3. Instalá las dependencias(solo la primera vez)
```bash 
   npm install
```

4. Iniciá el Frontend:
```bash 
   npm run dev
```
