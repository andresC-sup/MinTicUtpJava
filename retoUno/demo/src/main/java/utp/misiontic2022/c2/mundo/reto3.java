SELECT ID_MaterialConstruccion  , nombre_material, precio_unidad
FROM materialconstruccion mc
WHERE importado ='Si'

SELECT ID_COMPRA, MC.nombre_material
FROM compra c join  materialconstruccion mc
    on c.id_materialcontruccion = mc.id_materialcontruccion and    c.proveedor = 'Homecenter' and c.cantidad < 2

SELECT id_materialcontruccion, avg(Precio_Unidad)
FROM materialconstruccion mc
group by importado

SELECT UPPER(SUBSTR(Nombre_Material,1,1)) || ' ' || LOWER(Importado)
FROM materialconstruccion mc

SELECT Importado  , SUM(Precio_Unidad)
FROM materialconstruccion mc
group by Importado   
HAVING sum(Precio_Unidad)>16000