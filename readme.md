# T.P. N°1 Diseño de Sistemas - RESTFul


# Descripción de las clases:

## ClienteRest:

   - Dato tipo Cliente: {"id": integer, "nombre": string, "cuil": integer}
  
   - Metodos:
      
      -  GET:  (/rest/cliente): Devuelve una lista con todos los clientes. Si se especifica un id (/id) al final de la ruta, devuelve solo el      cliente con dicho id.
      
      - POST: (/rest/cliente): Consume un dato tipo Cliente y lo agrega a la base de datos.
      
      - PUT: (/rest/cliente): Consume un dato tipo Cliente, y actualiza el Cliente en la base de datos que tenga el mismo id (/id).
      
      - DELETE: (/rest/cliente): Consume un dato tipo Cliente, y elimina el Cliente en la base de datos que tenga el mismo id (/id).
      
## ContactoRest:

   - Dato tipo Contacto: {"id": integer, "tipo": string, "valor": string, "actualidazo": timestamp , "id_cliente": integer}
  
   - Metodos:
      
      -  GET:  (/rest/contacto): Devuelve una lista con todos los contactos. Si se especifica un id (/id) al final de la ruta, devuelve solo el      contacto con dicho id.
      
      - POST: (/rest/contacto): Consume un dato tipo Contacto y lo agrega a la base de datos.
      
      - PUT: (/rest/contacto): Consume un dato tipo Contacto, y actualiza el Contacto en la base de datos que tenga el mismo id (/id).
      
      - DELETE: (/rest/contacto): Consume un dato tipo Contacto, y elimina el Contacto en la base de datos que tenga el mismo id (/id).
      
## CuentaRest:

   - Dato tipo Cuenta: {"id": integer, "numero": integer, "apertura": timestamp, "id_cliente": integer}
  
   - Metodos:
      
      -  GET:  (/rest/cuenta): Devuelve una lista con todas las cuentas. 
      
      - POST: (/rest/cuenta): Consume un dato tipo Cuenta y lo agrega a la base de datos.
      
      - PUT: (/rest/cuenta): Consume un dato tipo Cuenta, y actualiza la Cuenta en la base de datos que tenga el mismo id (/id).
      
      - DELETE: (/rest/cuenta): Consume un dato tipo Cuenta, y elimina la Cuenta en la base de datos que tenga el mismo id (/id).
      
## MovimientoRest:

   - Dato tipo Movimiento: {"id": integer, "creado": timestamp, "procesado": timestamp, "tipo": integer, "estado": integer, "importe": integer, "id_cuenta": integer}
  
   - Metodos:
      
      -  GET:  (/rest/movimiento): Devuelve una lista con todas los movimientos. En caso de especificarse un id (/id) al final de la ruta, devuelve los ultimos 10 movimientos de dicho id. 
      
      - POST: (/rest/movimiento): Consume un dato tipo Movimiento y lo agrega a la base de datos.
      
      - PUT: (/rest/movimiento): Consume un dato tipo Movimiento, y actualiza la Movimiento en la base de datos que tenga el mismo id (/id).
      
      - DELETE: (/rest/movimiento): Consume un dato tipo Movimiento, y elimina la Movimiento en la base de datos que tenga el mismo id (/id).
  





## Collaborators:
* **Morlax97** - [Github](https://github.com/Morlax97)
* **JoaquinLeonArg** - [Github](https://github.com/JoaquinLeonArg)
