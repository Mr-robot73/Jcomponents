![d](https://upload.wikimedia.org/wikipedia/commons/c/c9/Naruto_logo.svg)

---

## **Inicio rápido**

1.Descarguemos el archivo Jcomponents.jar,  habré tu editor de código preferido y arrastra el archivo que descargaste a la ecarpeta lib de tu proyecto.
> **[descargar el Jcomponents](https://github.com/Mr-robot73/Jcomponents/raw/main/Jcomponents.jar "descargar el Jcomponents")**

2.Para usar el Jcomponents importar las librerías

```java
  import components.*;
  import import com.toedter.calendar;
```

---

## **Uso de los componentes**

1.Los Componentes personalizados de swing:CmpTextField, CmpPasswordField y CmpButton tine los borde redondeados

```java
  CmpTextField Nombre_de_la_class = new CmpTextField();

  CmpPasswordField Nombre_de_la_class = new CmpPasswordField();

  CmpButton Nombre_de_la_class = new CmpButton();
```

  - Cambiar el color del borde

```java
Nombre_del_componente.setFondoColor(new Color(0, 133, 252));
```

  - Cambio el color del fondo

```java
Nombre_del_componente.setBordeColor(new Color(0, 133, 252));
```

2.JDateChooser: Librerías de Jcalendar

```java
  JDateChooser Nombre_de_la_class = new JDateChooser();
```
