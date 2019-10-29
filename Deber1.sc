// promedios
val masGoles = results.map(_._2).max
val minGoles = results.map(_._2).min

// El promedio de goles
val promedioGoles = results.map(_._2).sum / results.length

// El nombre del juegador con mas goles
val jugadorMasGoles = results.filter(_._2 > masGoles)

// El nombre del juegador con menos goles
val jugadorMasGoles = results.filter(_._2 > minGoles)

// Una lista con los nombres de los jugadores, cuyo num de goles sea mayor al promedio
val jugadoresMenorPromedio = results.filter(_._2 < promedioGoles)

// """""""""", cuyo num de goles sea menor que el promedio
val jugadoresMayorPromedio = results.filter(_._2 > promedioGoles)