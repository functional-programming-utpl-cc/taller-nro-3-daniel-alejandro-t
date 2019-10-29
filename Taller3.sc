import scala.io.Source

val rutaAbsoluta = "/home/daniel/MEGA/UTPL/3ciclo/Programacion-funcional-reactiva/Repos/taller-nro-3-daniel-alejandro-t/data/GLigaPro_2019.csv"
val lines = Source.fromFile(rutaAbsoluta).getLines.drop(1).toList

val data = lines.map(
  line => line.split(";") match {
    case Array(a, b, c, d, e) => (a.trim, b.trim, c.trim, d.trim.toInt, e.trim)
  })

// Presente en orden alfabético el nombre de los jugadores con más de 10 goles.
val juegadoresOrdenadosMas10 = data.sorted.filter(_._4 > 10)
// Presente el nombre de los jugadores con mas de 10 goles, esta vez ordenados de forma descendente por el número de goles marcados. Consulte sobre la función sortBy.
val juegadoresOrdenadosMas10Desendente = data.sorted.filter(_._4 > 10).reverse
// ¿A qué club pertenece el máximo goleador del campeonato?
val clubMaxGoleador = data.maxBy(_._4)._2
// ¿Cuál es la nacionalidad del máximo goleador del campeonato?
val nacionalidadMaxGoleador = data.maxBy(_._4)._3
// ¿Cuáles son los nombres de los jugadores que han marcado un autogol?
val nombresJugadoresAutogol = data.filter(_._5.contains("Sí"))
// ¿Cuál es la frecuencia de los goles marcados? (Cuántos jugadores tienen 1 gol, 2 goles, 3 goles, 4, goles, etc). Consultar groupBy y mapValues.
val frecuenciaGoles = data.groupBy(_._4)
//  ¿Cuáles son los nombres de los jugadores que han marcado goles en más de un club?
val nombresJugaGolesMasClub = data.map(  )
//  ¿Cuáles son las nacionalidades y su frecuencia (número de veces que se repite) de los jugadores que han marcado más de 9?
val nacionalidadFrecuencia = data.groupBy(_._3)
